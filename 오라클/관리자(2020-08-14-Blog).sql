-- ����� ������ ȭ��

-- ��α׸� ���� TableSpace ����
CREATE TABLESPACE blogTS
DATAFILE 'C:/bizwork/workspace/oracle_dbms/blog.dbf'
SIZE 1M AUTOEXTEND ON NEXT 1K;

-- user1 ����� ����
CREATE USER user1 IDENTIFIED BY user1
DEFAULT TABLESPACE blogTS;

-- user1�� ���Ѻο�
GRANT DBA TO user1;
