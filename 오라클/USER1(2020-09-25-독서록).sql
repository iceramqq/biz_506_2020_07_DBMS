-- USER 독서록 프로젝트
DROP TABLE tbl_authority;
DROP TABLE tbl_member;

CREATE TABLE tbl_member (
    M_USERID	VARCHAR2(30)		PRIMARY KEY,
    M_PASSWORD	nVARCHAR2(255)	NOT NULL	,
    M_NAME	nVARCHAR2(30)		,
    M_TEL	VARCHAR2(30)		,
    M_ADDRESS	nVARCHAR2(125)	,	
    M_ROLE	VARCHAR2(20)		,
    Enabled	CHAR(1)	DEFAULT '0'
                CONSTRAINT enable_veri CHECK(enabled = '0' OR enabled = '1'),
    AccountNonExpired	CHAR(1)		,
    AccountNonLocked	CHAR(1)		,
    CredentialsNonExpired	CHAR(1)	,	
    M_EMAIL	VARCHAR2(30)		
	
);

CREATE TABLE tbl_authority (
    seq	NUMBER		PRIMARY KEY,
    M_USERID	VARCHAR2(30)	NOT NULL	,
    M_ROLE	VARCHAR2(31)	NOT NULL	
);
CREATE SEQUENCE seq_authority
START WITH 1 INCREMENT BY 1;

DELETE FROM tbl_member;
DELETE FROM tbl_authority;
COMMIT;

SELECT * FROM tbl_member;
SELECT * FROM tbl_authority;

-- 한개의 
-- seq 값으로 pk설정을 해두면 sql 작동을 하지 않는다
insert ALL 
    INTO tbl_member(m_userid, m_password) VALUES ('user1','1')
    INTO tbl_member(m_userid, m_password) VALUES ('user2','1')
    INTO tbl_member(m_userid, m_password) VALUES ('user3','1')
    INTO tbl_member(m_userid, m_password) VALUES ('user4','1')
    INTO tbl_member(m_userid, m_password) VALUES ('user5','1')
SELECT * FROM dual;

insert ALL 
    INTO tbl_authority(m_userid, m_roll) VALUES ('admin','ADMIN')
    INTO tbl_authority(m_userid, m_roll) VALUES ('admin1','ADMIN')
    INTO tbl_authority(m_userid, m_roll) VALUES ('admin2','ADMIN')
    INTO tbl_authority(m_userid, m_roll) VALUES ('admin3','ADMIN')
SELECT * FROM dual;

DELETE FROM tbl_authority;

-- 오라클에서 seq pk  칼럼을 가진 table db 다중 insert 문을 수행하기 위해서
-- 1.
-- 2.
-- 3. 서브쿼리 부모 sql에서 seq.next
-- 47.

INSERT INTO tbl_authority (seq,m_userid,m_role)
SELECT SEQ_AUTHORITY.NEXTVAL, sub.*FROM
(
-- 가상테이블
SELECT 'user11' as username,'POLE_ADMIN' as authority FROM dual
UNION ALL
SELECT 'user11' as username,'POLE_USER' as authority FROM dual
UNION ALL
SELECT 'user12' as username,'POLE_ADMIN' as authority FROM dual
UNION ALL
SELECT 'user12' as username,'POLE_USER' as authority FROM dual
) sub;


DELETE FROM tbl_member;
DELETE FROM tbl_authority;
COMMIT;

SELECT * FROM tbl_member;
SELECT * FROM tbl_authority;

SELECT * FROM tbl_member M
    LEFT JOIN tbl_authority A
        ON m.m_userid = a.m_userid;

UPDATE tbl_member SET enabled = 1 WHERE m_userid = 'user';







