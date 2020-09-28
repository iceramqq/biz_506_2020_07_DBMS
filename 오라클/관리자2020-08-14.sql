-- 여기는 관리자 화면

--  블로그를 위한 새성
CREATE TABLESPACE blogsTS
DATAFILE 'C:/bizwork/oracle_DBMS/blogs.dbf'
SIZE 1M AUTOEXTEND ON NEXT 1K;

--user1 
CREATE USER user1 IDENTIFIED BY user1
DEFAULT TABLESPACE blogsTS;


GRANT DBA TO user1;