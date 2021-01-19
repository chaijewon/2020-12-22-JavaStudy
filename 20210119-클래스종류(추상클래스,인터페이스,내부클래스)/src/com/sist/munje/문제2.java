package com.sist.munje;
/*
 *  다음 클래스에서 멤버 함수의 사용이 잘못된 것은?
Instance메소드 => instance변수,instance메소드 사용이 가능 
                          static변수,static메소드 호출이 가능 
Static메소드 =>  static변수,static메소드 호출이 가능 
class StaticTest {    static int a;    static int getA() { return a; } //(1)    int b;    int getB() { return b; } //(2)     int f() { return getA(); } //(3)     static int g() { 
        StaticTest s=new StaticTest();
       return s.getB();
    } //(4)}

Static / instance 
=====
Instance을 바로 사용할 수 없다 
 */
// page 278 => 2,3
class StaticTest {
	 static int a;
	 static int getA() { return a; } //(1)    
	 int b;
	 int getB() { return this.b; } 
	 //(2)     
	 int f() { return this.getA(); } 
	 //(3)     
	 static int g() { 
		 StaticTest s=new StaticTest();
       return s.getB();    
       } //(4)
	 }
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	}

}
