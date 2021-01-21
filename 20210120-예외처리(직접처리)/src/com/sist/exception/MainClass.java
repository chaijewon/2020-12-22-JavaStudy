package com.sist.exception;
/*
 *    에러 
 *     1. 에러 : 소스상에서 수정할 수 없는 에러 : 메모리 부족,운영체제 문제... 
 *     2. 예외 : 소스상에서 수정할 수 있는 에러 : 사용자의 입력이 잘못된 경우,파일명이 틀리다
 *        ==================================================================
 *        예외 회피 : 간접 처리 throws
 *        예외 처리 : 직접 처리 try~catch
 *                  임의 발생 throw
 *                  사용자 정의 예외처리 
 *    ======================================================================
 *    예외처리 목적 : 비정상 종료 방지하고 정상 종료를 할 수 있게 만드는 과정 
 *                 미리 예러를 방지할 수 있게 예측 
 *                 에러 : 프로그래머 실수 , 사용자 입력
 *                       =======================
 *    A.java  ============> A.class(0,1) ==============> 한줄씩 읽어서 출력
 *    원시소스       javac                     java
 *    (프로그래머)
 *                ========                   =====
 *                
 *                1. 컴파일 에러 : 반드시 예외처리 
 *                2. 실행시 에러 : 예외처리를 생략할 수 있다(필요시 예외처리를 할 수 있다)
 *                
 *            ================================================
 *              Check Exception        NON-Check Exception
 *            ================================================
 *              컴파일시에 확인            실행시에 확인 (예외처리가 없어도 된다)
 *              
 *                            예외처리의 계층도 
 *                            ==============
 *                              
 *                              Object
 *                                |
 *                             Throwable
 *                                |
 *                      -------------------------
 *                      |                       |
 *                    Error                  Exception
 *                                 Check        |               NON-Check
 *                                 ----------------------------------------
 *                                 |                                      |
 *                             IOException(파일)                           |
 *                             InterruptedException(쓰레드)                 |
 *                             URLMalformedException(네트워크)              |
 *                             ClassNotException                          |
 *                             SQLException(데이터베이스)                    |
 *                                                                RuntimeException
 *                                                                      |
 *                                                                ArrayIndexOutOfBoundsException
 *                                                                NumberFormatException
 *                                                                ArithmeticException
 *                                                                NullPointerException
 *                                                                ClassCastExeption
 *                                                                
 *                                                                
 *         예외처리 
 *           = 예외 복구 (직접 처리)
 *             try
 *             {
 *                 정상 수행문장 
 *             }catch(){
 *                 수행과정 => 에러발생을 하면 복구
 *             }
 *           = 예외 회피 (예외 떠넘기기) : 자바시스템  => throws
 *           = 예외 전환 (에러가 발생할 예상지역 => 다른 예외를 발생) => throw (사용자 정의 예외)
 *           
 *            
 *                       
 */
public class MainClass {

	public static void main(String[] args) {
		/*int a=10;
		int b=0;
		int result=a/b;// 프로그램 종료 => 비정상 종료 
		System.out.println("프로그램 종료!!");*/
		try
		{
			int a=10;
			int b=0;// 정상 
			int result=a/b; // 에러 발생 ===> catch이동 
			System.out.println("result="+result);
		}catch(Exception e)
		{
			System.out.println("프로그램 오류!!");// {} 다음 소스로 이동
		}
		System.out.println("프로그램 종료");
	}

}














