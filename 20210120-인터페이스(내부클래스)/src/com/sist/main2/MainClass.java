package com.sist.main2;
/*
 *   Ű���� : Ŭ������ , �޼ҵ�� (����)
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
		System.out.println("����Ŭ ����");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("����Ŭ �ݱ�");
	}
	
}
class MsSQL implements DataBase
{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("MsSQL ����");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("MsSQL �ݱ�");
	}
	
}
class MySQL implements DataBase
{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("MySQL ����");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("MySQL �ݱ�");
	}
	
}
class DB2 implements DataBase
{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("DB2 ����");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("DB2 �ݱ�");
	}
	
}
// interface�� �ַ� �ϴ� ���� : �������� Ŭ������ ��Ƽ� �����ϴ� ���α׷� (Web���� �ַ� ���:������)
// JSP / Asp.net / PHP
// Web => �����ͺ��̽� ���� 
// Java:�������̽�    C#: Ŭ����
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
 *    �������̽� : ������ 
 *    ========
 *      �ڹٰ� �������� �����ϴ� ��ü => �ε� => ������(�׽�������):���߽� 
 *      
 *      HTML5 => MS���� (Google,FF,�����) => HTML(�߻���) , HTML5(�˱⽱��:�ø���)
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







