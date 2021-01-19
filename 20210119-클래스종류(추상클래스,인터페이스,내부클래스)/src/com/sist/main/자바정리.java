package com.sist.main;
/*
 *    1. 기본데이터형 : 자바에서 지원하는 메모리 크기 
 *       정수 : int,long
 *       실수 : double 
 *       문자 : char
 *       논리 : boolean 
 *       문자열: String
 *       ============== 외에는 프로그래머가 직접 만들어서 사용 => class (사용자 정의 데이터형)
 *                      클래스 : 1) 변수(다른 데이터형) 2) 메소드를 저장 
 *                      ===== 관련된 데이터 + 관련된 메소드 (통으로 모아서 관리)
 *       영화 Movie => Movie[]
 *       뮤직 Music
 *       게시판  Board
 *       회원   Member
 *       상품
 *       ==============
 *       int a=10;
 *       A a=new A();
 *         = 메모리의 주소 (접근 .)
 *    2. 다른 클래스에서 데이터에 접근해서 사용을 할 수 없게 만든다 (데이터를 은닉화 (private) => 메소드를 통해서 접근)
 *           => 캡슐화 (다른 클래스에서 이용 => 변질)  =>getter/setter
 *    3. 중복제거 , 재사용 
 *       1) 중복제거 : 소스를 간결 
 *          = 반복문
 *          = 메소드 
 *          = 상속 => 기능 추가 (변경시에 전체 상속받은 모든 클래스를 변경) => 인터페이스 (스프링)
 *          
 *          class A
 *          {
 *             a(){}
 *             b(){}
 *             c(){}
 *          }
 *          
 *          class B extends A
 *          {
 *             a(){}
 *             b(){}
 *             c(){}
 *             d(){}
 *          }
 *          
 *          A aa=new B();  => aa.a(),aa.b() ,aa.c(), //aa.d()
 *          B bb=new B();
 */
public class 자바정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
