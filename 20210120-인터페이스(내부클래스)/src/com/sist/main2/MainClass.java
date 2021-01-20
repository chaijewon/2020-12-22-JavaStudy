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
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}
	
}
class MsSQL implements DataBase
{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}
	
}
class MySQL implements DataBase
{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}
	
}
class DB2 implements DataBase
{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}
	
}
class Container
{
	public DataBase dbSelect(String type)
	{
		DataBase db=null;
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
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	}

}







