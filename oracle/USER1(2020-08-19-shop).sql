-- user1

CREATE TABLE tbl_product (
p_code	char(6)		PRIMARY KEY,
p_name	nVARCHAR2(20)	NOT NULL,	
p_dcode	char(4)		,
p_std	nVARCHAR2(22),		
p_iprice	number	,	
p_oprice	number	,	
p_image	nVARCHAR2(125)		
);


CREATE TABLE tbl_dept (
D_CODE	char(4)		PRIMARY KEY,
D_NAME	nVARCHAR2(20)	NOT NULL,	
D_CEO	nVARCHAR2(30)	NOT NULL,	
D_TEL	nVARCHAR2(20)		,
D_ADDRESS	nVARCHAR2(255)	,	
D_MANAGER	nVARCHAR2(50)	,	
D_MN_TEL	VARCHAR2(20)		

);
DROP TABLE tbl_product;



