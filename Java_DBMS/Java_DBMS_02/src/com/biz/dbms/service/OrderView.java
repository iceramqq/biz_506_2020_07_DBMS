package com.biz.dbms.service;

import java.util.List;

import com.biz.dbms.domain.OrderVO;

public class OrderView {
	
	public void orderList(List<OrderVO> orderList) {
		
		System.out.println("======================================================");
		System.out.println("주문 리스트");
		System.out.println("------------------------------------------------------");
		System.out.println("SEQ\t주문번호\t거래일자\t고객번호\t상품코드\t상품명\t판매가격\t수량\t합계");
		for (OrderVO oVO : orderList) {
			System.out.printf("%5d\t",oVO.getO_seq());
			System.out.print(oVO.getO_num()+"\t");
			System.out.print(oVO.getO_date()+"\t");
			System.out.print(oVO.getO_cnum()+"\t");
			System.out.print(oVO.getO_pcode()+"\t");
			System.out.print(oVO.getO_pname()+"\t");
			System.out.print(oVO.getO_price()+"\t");
			System.out.print(oVO.getO_qty()+"\t");
			System.out.print(oVO.getO_total()+"\n");
		}
		System.out.println("======================================================");
		
	}
	
	public void orderDetailView(OrderVO orderVO) {
		
		System.out.println("========================================");
		System.out.printf("주문번호 : %s\n",orderVO.getO_num());
		System.out.printf("고객번호 : %s\n",orderVO.getO_cnum());
		System.out.printf("상풀코드 : %s\n",orderVO.getO_pcode());
		System.out.printf("가격 : %d\n",orderVO.getO_price());
		System.out.printf("수량 : %d\n",orderVO.getO_qty());
		System.out.println("========================================");
	}
	
	
}
