package com.biz.dbms.domain;

public class OrderVO {
	
	//
	//
	//
	private long O_SEQ;		//	NUMBER
	private String O_NUM;		//	CHAR(6 BYTE)
	private String O_DATE;		//	CHAR(10 BYTE)
	private String O_CNUM;		//	CHAR(5 BYTE)
	private String O_PCODE;	//	CHAR(6 BYTE)
	private String O_PNAME;	//	NVARCHAR2(125 CHAR)
	private int O_PRICE;	//	NUMBER
	private int O_QTY;		//	NUMBER
	private int O_TOTAL;	//	NUMBER
	
	public long getO_SEQ() {
		return O_SEQ;
	}
	public void setO_SEQ(long o_SEQ) {
		O_SEQ = o_SEQ;
	}
	public String getO_NUM() {
		return O_NUM;
	}
	public void setO_NUM(String o_NUM) {
		O_NUM = o_NUM;
	}
	public String getO_DATE() {
		return O_DATE;
	}
	public void setO_DATE(String o_DATE) {
		O_DATE = o_DATE;
	}
	public String getO_CNUM() {
		return O_CNUM;
	}
	public void setO_CNUM(String o_CNUM) {
		O_CNUM = o_CNUM;
	}
	public String getO_PCODE() {
		return O_PCODE;
	}
	public void setO_PCODE(String o_PCODE) {
		O_PCODE = o_PCODE;
	}
	public String getO_PNAME() {
		return O_PNAME;
	}
	public void setO_PNAME(String o_PNAME) {
		O_PNAME = o_PNAME;
	}
	public int getO_PRICE() {
		return O_PRICE;
	}
	public void setO_PRICE(int o_PRICE) {
		O_PRICE = o_PRICE;
	}
	public int getO_QTY() {
		return O_QTY;
	}
	public void setO_QTY(int o_QTY) {
		O_QTY = o_QTY;
	}
	public int getO_TOTAL() {
		return O_TOTAL;
	}
	public void setO_TOTAL(int o_TOTAL) {
		O_TOTAL = o_TOTAL;
	}
	
	@Override
	public String toString() {
		return "OrderVo [O_SEQ=" + O_SEQ + ", O_NUM=" + O_NUM + ", O_DATE=" + O_DATE + ", O_CNUM=" + O_CNUM
				+ ", O_PCODE=" + O_PCODE + ", O_PNAME=" + O_PNAME + ", O_PRICE=" + O_PRICE + ", O_QTY=" + O_QTY
				+ ", O_TOTAL=" + O_TOTAL + "]";
	}
	
	
}
