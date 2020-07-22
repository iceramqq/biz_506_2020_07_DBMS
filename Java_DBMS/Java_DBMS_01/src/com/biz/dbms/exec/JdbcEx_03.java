package com.biz.dbms.exec;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.biz.dbms.config.DBConnection;
import com.biz.dbms.config.DBContract;
import com.biz.dbms.domain.OrderVO;

public class JdbcEx_03 {
	public static void main(String[] args) {
		
		Connection dbConn = DBConnection.getDBConnection();
		String insert_sql = DBContract.ORDER_INSERT;
		Scanner scan = new Scanner(System.in);
		
		OrderVO orderVO = new OrderVO();
		
		System.out.print("주문번호(6자리) >> ");
		String str_num = scan.nextLine();
		
		System.out.print("고객번호(5자리) >> ");
		String str_cnum = scan.nextLine();
		
		System.out.print("상품코드(6자리) >> ");
		String str_pcode = scan.nextLine();
		
		orderVO.setO_NUM(str_num);
		orderVO.setO_CNUM(str_cnum);
		orderVO.setO_PCODE(str_pcode);
		
		try {
			PreparedStatement pSt = dbConn.prepareStatement(insert_sql);
			//pSt.setNString(DBContract.ORDER.POL_O_NUM_String, orderVO.getO_NUM());
			//pSt.setNString(DBContract.ORDER.POL_O_NUM_String, orderVO.getO_NUM());
			//pSt.setNString(DBContract.ORDER.POL_O_NUM_String, orderVO.getO_NUM());
			//pSt.setNString(DBContract.ORDER.POL_O_NUM_String, orderVO.getO_NUM());
			
			pSt.setNString(1,orderVO.getO_NUM());
			pSt.setNString(2,orderVO.getO_CNUM());
			pSt.setNString(3,orderVO.getO_PCODE());
			pSt.setInt(4,1000);
			
			int ret = pSt.executeUpdate();
			if(ret > 0) {
				System.out.println("데이터 추가 성공");
			} else {
				System.out.println("데이터 추가 실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
