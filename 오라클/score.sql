CREATE TABLE tbl_score (
    학번	CHAR(5),
    학과	CHAR(3),
    국어	NUMBER,
    영어	NUMBER,
    수학	NUMBER
);

DROP TABLE tbl_score;

INSERT INTO tbl_score(학번, 학과, 국어, 영어, 수학) VALUES ('S0001','001',64,65,79);
INSERT INTO tbl_score(학번, 학과, 국어, 영어, 수학) VALUES ('S0002','003',70,92,99);
INSERT INTO tbl_score(학번, 학과, 국어, 영어, 수학) VALUES ('S0003','002',56,55,52);
INSERT INTO tbl_score(학번, 학과, 국어, 영어, 수학) VALUES ('S0004','001',67,57,55);
INSERT INTO tbl_score(학번, 학과, 국어, 영어, 수학) VALUES ('S0005','003',75,58,74);
INSERT INTO tbl_score(학번, 학과, 국어, 영어, 수학) VALUES ('S0006','004',52,97,78);
INSERT INTO tbl_score(학번, 학과, 국어, 영어, 수학) VALUES ('S0007','005',85,72,92);
INSERT INTO tbl_score(학번, 학과, 국어, 영어, 수학) VALUES ('S0008','002',62,64,62);
INSERT INTO tbl_score(학번, 학과, 국어, 영어, 수학) VALUES ('S0009','003',81,95,86);
INSERT INTO tbl_score(학번, 학과, 국어, 영어, 수학) VALUES ('S0010','004',93,77,79);

SELECT * FROM tbl_score;





