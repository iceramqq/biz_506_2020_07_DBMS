-- ����� USER2 ȭ���Դϴ�
CREATE TABLE tbl_����(
    �й� CHAR(5),
    ����� nVARCHAR2(20),
    ���� NUMBER
);

SELECT * FROM tbl_����;

-- ǥ�� SQL �̿��� PIVOT
-- 1. � Į���� ����Į������ �Ұ��ΰ� : �й�Į���� �������� ��´�.
--      ���� Į���� ���ؼ� GROUP BY�� ����
-- 2. �Į���� GROUP BY�� ������ �ϰ� �Ǹ� ���� Į����
--      ����Լ��� ���ΰų�, �ƴϸ� GROUP BY�� Į���� �������־�� �Ѵ�.

-- ������ SUM �Լ��� �����ִ� ������ ���
--      �й��� GROUP BY�� ��� ������ ����� �й��� 1���� ���̵��� �ϱ� ����
--      ���Ǵ� �� ������ ������ SUM() �����ش�.
--      ���� ���̺� �������� �й�+������ ������ ��ü �����Ϳ��� 1���� ���ڵ常 �����Ѵ�.
--      ���� SUM()�Լ��� ���� �ջ��� �ϴ� �뵵�� �ƴ϶�, 
--        �ܼ��� GROUP BY�� ����Ҽ� �յ��� �ϴ� �뵵�� ���̴�.
SELECT �й�,
        SUM(CASE WHEN ����� = '����' THEN ���� ELSE 0 END) AS ����,
        SUM(CASE WHEN ����� = '����' THEN ���� ELSE 0 END) AS ����,
        SUM(CASE WHEN ����� = '����' THEN ���� ELSE 0 END) AS ����
FROM tbl_����
GROUP BY  �й�;


-- ����Ŭ�� DECODE() �Լ��� �̿��ؼ�
SELECT �й�,
    SUM(DECODE(�����,'����',����,0)) AS ����,
    SUM(DECODE(�����,'����',����,0)) AS ����,
    SUM(DECODE(�����,'����',����,0)) AS ����
FROM tbl_����
GROUP BY �й�;


-- ����Ŭ 11g ���� �����ϴ� PIVOT ����� ����ϴ� ���\
-- PIVOT() : Ư���� Į���� �������� �����͸� PIVOT View  ��Ÿ ���� ���� �Լ�
-- PIVOT( sum(��) ) : PIVOT���� ������ �����Ͱ��� ����ִ� Į���� sum()���� ��� ǥ��
-- FOR Į�� (Į������) : 'Į��'�� 'Į����'���� ����(COLUMN)���⳪���Ͽ� ����Į������ �����
SELECT �й�,����,����,����
FROM tbl_����
PIVOT( 
    SUM(����)
    FOR ����� IN ('����' AS ����,'����' AS ����,'����' AS ����) 
)  ����;

CREATE TABLE tbl_�л����� (
    �й� CHAR(5) PRIMARY KEY,
    �л��̸� nVARCHAR2(30) NOT NULL,
    ��ȭ��ȣ VARCHAR2(20),
    �ּ� nVARCHAR2(125),
    �г� NUMBER,
    �а� CHAR(3)
);

SELECT * FROM tbl_�л�����;


-- �й� Į������ ����ߴµ�
--      �� Į���� � table�� �ִ� Į������ �𸣰ڴ�
-- JOIN�� �����Ͽ� �ټ��� table�� Relation�Ǿ�����
--      �ټ��� table�� ���� �̸��� Į���� ������ �߻��ϴ� ����
-- �������� �ۼ��Ҷ��� Į���� prefix�� �ٿ��� �̷� ������ ������
--      ���� ������Ʈ���� �������̺� DOMAIN ����(���� ������ ��� Į��)�� ������
--      prefix�� �����ϴ� ��쵵 ����.
--      �̶��� �Ʒ� ������ �ſ� ���� ���ϰ� �ȴ�.
-- ORA-00918: column ambiguously defined
-- 00918. 00000 -  "column ambiguously defined"

-- �� ������ �����ϱ� ���� 2�� �̻��� table�� JOIN�Ҷ��� TABlE�� Alias�� �����ϰ�
--      AS.Į�� �������� � Table�� Į������ ��Ȯ�� ������ ���־�� ���� ����.
-- JOIN, SUBQUERY�� ���鶧 �Ѱ��� ���̺��� ������ ����� ��� �ݵ�� Alias�� �����ϰ�
--      ��Ȯ�� Į���� ������ �־�� �Ѵ�.

-- ����Լ��� ������ ���� Į���� �ݵ�� GROUP BY�� ���
SELECT SC.�й�,ST.�л��̸�,ST.��ȭ��ȣ,
    SUM(DECODE(SC.�����,'����',SC.����,0)) AS ����,
    SUM(DECODE(SC.�����,'����',SC.����,0)) AS ����,
    SUM(DECODE(SC.�����,'����',SC.����,0)) AS ����
FROM tbl_���� SC
    LEFT JOIN tbl_�л����� ST
        ON ST.�й� = sc.�й�
GROUP BY SC.�й�,ST.�л��̸�,ST.��ȭ��ȣ ;

CREATE VIEW view_����PIVOT
AS
(
    SELECT �й�,����,����,����
        FROM tbl_����
        PIVOT( 
            SUM(����)
            FOR ����� IN ('����' AS ����,'����' AS ����,'����' AS ����) 
     )
);

SELECT * FROM view_����PIVOT;

SELECT SC.�й�, ST.�л��̸�,SC.����, SC.����, SC.����
FROM view_����PIVOT Sc
    LEFT JOIN tbl_�л����� ST
        ON ST.�й� = SC.�й�;


SELECT SC.�й�,ST.�л��̸�,SC.����,SC.����,SC.����
FROM(
    SELECT �й�,����,����,����
        FROM tbl_����
        PIVOT( 
            SUM(����)
            FOR ����� IN ('����' AS ����,'����' AS ����,'����' AS ����) 
     )
)  SC
    LEFT JOIN tbl_�л����� ST
        ON ST.�й� = SC.�й�
ORDER BY SC.�й�;




