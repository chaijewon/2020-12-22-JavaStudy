package com.sist.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 *    라이브러리 (API) : 변경할 수 없다 , Framework : 변경이 가능 
 *    ==============
 *      java.lang.* : import에서 생략이 가능 => 자바에서 자주 사용되는 클래스 
 *        = Object :
 *        ***= String
 *        = StringBuffer / StringBuilder
 *        = Math
 *        ***= Wrapper(기본형 데이터형=>클래스형으로 변경)
 *        = System
 *      java.util.* 
 *        = Date , Calendar
 *        = StringTokenizer
 *        = Scanner
 *        = Collection
 *            List , Set , Map
 *        = Arrays
 *      java.io.*
 *      java.net.*
 *      java.text.*
 *      java.sql.*
 *      =============
 *      java.lang.*
 *      ========================
 *      Object : 모든 믈래스의 조상 클래스 
 *      기능(메소드) :  clone() : 메모리 복제 
 *                   finalized() : 소멸자    A() ~A()
 *                   toString() : 객체를 문자열로 변환 => 주소 
 *                   equals() : 객체 비교 
 *                 => 모든 클래스를 한개오 모아서 관리 (Object:모든 데이터형을 소화 할 수 있다)
 */
/*
 *    객체 생명주기  A 
 *    
 *    => 생성 (메모리 저장)  ===> 기능 활용(메소드 호출) ===> 메모리 해제
 *       new A()               a.display()            a=null; ==> GC
 */
class A
{

	public A()
	{
		System.out.println("A객체 생성...");
	}
	public void display()
	{
		System.out.println("A객체 활용...");
	}
	@Override
	protected void finalize() throws Throwable {
		// 객체가 소멸될때 자동 호출된다 
		System.out.println("A객체 소멸...");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hello";
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a=new A();
        System.out.println(a.toString());
        System.out.println(a);// 객체를 출력 => 자동 toString()을 호출한다 
        a.display();
        a=null;
        System.gc();// 멀티미디어 => 소멸자 메소드를 호출할때 주로 사용
        try
        {
        	FileReader fr=new FileReader("");
        	Class.forName("");
        }catch(FileNotFoundException | ClassNotFoundException e)
        {
        	if(e instanceof FileNotFoundException)
        	{
        		System.out.println("파일을 찾을 수 없다");
        	}
        	if(e instanceof ClassNotFoundException)
        	{
        		System.out.println("클래스를 찾을 수 없다");
        	}
        	//System.out.println(e.getMessage());
        }
	}

}









