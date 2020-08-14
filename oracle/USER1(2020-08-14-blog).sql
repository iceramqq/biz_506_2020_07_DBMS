-- 여기는 user1 화면입니다

--blog 테이블 생성
CREATE TABLE tbl_blogs (

bl_seq	NUMBER		PRIMARY KEY,
bl_user	nVARCHAR2(20)	NOT NULL,	
bl_date	nVARCHAR2(10)	NOT NULL,	
bl_time	nVARCHAR2(10)	NOT NULL,	
bl_title	nVARCHAR2(125)	NOT NULL,	
bl_contents	nVARCHAR2(2000)	NOT NULL	

);


-- 일련번호
-- 
CREATE SEQUENCE seq_blog
START WITH 1 INCREMENT BY 1;

/*
와 기타 다른 프로그래밍 프로젝트와 연동을 할때
에서 를 수행했음에도 불구하고
프로젝트에서 조회되는 데이터에 반영이 안되는 경우가 있다.

원인
를 수행하면


*/

INSERT INTO tbl_blogs (bl_seq,bl_user,bl_date,bl_time,bl_title,bl_contents)
VALUES(seq_blog.NEXTVAL,'홍길동','2020-08-14','09:47:00','나의 블로그','블로그를 만들자');

INSERT INTO tbl_blogs (bl_seq,bl_user,bl_date,bl_time,bl_title,bl_contents)
VALUES(seq_blog.NEXTVAL,'이몽룡','2020-08-14','09:47:01','블로그 축하','블로그 개설을 출하합니다');

INSERT INTO tbl_blogs (bl_seq,bl_user,bl_date,bl_time,bl_title,bl_contents)
VALUES(seq_blog.NEXTVAL,'성춘향','2020-08-14','09:47:02','블로그 축하','블로그 개설을 출하합니다');
COMMIT;

SELECT * FROM tbl_blogs;








