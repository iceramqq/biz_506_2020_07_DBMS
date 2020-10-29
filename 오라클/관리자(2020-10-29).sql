-- 관리자 화면

-- tableSpace, user 생성
-- User 권한 생성

-- TABLESPACE는 실제데이터를 저장할 파일을 지정하기
-- 오라클에서 DB작업을 할때 가장 먼저 수행해야할 작업
CREATE TABLESPACE testTS    -- 사용할 TABLESPACE 이름
DATAFILE 'testTS.dbf'       -- 실제 데이터가 저장될 파일 이름
SIZE 1M 
AUTOEXTEND ON NEXT 1K;

-- 사용자 생성
CREATE USER test1       -- 사용자의 id
IDENTIFIED BY test1     -- 비밀번호
DEFAULT TABLESPACE testTS; -- CRUD를 수행했을때 데이터를 저장할 곳

-- 사용자에게 권한 부여하기
GRANT DBA TO test1; -- test1 사용자에게 dba 