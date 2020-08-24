-- user1
SELECT * FROM tbl_product;

INSERT INTO tbl_product (p_code, p_name)VALUES('p001','테스트상품');
COMMIT;

SELECT RPAD('가', 10, 'P') FROM DUAL;

/*
에서 1개의 칼럼을 pk를 설정할수 없을 경우
2개 이상의 칼럼을 묶어서 pk로 설정을 한다.

하지만 아래 테이블에서 sc_num, sc_su 를 묶어서
pk로 설정할 경우 칼럼이 가변문자열인 관계로 
나중에 문제를 일으킬수 있다.

이러한 테이블에서는 데이터와 별도로 라는 칼럼을 만들고
해당칼럼을 일련번호등을 주여하고
pk로 만드는 것이 좋다.
*/
CREATE TABLE tbl_score (
sc_num CHAR(5),
sc_subject NVARCHAR2(20),
sc_score NUMBER
);
