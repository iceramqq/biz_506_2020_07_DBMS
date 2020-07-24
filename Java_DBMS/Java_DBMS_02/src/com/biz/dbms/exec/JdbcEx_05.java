package com.biz.dbms.exec;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.biz.dbms.config.Lines;
import com.biz.dbms.domain.OrderVO;
import com.biz.dbms.service.OrderInput;
import com.biz.dbms.service.OrderService;
import com.biz.dbms.service.OrderServiceImplV1;
import com.biz.dbms.service.OrderView;

public class JdbcEx_05 {
	
	public static void main(String[] args) {
		
		OrderService oService = new OrderServiceImplV1();
		OrderInput oInput = new OrderInput();
		OrderView oView = new OrderView();
		
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println(Lines.getDLine(50));
			System.out.println("아마전 쇼핑몰 주문서 관리 시스템 V!");
			System.out.println(Lines.getDLine(50));
			System.out.println("1.주문서 리스트 보기");
			System.out.println("2.주문서 자세히 보기");
			System.out.println("3.주문서 입력");
			System.out.println("4.주문서 수정");
			System.out.println("5.주문서 삭제");
			System.out.println("Q.업무종료");
			System.out.println(Lines.getSLine(50));
			System.out.print("업무선택 >> ");
			String strMenu = scan.nextLine();
			if(strMenu.equals("Q")) {
				break;
			}
			int intMenu = 0;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("업무선택은 숫자 1~5까지 중에 선택하세요");
				continue;
			}
			List<OrderVO> orderList;
			
			try {
				if(intMenu == 1) {
					orderList = oService.selectAll();
					oView.orderList(orderList);
				} else if (intMenu == 2) {
					orderList = oService.selectAll();
					oView.orderList(orderList);
					
					OrderVO orderVO = oInput.detailView();
					
				} else if (intMenu == 3) {
					if(!oInput.orderInsert()) {
						break;
					}
					orderList = oService.selectAll();
					oView.orderList(orderList);
				} else if (intMenu == 4) {
					if(!oInput.orderUpdate()) {
						break;
					}
				} else if (intMenu == 5) {
					orderList = oService.selectAll();
					oView.orderList(orderList);
					if(!oInput.orderDelete()) {
						break;
					}
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("업무종료 휴가가자!!!");
		
	}
	
}
