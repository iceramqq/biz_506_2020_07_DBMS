package com.biz.dbms.exec;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biz.dbms.config.DBConnection;
import com.biz.dbms.config.DBContract;
import com.biz.dbms.domain.OrderVO;

public class JdbcEx_02 {
	public static void main(String[] args) {
		
		Connection dbConn = DBConnection.getDBConnection();
		String order_select = DBContract.ORDER_SELECT;
		List<OrderVO> orderList = new ArrayList<OrderVO>();
		
		// 인터페이스를 이용해서 객체 선언만
		PreparedStatement pSt = null;
		
		// dbConn 객체의 prepareStatement() method에게 SQL 명령문 코드를 전달하면
		// PreparedStatement type의 객체를 생성하여 return
		
		try {
			pSt = dbConn.prepareStatement(order_select);
			ResultSet result = pSt.executeQuery();
			while(result.next()) {
				
				OrderVO orderVO = new OrderVO();
				
				String o_num = result.getNString(DBContract.ORDER.COL_O_NUM_STRING);
				orderVO.setO_NUM(o_num);

				String o_date = result.getNString(DBContract.ORDER.COL_O_DATE_STRING);
				orderVO.setO_DATE(o_date);
				
				String o_cnum = result.getNString(DBContract.ORDER.COL_O_CNUM_STRING);
				orderVO.setO_CNUM(o_cnum);
				
				String o_pcode = result.getNString(DBContract.ORDER.COL_O_PCODE_STRING);
				orderVO.setO_PCODE(o_pcode);
				
				String o_pname = result.getNString(DBContract.ORDER.COL_O_PNAME_STRING);
				orderVO.setO_PNAME(o_pname);
				
				int o_qty = result.getInt(DBContract.ORDER.COL_O_QTY_INT);
				orderVO.setO_QTY(o_qty);
				
				int o_price = result.getInt(DBContract.ORDER.COL_O_PRICE_INT);
				orderVO.setO_QTY(o_price);
				
				orderList.add(orderVO);
				
				System.out.println(result.getNString(1));
			}
			result.close();
			dbConn.close();
			
			System.out.println("======================================================");
			System.out.println("주문 리스트");
			System.out.println("------------------------------------------------------");
			System.out.println("주문번호\t거래일자\t고객번호\t상품코드\t상품명\t판매가격\t수량\t합계");
			for (OrderVO oVO : orderList) {
				System.out.print(oVO.getO_NUM()+"\t");
				System.out.print(oVO.getO_DATE()+"\t");
				System.out.print(oVO.getO_CNUM()+"\t");
				System.out.print(oVO.getO_PCODE()+"\t");
				System.out.print(oVO.getO_PNAME()+"\t");
				System.out.print(oVO.getO_PRICE()+"\t");
				System.out.print(oVO.getO_QTY()+"\t");
				System.out.print(oVO.getO_TOTAL()+"\n");
			}
			System.out.println("======================================================");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println("오라클에 접속하는 과정에서 문제가 발생했습니다");
		}
	}
}

