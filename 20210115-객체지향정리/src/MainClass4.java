/*
 *   상속 
 *    상속 내리는(상위 클래스) 클래스는 하위 클래스의 모든 데이터,메소드를 제어 할 수 없다 
 *     
 */
class Super
{
	int a=100;
	public void display() {
		System.out.println("Super:display() Call...");
	}
}
// 상속 : 기존의 클래스의 정보를 받아서 확장하는 새로운 클래스 
class Sub extends Super
{
	//Super s=new Super(); // has-a (포함 클래스) => 변경해서 사용할 수 없다 (있는 그래로 사용)
	/*
	 *      int a=100;
			public void display() {
				System.out.println("Super:display() Call...");
			}
	 */
	int a=1000;
	public void display() {
		System.out.println("Sub:display() Call...");
	}
	int b=200;
	public void bbb() {
		System.out.println("Sub:bbb() Call...");
	}
}
class 동물
{
	public void run()
	{
		System.out.println("걷는다!!");
	}
}
class 소 extends 동물{
	public void run()
	{
		System.out.println("소가 걷는다!!");
	}
}
class 돼지 extends 동물{
	public void run()
	{
		System.out.println("돼지가 걷는다!!");
	}
	 
}
class 말 extends 돼지{
	public void run()
	{
		System.out.println("말이 걷는다!!");
	}
	
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====== Super ======");
        Super s=new Super();
        System.out.println(s.a);
        s.display();
        System.out.println("====== Sub =======");
        Sub sub=new Sub();
        System.out.println("a="+sub.a+",b="+sub.b);
        sub.bbb();
        sub.display();
        System.out.println("======= Super>Sub ======");
        Super s1=new Sub(); // s1 => a , display
        s1.display();
        System.out.println(s1.a);
        // 클래스가 미완성된 클래스 (추상클래스,인터페이스) => 메모리에 클래스를 저장 할 수 없다 
        // 상위 클래스를 받아서 처리 : 상속받은 클래스가 여러개 있는 경우 
        
        // double d=int
        // Sub s2=(Sub)s;
        // int i=(int)double
        
        /*
         *   상위 클래스로 하위를 받는 경우
         *   class A
         *   class B extends A
         *   
         *   A a=new B();
         *   =   =======
         *   
         *   1. 멤버변수는 A클래스에 있는 변수를 사용한다 
         *   2. 메소드는 생성자 타입을 따라 간다 
         */
        동물 ani=new 소();
        ani.run();
        ani=new 말();
        ani.run();
        ani=new 돼지();
        ani.run();
        // 데이터가 여러개 있다 => 배열 (배열명으로 모든 데이터를 제어)
        // 다른 종류의 클래스가 여러개 있다 (상속을 받아서 상위클래스로 제어) Object로 제어한다 
        /*
         *   Sub sub=new Sub();
         *   Super sup=new Sub();
         *   Object obj=new Sub();
         */
        Object obj=new Sub();
        // 상위클래스 제어 => 오버라이딩 메소드 
        
        //Sub ss=new Super(); 사용 금지
        Sub ss=new Sub();
        Super su=new Super();
        //ss=(Sub)su;
        //su=ss;
        /*
         *   생성자에 따라 호출되는 메소드가 달라진다 
         *   ===============================
         *   동적 바인딩 
         *   C언어 : 정적바인딩 => 가상함수 : 실행시마다 메소드의 주소를 변경 ,변경된 주소를 저장 
         */
        
	}

}








