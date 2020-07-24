package com.biz.order.controller;

import com.biz.order.model.OrderVO;

public class paramText {
	
	public void add(int num1, int num2) {
		num1 = 100;
		num2 = 200;
		int sum = num1+num2;
	}
	
	public void add(OrderVO orderVO) {
		orderVO.setO_pcode("알수 없음");
	}
	
	public void add(int[] intArray) {
		// TODO Auto-generated method stub
		if(intArray.length > 0) {
			intArray[0] = 1000_000_000;
		}
	}
	
	public void add(String str) {
		// TODO Auto-generated method stub
		str = "Republec of korea";
	}
	
	
	
	public void non(OrderVO orderVO) {
		orderVO = new OrderVO();
		orderVO.setO_pcode("나는 누구이계");
	}
	
	public void non(int[] intArray) {
		intArray = new int[3];
		if(intArray.length > 0) {
			intArray[0] = 3333_3333;
		}
	}
	
}
