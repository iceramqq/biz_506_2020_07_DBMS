-- user1
CREATE TABLE tbl_images (
i_seq	NUMBER		PRIMARY KEY,
i_b_seq	NUMBER	NOT NULL	,
i_org_name	VARCHAR2(255)	NOT NULL	,
i_file_name	nVARCHAR2(255)	NOT NULL	,
i_down	NUMBER		

);

CREATE SEQUENCE seq_images
START WITH 1 INCREMENT BY 1;

SELECT * FROM tbl_images;
