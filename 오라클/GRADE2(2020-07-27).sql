-- GRADE2
DROP TABLE tbl_student;
CREATE TABLE tbl_student(
    st_num CHAR(5) PRIMARY KEY,
    st_name nVARCHAR2(20) NOT NULL,
    st_tel VARCHAR2(20) NOT NULL,
    st_addr nVARCHAR2(125),
    st_grade NUMBER NOT NULL,
    st_dept CHAR(3) NOT NULL
);

DROP TABLE tbl_dept;
CREATE TABLE tbl_dept (
    d_code CHAR(3) PRIMARY KEY,
    d_name nVARCHAR2(20) NOT NULL UNIQUE,
    d_prof nVARCHAR2(20)
);

DROP TABLE tbl_score;
CREATE TABLE tbl_score (
    sc_num CHAR(5) NOT NULL,
    sc_subject nVARCHAR2(20) NOT NULL,
    sc_score NUMBER NOT NULL
);

INSERT ALL
INTO tbl_student(st_num, st_name,st_tel, st_addr,st_grade,st_dept)
VALUES 
('20001','���Ѽ�','010-2217-7851','�泲 ���ؽ� ��浿 1088-7',3,'008')

INTO tbl_student(st_num, st_name,st_tel, st_addr,st_grade,st_dept)
VALUES 
('20002','������','010-4311-1533','������ ���ʽ� ������ 956-5',1,'006')

INTO tbl_student(st_num, st_name,st_tel, st_addr,st_grade,st_dept)
VALUES 
('20003','������','010-6262-7441','��� ��õ�� ���ܵ� 38-3����',1,'009')

INTO tbl_student(st_num, st_name,st_tel, st_addr,st_grade,st_dept)
VALUES 
('20004','�����','010-9793-9856','����� ������ ���ε� 3-35����',1,'006')

INTO tbl_student(st_num, st_name,st_tel, st_addr,st_grade,st_dept)
VALUES 
('20005','������','010-8811-7761','������ ���ؽ� õ� 1077-3',2,'010')
SELECT 1 FROM DUAL;

INSERT INTO tbl_dept (d_code,d_name,d_prof) VALUES ('001','��ǻ�Ͱ���','�����');
INSERT INTO tbl_dept (d_code,d_name,d_prof) VALUES ('002','���ڰ���','��ö��');
INSERT INTO tbl_dept (d_code,d_name,d_prof) VALUES ('003','����','ŷ���ʵ�');

INSERT INTO tbl_score(sc_num, sc_subject, sc_score) VALUES('20001','�����ͺ��̽�',71);
INSERT INTO tbl_score(sc_num, sc_subject, sc_score) VALUES('20001','����',63);
INSERT INTO tbl_score(sc_num, sc_subject, sc_score) VALUES('20001','�̼�',50);

INSERT INTO tbl_score(sc_num, sc_subject, sc_score) VALUES('20002','�����ͺ��̽�',84);
INSERT INTO tbl_score(sc_num, sc_subject, sc_score) VALUES('20002','����',75);
INSERT INTO tbl_score(sc_num, sc_subject, sc_score) VALUES('20002','����',52);

INSERT INTO tbl_score(sc_num, sc_subject, sc_score) VALUES('20003','����',89);
INSERT INTO tbl_score(sc_num, sc_subject, sc_score) VALUES('20003','����',75);
INSERT INTO tbl_score(sc_num, sc_subject, sc_score) VALUES('20003','����',70);

SELECT sc_num FROM tbl_score WHERE sc_score < 60;

-- �й��� ������ȸ
SELECT sc_num AS �й�, 
    SUM(sc_score),
    ROUND(AVG(sc_score),2)
FROM tbl_score
GROUP BY sc_num
ORDER BY sc_num;

SELECT sc_num AS �й�, ST.st_name, ST.st_tel,
    SUM(sc_score),
    ROUND(AVG(sc_score),2)
FROM tbl_score SC
    LEFT JOIN tbl_student ST
        ON ST.st_num = SC.sc_num
GROUP BY sc_num, ST.st_name, ST.st_tel
ORDER BY sc_num;




