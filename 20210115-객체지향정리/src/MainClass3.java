// 학교 => 반복 제거 , 유지보수가 편하다  => 상속(추상 = 공통점)
class 사람
{
	private String name;
	private String sex;
	private int age;
	private int height,weight;
	public void eat() {}
	public void run() {}
}
class 학생 extends 사람
{
	private int hakbun;
	//private String name;
	//private String sex;
	//private int age;
	private String subject;
}
class 교직원 extends 사람
{
	private int sabun;
	//private String name;
	//private String sex;
	//private int age;
	private String dept;
}
class 교수 extends 사람
{
	private int pbun;
	//private String name;
	//private String sex;
	//private int age;
	private String subject;
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
