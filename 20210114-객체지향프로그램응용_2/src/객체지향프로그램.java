/*
 *    1. static => instance메소드(변수) 호출 
 *       => 다른 클래스에서 불러서 사용 
 *    2. instance메소드 => static 
 *       => 다른 클래스에서 불러서 사용 
 *       
 *    class A
 *    {
 *        int a;
 *        static int b;
 *        
 *        public void disp1()
 *        {
 *           기능 처리
 *        }
 *        public static void disp2()
 *        {
 *           기능 처리
 *        }
 *        
 *        // main
 *        public static void main(String[] args)
 *        {
 *           //1 . static 메소드 호출 , static 변수 호출 
 *           System.out.println(b); => 같은 클래스안에 있는 경우 
 *           disp2();
 *        }
 *    }
 */
class A
{
	static int b=100;
	int c=200;
	public void disp()
	{
		System.out.println("A:disp() Call...");
	}
	public static void display()
	{
		System.out.println("A:display() Call");
	}
}
public class 객체지향프로그램 {
    static int a=10;
    public static void disp()
    {
    	System.out.println("disp:Call...");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("a="+a);
        객체지향프로그램.disp();
        A.display();
        System.out.println("b="+A.b);
        // 인스턴스 항상 => 메모리에 저장하는 공간을 만들고 => 저장후에 사용 
        //               ======================== 동적 메모리 할당 (new)
        A a=new A(); // c,disp()
        a.disp();
        System.out.println("a.c="+a.c);
	}

}








