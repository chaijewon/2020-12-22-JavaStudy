package com.sist.munje;
/*
 *  ���� Ŭ�������� ��� �Լ��� ����� �߸��� ����?
Instance�޼ҵ� => instance����,instance�޼ҵ� ����� ���� 
                          static����,static�޼ҵ� ȣ���� ���� 
Static�޼ҵ� =>  static����,static�޼ҵ� ȣ���� ���� 
class StaticTest {    static int a;    static int getA() { return a; } //(1)    int b;    int getB() { return b; } //(2)     int f() { return getA(); } //(3)     static int g() { 
        StaticTest s=new StaticTest();
       return s.getB();
    } //(4)}

Static / instance 
=====
Instance�� �ٷ� ����� �� ���� 
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
public class ����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	}

}
