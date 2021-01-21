package com.sist.main;
/*
 *    예외처리 
 *      *****=> 직접 처리 => 복구 (try~catch)
 *         try => 실행문장 ==> 에러 발생 => catch=> 복구
 *         => Exception(전체 예외 처리) , Throwable(전체 예외+에러)
 *            예외 : 수정이 가능한 에러
 *            에러 : 수정이 불가능한 에러 
 *            ======================
 *            1. 컴파일 에러 (javac) : 에러가 발생 문법상 
 *               = 변수명이 틀립니다 , 메소드호출 => 대소문자 
 *            2. 실행시 에러 (java)
 *               = 웹,네트워크 => 모든것 문자열
 *               String sql="SELECT * FROM 테이블";
 *               FileReader fr=new FileReader("c:\\");
 *               
 *      *****=> 간접 처리 => 자바 시스템(JVM)에 에러 발생을 알려주고 떠맡긴다 
 *                    throws => 메소드 뒤에서 선언 
 *                    => 라이브러리에서 주로 프로그래머에게 떠맡긴다 (pass)
 *      => 임의 발생 : 사용자 정의 예외를 만들어서 호출할 때 주로 사용 
 *                   
 *                   1) 메소드 호출
 *                      메소드명(값)
 *                   2) 생성자 호출 
 *                      new 생성자()
 *                   3) 예외처리 호출 
 *                      throw new 예외처리명()
 */
import java.io.*;
public class MainClass {
    public void aaa()
    {
    	
    }
    public void bbb()
    {
    	
    }
    public void ccc()
    {
    	
    }
    public void ddd()
    {
    	
    }
    public void eee()
    {
    	
    }
	public static void main(String[] args){
		// TODO Auto-generated method stub
		//FileReader fr=new FileReader("c:\\");
		MainClass m=new MainClass();
		m.aaa();
		m.bbb();
		//Thread.sleep(100);
	}

}







