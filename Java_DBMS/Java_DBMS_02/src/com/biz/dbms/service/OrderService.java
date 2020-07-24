package com.biz.dbms.service;

import java.sql.SQLException;
import java.util.List;

import com.biz.dbms.domain.OrderVO;

public interface OrderService {
	
	//java에서 dbms와 관련된 app을 만들때 최소한으로 구현해야할 메서드
	public int insert(OrderVO orderVO) throws SQLException; //Order에 값을 담아서 잔달받아 insert 수행

	public List<OrderVO> selectAll() throws SQLException; //조건에 관계 없이 모든 데이터르르 추출하여 return
	public OrderVO findBySeq(long seq) throws SQLException; //findById(), pk 칼럼 

	public int update(OrderVO orderVO) throws SQLException;
	public int delete(long seq) throws SQLException;
	
}
