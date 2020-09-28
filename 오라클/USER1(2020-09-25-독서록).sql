-- USER 독서록 프로젝트
DROP TABLE tbl_authority;

CREATE TABLE tbl_member (
    M_USERID	VARCHAR2(30)		PRIMARY KEY,
    M_PASSWORD	nVARCHAR2(255)	NOT NULL	,
    M_NAME	nVARCHAR2(30)		,
    M_TEL	VARCHAR2(30)		,
    M_ADDRESS	nVARCHAR2(125)	,	
    M_ROLL	VARCHAR2(20)		,
    
    ENABLE CHAR(1)	DEFAULT '0'	CONSTRAINT enble_veri CHECK(ENABLE = '0' or ENABLE = '1'),
    
    AccountNonExpired	CHAR(1)	,	
    AccountNonLocked	CHAR(1)	,	
    CredentialsNonExpired	CHAR(1)		
);

CREATE TABLE tbl_authority (
    seq	NUMBER		PRIMARY KEY,
    M_USERID	VARCHAR2(30)	NOT NULL	,
    M_ROLL	VARCHAR2(31)	NOT NULL	
);
CREATE SEQUENCE seq_authority
START WITH 1 INCREMENT BY 1;
