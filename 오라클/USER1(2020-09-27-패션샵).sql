-- USER1 Loo9 패션샵 프로젝트 
DROP TABLE tbl_iolist;

CREATE TABLE tbl_iolist (
    seq	NUMBER		PRIMARY KEY,
    io_date	VARCHAR2(10)	,
    io_time	VARCHAR2(10)	,
    io_pname	nVARCHAR2(30)	,	
    io_input	CHAR(1)		,
    io_price	NUMBER		,
    io_quan	NUMBER		,
    io_total	NUMBER 
);

CREATE SEQUENCE seq_iolist
START WITH 1 INCREMENT BY 1;
