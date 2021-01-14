/*
 *    상속 
 *     => 기존의 클래스의 모든 기능과 모든 데이터를 받아서 확장하는 클래스를 만든다 
 *     => 상속의 형식 
 *        =========
 *        class A
 *        class B extends A
 *             ===        == 상속을 내리는 클래스
 *             상속을 받는 클래스 
 *     => 자바 상속은 단점 => 단일 상속
 *        
 *     => 재사용 : 있는 그대로 사용 : 포함클래스 
 *               변경해서 사용 : 상속 
 *               
 *     => 사용법 
 *        extends 
 *        
 *        class A
 *        class B extends A
 *        *** 상속을 받는 경우 (기본은 상속내리는 클래스의 모든을 받아 온다)
 *            단 예외 조건 (static변수,static메소드,생성자는 예외)
 *                       ====================== 상속받은 클래스는 사용이 가능
 *            private은 상속은 내려가는데 사용은 불가능하다 (private => protected)
 *    => 중북을 제거할때 
 *    
 *    class A
 *    {
 *        int a=10;
 *        int b=20;
 *        public void display()
 *        {
 *        }
 *    }
 *    A => a,b,display()
 *    class B extends A
 *    {
 *       ==============================
 *        오버라이딩
 *        int a=100;
 *        int b=200;
 *        public void display()
 *        {
 *        }
 *       ==============================
 *       
 *       public void bbb()
 *       {
 *       }
 *    }
 *    
 *    B ==> a,b,display() ,bbb()
 *    
 *    클래스의 크기를 비교 => 상속을 내리는 클래스가 크다  (상속)
 *    동물 
 *     |
 *    사람 (사람,동물)
 */
class SuperClass
{
	int a=10;
	int b=20;
	
}
public class SubClass {
    //int a=10;
    //int b=20;
    //포함 
	SuperClass sc=new SuperClass();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SubClass s=new SubClass();
        System.out.println(s.sc.a);
        System.out.println(s.sc.b);
        
	}

}














