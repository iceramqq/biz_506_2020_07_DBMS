package com.biz.order.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/*
 * mybatis-context.xml파일을 읽어서
 * 설정된 값으로 를 만들게 된다.
 * cbms에 sql에 보내고, 받을때
 * 		sql을 dbms가 할수 잇는ㅁ 데이터로 변황하고
 * 		dbms가 데이터ㅡㄹㄹ 보낼대
 * 		java가 인식할수 있는 데이터로 변황하고
 * 
 * 		model 클래스에 데이터를 자동으로 
 */
public class DBConnection {
	
	private static SqlSessionFactory sqlSessionFactory;
	private static String contextFile;
	
	static {
		
		contextFile = "com/biz/order/config/mybatis-context.xml";
		InputStream inputStream =null;
		
		
		
		try {
			//
			//
			// xml로 설정된 항복들을 가져와서 mybatis에서 사용할 수 있는
			// 데이터 형태로 변환
			inputStream = Resources.getResourceAsStream(contextFile);
			
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			
			// SqlSessionFactoryBuilder의 builder() method에
			// Resources.getResourceAsStream(contextFile)로 읽어 들인 inputStream 객체를
			// 매개변수로만 전달을 하면
			// sqlSessionFactory를 만들어서 return 해준다.
			
			// 는 프로젝트가 시작될때 만들어져
			// jvm이 관리하는 객체가된다.
			// 만약 이 프로젝트를 어떤경로로 2번이상 작동을 시킨다면
			// 객체는 하는 일이 뙈 많아서 생성하는 것 자체만으로도
			// jvm입장에서는 부담이 될수 있다.
			// 를 생성하기 전에 
			// 누군가 이미올려서 사용중이라면 다시 만들지 않고 재활용을 하룻 있도록
			// 해주는 것이 좋다.
			// 
			
			// *** 이러한 패턴을 싱글톤 패턴(SingleTone P 이라고 한다.
			if(sqlSessionFactory == null) {
				sqlSessionFactory = builder.build(inputStream);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("sqlSessionFactory 생성중 xml 파일 문제가 발생");
			e.printStackTrace();
		}
		
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	
}
