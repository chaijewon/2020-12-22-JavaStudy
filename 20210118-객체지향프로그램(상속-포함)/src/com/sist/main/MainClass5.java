package com.sist.main;
/*
 *    제어자 (page 344)
 *    ================
 *    접근 지정어 : public , protected , default , private 
 *    클래스 
 *    =====
 *      클래스 : public , default 
 *      멤버변수 : public , protected , default , private 
 *      ===============================================
 *      메소드 : public , protected , default , private 
 *      생성자 : public , protected , default , private 
 *      ============================================== 다른 클래스와 연결 => public 
 *      
 *    final , static , abstract , synchronized
 *    =====
 *    마지막 => 상속을 할 수 없는 클래스 , 상수
 *    static : 공통적인 
 *    abstract : 추상적인 => 구현 하지 않고 사용 
 *    synchronized : 동기화,비동기화 
 *                   =====
 *                   메소드는 기본적으로 동기화 
 *                   
 *    class A
 *    {
 *        public void aaa(){}
 *        public void bbb(){}
 *        public void ccc(){}
 *        public void ddd(){무한루프}
 *        public void eee(){}
 *    }
 *    class B
 *    {
 *        public static void main(String[] args)
 *        {
 *            A a=new A();
 *            a.aaa();
 *            a.bbb();
 *            a.ccc();
 *            a.ddd();
 *            a.eee();
 *        }
 *    }
 *    
 *    =====================
 *    
 *    =====================
 *        eee()
 *    =====================
 *        ddd()
 *    =====================
 *        ccc()
 *    =====================
 *        bbb()
 *    =====================
 *        aaa()   => 종료    
 *    =====================
 *       Call Stack
 *       
 *       =========  ========  =========  =-=======   =======
 *          aaa()    bbb()      ccc()      ddd()      eee()   ==> 쓰레드 
 *       =========  ========  =========  =========   =======
 *       
 *       
 *       사용방법 (page 353)
 *       클래스 
 *       접근지정어 옵션   class  className
 *                [final,abstract]
 *       [public,default]
 *       
 *       public final class String
 *       public abstract class String
 *       final class String
 *       abstract class String
 *       =============================
 *       
 *       메소드 
 *       접근지정어 옵션 리턴형 메소드명()
 *       ======= === [final|abstract|static]
 *       [public|private|default|protected]
 *       
 *       멤버변수 
 *       접근지정어 옵션 데이터형 변수명 
 *       ======= ===[final | static]
 *       [public|private|default|protected]
 *       
 *       => 접근지정어 옵션 
 *          public static
 *       => 옵션 접근지정어 
 *          static public 
 */
class Student
{
	private int hakbun;
	public String name;
	protected String sex;
	int kor=100;
	public void aaa() {
		final int a=10;
		// only final 
	}
	private void bbb() {
		
	}
	void ccc() {}
	protected void ddd() {}
	
	public Student() {}
	private Student(int a) {}
	Student(int a,int b){}
	protected Student(int a,int b,int c) {}
}
class Student2 extends Student{
	int kor=200;
	public Student2()
	{
		//this.kor=200;
		//super.kor=300;
		this.kor=10000;
		super.kor=20000;
		System.out.println("super.kor:"+super.kor);
		System.out.println("this.kor:"+this.kor);
	}
}
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s=new Student();
        Object o=new Student();
        Student s1=(Student)o;
        System.out.println(s1.kor=100);
        s=new Student2();
        Student2 s2=(Student2)s;
        System.out.println(s2.kor=1000);
        /*Student2 s2=new Student2();
        s2=(Student2)s;
        s2.kor=1000;
        System.out.println(s2.kor);*/
	}

}



