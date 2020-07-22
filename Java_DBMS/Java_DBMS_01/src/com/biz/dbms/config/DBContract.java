package com.biz.dbms.config;

public class DBContract {
	
	public final static String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public final static String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public final static String DB_USER = "user2";
	public final static String DB_PASSWORD = "user2";
	
	public final static String ORDER_DELETE =
			"DELETE FROM "
			+ ORDER.TABLE
			+ " WHERE "
			+ ORDER.COL_O_SEQ_LONG + "= ?";
	
	
	public final static String ORDER_UPDATE =
			"UPDATE "
			+ ORDER.TABLE 
			+ " SET "
			+ ORDER.COL_O_NUM_STRING + "= ?,"
			+ ORDER.COL_O_DATE_STRING + "= ?,"
			+ ORDER.COL_O_CNUM_STRING + "= ?,"
			+ ORDER.COL_O_PCODE_STRING + "= ?,"
			+ ORDER.COL_O_PNAME_STRING + "= ?,"
			+ ORDER.COL_O_PRICE_INT + "= ?,"
			+ ORDER.COL_O_QTY_INT + "= ?,"
			+ ORDER.COL_O_TOTAL_INT+ "= ?"
			+ " WHERE "
			+ ORDER.COL_O_SEQ_LONG + "= ?";
	
	public final static String ORDER_INSERT =
			"INSERT INTO "
			+ ORDER.TABLE + "("
			+ ORDER.COL_O_SEQ_LONG + ","
			+ ORDER.COL_O_NUM_STRING + ","
			+ ORDER.COL_O_DATE_STRING + ","
			+ ORDER.COL_O_CNUM_STRING + ","
			+ ORDER.COL_O_PCODE_STRING + ","
		//	+ ORDER.COL_O_PNAME_STRING + ","
		//	+ ORDER.COL_O_PRICE_INT + ","
		//	+ ORDER.COL_O_QTY_INT + ","
			+ ORDER.COL_O_TOTAL_INT + ""
			+ " ) VALUES ("
			+ " SEQ_ORDER.NEXTVAL,?,'2020-07-21',?,?,?)";
			
		//	+ " ) VALUES ("
		//	+ " ?, ?, ?, ?, ?, ?, ?, ?)";

	public final static String ORDER_SELECT =
			"select "
			+ ORDER.COL_O_SEQ_LONG + ","
			+ ORDER.COL_O_NUM_STRING + ","
			+ ORDER.COL_O_DATE_STRING + ","
			+ ORDER.COL_O_CNUM_STRING + ","
			+ ORDER.COL_O_PCODE_STRING + ","
			+ ORDER.COL_O_PNAME_STRING + ","
			+ ORDER.COL_O_PRICE_INT + ","
			+ ORDER.COL_O_QTY_INT + ","
			+ ORDER.COL_O_TOTAL_INT
			+ " FROM " + "tbl_order";
	
	public static class ORDER {
		
		public final static String TABLE = "TBL_ORDER";
		
		public final static String COL_O_SEQ_LONG = "o_seq"; //	NUMBER
		public final static String COL_O_NUM_STRING = "o_num"; //	CHAR(6 BYTE)
		public final static String COL_O_DATE_STRING = "o_date"; //	CHAR(10 BYTE)
		public final static String COL_O_CNUM_STRING = "o_cnum"; //	CHAR(5 BYTE)
		public final static String COL_O_PCODE_STRING = "o_pcode"; //	CHAR(6 BYTE)
		public final static String COL_O_PNAME_STRING = "o_pname"; //	NVARCHAR2(125 CHAR)
		public final static String COL_O_PRICE_INT = "o_price"; //	NUMBER
		public final static String COL_O_QTY_INT = "o_qty"; //	NUMBER
		public final static String COL_O_TOTAL_INT = "o_total"; //	NUMBER
		
		public final static int POL_O_SEQ_LONG = 1;
		public final static int POL_O_NUM_String = 2;
		public final static int POL_O_DATE_String = 3;
		public final static int POL_O_CNUM_String = 4;
		public final static int POL_O_PCODE_String = 5;
		public final static int POL_O_PNAME_String = 6;
		public final static int POL_O_PRICE_INT = 7;
		public final static int POL_O_QTY_INT = 8;
		public final static int POL_O_TOTAL_INT = 9;
	}
	
}
