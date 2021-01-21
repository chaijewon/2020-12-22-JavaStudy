package com.sist.main2;
/*
 *   키워드 : 클래스명 , 메소드명 (제외)
 */
interface DataBase
{
	public void connect();
	public void disconnect();
}
class Oracle implements DataBase
{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("오라클 연결");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("오라클 닫기");
	}
	
}
class MsSQL implements DataBase
{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("MsSQL 연결");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("MsSQL 닫기");
	}
	
}
class MySQL implements DataBase
{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("MySQL 연결");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("MySQL 닫기");
	}
	
}
class DB2 implements DataBase
{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("DB2 연결");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("DB2 닫기");
	}
	
}
// interface는 주로 하는 역할 : 여러개를 클래스를 모아서 관리하는 프로그램 (Web에서 주로 사용:스프링)
// JSP / Asp.net / PHP
// Web => 데이터베이스 연결 
// Java:인터페이스    C#: 클래스
class Container
{
	public DataBase dbSelect(String type)
	{
		DataBase db=null;// Map
		if(type.equals("Oracle"))
			db=new Oracle();
		else if(type.equals("MsSQL"))
			db=new MsSQL();
		else if(type.equals("MySQL"))
			db=new MySQL();
		else if(type.equals("DB2"))
			db=new DB2();
		
		return db;
	}
}
/*
 *    인터페이스 : 리모콘 
 *    ========
 *      자바가 리모콘을 제작하는 업체 => 부도 => 브라우저(네스케이프):웹중심 
 *      
 *      HTML5 => MS제외 (Google,FF,오페라) => HTML(추상적) , HTML5(알기쉽게:시멘텍)
 *      <object>  <video>
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Container c=new Container();
        DataBase db=c.dbSelect("Oracle");
        db.connect();
        db.disconnect();
        System.out.println("===================");
        db=c.dbSelect("DB2");
        db.connect();
        db.disconnect();
	}

}







