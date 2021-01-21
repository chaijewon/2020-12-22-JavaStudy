package com.sist.main;
/*
 *   JDK 1.0
 *   JDK 1.2 => ������ (swing)
 *   JDK 1.5 => ���׸� , printf
 *   (1.6,1.7)
 *   ============ SUN
 *   JDK 1.8
 *     |  ����Ŭ (C����) => interface���� , ���ٽ� (�Լ�������) , ������(JavaFX)
 *        ============ ������ (����Ŭ : ERP) SAP(MS) 
 *                                       ()->{}
 *   �������̽� (interface)
 *   1) �߻� Ŭ������ ���� => �߻�Ŭ������ ������ ���� 
 *      # �ڹ��� Ŭ������ ������ ���� ��Ӹ� ���� 
 *      # �������̽��� Ŭ������ (���� ����� ����)
 *   2) ���� 
 *      ���������� interface �������̽���{
 *         =================
 *           ���� (�������(X)) : ����� ���� 
 *         =================
 *           �߻�޼ҵ� (����� �޼ҵ�)
 *         =================
 *           ������ �޼ҵ� (JDK 1.8 �̻�)
 *           default 
 *         =================
 *           static 
 *         =================
 *      }
 *      ========
 *      public|default
 *    3) �߻� Ŭ������ ���� => �������� �Ӽ��� ��Ƽ� ���� => �����ؼ� ��� 
 *       ** ���� �ٸ� Ŭ������ ������ �� ��� 
 *       ** ǥ��ȭ�� �����ϴ� 
 *     
 *     *** �������̽��� ��� ������ ��� �޼ҵ�� public�� ����� ���� 
 *     public interface Common
 *     {
 *        ***** int a; // ����� ���� ==> int a=10;  ==> public static final int a;
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
 *        public void display(){} // ���� 
 *     }
 *     
 *     �������̵� : ��������� Ȯ��� ���� , ��� �Ұ��� 
 *     
 *     ��� 
 *      class A
 *      class B     ==> Ŭ����A�� Ŭ����B�� ��� 
 *                      class B extends A
 *      interface A
 *      class B     ==> �������̽�A�� Ŭ����B�� ���
 *                      class B implements A
 *      =============================================                
 *      interface A
 *      interface B  ==> �������̽�A�� �������̽�B�� ��� 
 *                      interface B extends A
 *      
 *      ============================================���� (�������̽��� Ŭ�����κ��� ����� ���� �� ����)
 *      class A
 *      interface B  ==> classA�� �������̽�B�� ��� 
 *                     interface B extends A  (XXXXXXXXXXXXXXXXXXXXXX)
 *                     
 *      interface A
 *      interface B extends A
 *      class C implements B   ===========> ���ϻ�� 
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
 *    Instance�޼ҵ� => instance����,instance�޼ҵ� ����� ���� 
                          static����,static�޼ҵ� ȣ���� ���� 
      Static�޼ҵ� =>  static����,static�޼ҵ� ȣ���� ���� 
                     �ν��Ͻ� ���� => ��ü�� �����ؼ� ��� 

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























