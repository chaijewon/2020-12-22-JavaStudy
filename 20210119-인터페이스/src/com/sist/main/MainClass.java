package com.sist.main;
/*
 *   JDK 1.0
 *   JDK 1.2 => 윈도우 (swing)
 *   JDK 1.5 => 제네릭 , printf
 *   (1.6,1.7)
 *   ============ SUN
 *   JDK 1.8
 *     |  오라클 (C형식) => interface변경 , 람다식 (함수포인터) , 윈도우(JavaFX)
 *        ============ 윈도우 (오라클 : ERP) SAP(MS) 
 *                                       ()->{}
 *   인터페이스 (interface)
 *   1) 추상 클래스의 일종 => 추상클래스의 단점을 보완 
 *      # 자바의 클래스는 무조건 단일 상속만 가능 
 *      # 인터페이스도 클래스다 (다중 상속이 가능)
 *   2) 형식 
 *      접근지정어 interface 인터페이스명{
 *         =================
 *           변수 (멤버변수(X)) : 상수형 변수 
 *         =================
 *           추상메소드 (선언된 메소드)
 *         =================
 *           구현된 메소드 (JDK 1.8 이상)
 *           default 
 *         =================
 *           static 
 *         =================
 *      }
 *      ========
 *      public|default
 *    3) 추상 클래스와 동일 => 공통적인 속성을 모아서 저장 => 구현해서 사용 
 *       ** 서로 다른 클래스를 연결할 때 사용 
 *       ** 표준화가 가능하다 
 *     
 *     *** 인터페이스는 모든 변수와 모든 메소드는 public만 사용이 가능 
 *     public interface Common
 *     {
 *        ***** int a; // 상수형 변수 ==> int a=10;  ==> public static final int a;
 *                                                    ====================
 *        void display(); // public abstract void display();
 *                           ===============
 *        public void display(); ====== abstract
 *        =====================
 *        default void aaa(){} // default public void aaa(){} 
 *                                        ======
 *        static void bbb(){} // static public void bbb(){}
 *                                      ======
 *     }
 *     
 *     public interface Common
 *     {
 *         (public abstract) void display();
 *     }
 *     # class A => class B   :  class B extends A
 *     # interface A => class B : class B implements A
 *     public class A implements Common
 *     {
 *        public void display(){} // 오류 
 *     }
 *     
 *     오버라이딩 : 접근저정어가 확대는 가능 , 축소 불가능 
 *     
 *     상속 
 *      class A
 *      class B     ==> 클래스A가 클래스B에 상속 
 *                      class B extends A
 *      interface A
 *      class B     ==> 인터페이스A가 클래스B에 상속
 *                      class B implements A
 *      =============================================                
 *      interface A
 *      interface B  ==> 인터페이스A가 인터페이스B에 상속 
 *                      interface B extends A
 *      
 *      ============================================오류 (인터페이스는 클래스로부터 상속을 받을 수 없다)
 *      class A
 *      interface B  ==> classA가 인터페이스B에 상속 
 *                     interface B extends A  (XXXXXXXXXXXXXXXXXXXXXX)
 *                     
 *      interface A
 *      interface B extends A
 *      class C implements B   ===========> 단일상속 
 *      
 *      interface A
 *      interface B
 *      class C implements A,B
 *      
 *      
 *      interface A
 *      interface B
 *      class C
 *      class D extends C implements A,B
 *            =========== ===============
 */
interface Common{
	int x=10;// public static final 
	void display();//public abstract 
	default void aaa() {
		
	}
	static void bbb() {
		
	}
}
/*
 *    Instance메소드 => instance변수,instance메소드 사용이 가능 
                          static변수,static메소드 호출이 가능 
      Static메소드 =>  static변수,static메소드 호출이 가능 
                     인스턴스 사용시 => 객체를 생성해서 사용 

 */
class AAA
{
	int i;
	//public AAA() {}
	public AAA(int i) {this.i=i;}
}
class BBB extends AAA
{
	int i=0;
	public BBB() {super(100);i=100;}
}
public class MainClass {
    static int a=10;
    int b=20;
    public void display()
    {
    	System.out.println("b="+b);
    	System.out.println("a="+a);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass m=new MainClass();
        System.out.println("b="+m.b);
        System.out.println("a="+a);
	}

}























