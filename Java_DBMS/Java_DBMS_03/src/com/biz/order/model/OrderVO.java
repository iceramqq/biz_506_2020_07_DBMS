package com.biz.order.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderVO {
	
	private long o_seq;		
	private String o_num;	
	private String o_date;	
	private String o_cnum;		
	private String o_pcode;	
	private String o_pname;
	private int o_price;
	private int o_qty;	
	private int o_total;
}
