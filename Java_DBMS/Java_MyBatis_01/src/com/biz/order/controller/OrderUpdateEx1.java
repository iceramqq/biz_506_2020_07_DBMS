package com.biz.order.controller;

import com.biz.order.service.OrderInput;

public class OrderUpdateEx1 {

	public static void main(String[] args) {
		
		OrderInput oInput = new OrderInput();
		while (true) {
			if(!oInput.orderUpdate()) {
				break;
			}
		}
		System.out.println("업무종료");
	}
	
}
