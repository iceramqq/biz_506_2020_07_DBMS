package com.biz.order.controller;

import com.biz.order.model.OrderVO;

public class paramEx_01 {
	public static void main(String[] args) {
		
		paramText pText = new paramText();
		
		/*
		 * 형변수는 다른 에 매개변수로 전달했을때
		 * 전달받은  에서 값을 변경해도 매개변수로 보낸 곳에서
		 * 원래 있던 값은 절대 변함이 없다.
		 */
		int intnum1 = 3;
		int intnum2 = 4;
		System.out.printf("intnum1 : %d, intnum2 : %d",intnum1,intnum2);
		pText.add(intnum1,intnum2);
		System.out.printf("intnum1 : %d, intnum2 : %d",intnum1,intnum2);
		
		/*
		 * 형변수는 다른 에 매개변수로 전달했을때
		 * 전달받은  에서 겍체의 일부요소를 변경하면
		 * 보낸곳의 원본 데이터가 변해 버린다.
		 */
		OrderVO oV = new OrderVO();
		System.out.printf("intnum1 : %d, intnum2 : %d",intnum1,intnum2);
		pText.add(oV);
		System.out.printf("intnum1 : %d, intnum2 : %d",intnum1,intnum2);
		/*
		 * 배열을 다른 에 매개변수로 전달했을때
		 * 전달받은  에서 배열의 일부요소를 변경하면
		 * 보낸곳의 원본 데이터가 변해 버린다.
		 */
		
		int[] intA = new int[3];
		System.out.printf("intnum1 : %d, intnum2 : %d",intnum1,intnum2);
		pText.add(intA);
		System.out.printf("intnum1 : %d, intnum2 : %d",intnum1,intnum2);
		
		
		/*
		 * 객체나, 배열을 매개변수로 전달햇을 때
		 * 전달받은 에서 새로 객체나 배열을 생성하게 
		 */
		
		/*
		 * wrapper(String, Integer, Long, Fioat, Boolean, Character)들은
		 * 변수와 성질이 닮았다
		 */
		
	}
}
