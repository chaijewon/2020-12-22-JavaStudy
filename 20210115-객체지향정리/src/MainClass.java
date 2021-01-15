class Student /*extends Object*/{
	private int hakbun;//0
	private String name;//null
	private String sex;//null
	public Student(int hakbun,String name,String sex)
	{
		// 멤버변수 , 지역변수 => 우선 순위 (지역변수 => 멤버변수) 
		// 지역변수와 멤버변수의 변수명이 동일 => this로 구분 
		// 모든 멤버메소드(인스턴스메소드에는 this가 사용된다) => 구분이 없는 경우는 this생략이 가능 
		this.hakbun=hakbun;// this를 생략했다 
		this.name=name;
		this.sex=sex;
	}
	public void print()
	{
		System.out.println("학번:"+hakbun);
		System.out.println("이름:"+name);
		System.out.println("성별:"+sex);
		System.out.println("this="+this);
		/*
		 *   인스턴스가 생성시마다 => 각자 this라는 자신의 객체를 가지고 있다 
		 *   this => 컴파일시에 자동 생성 
		 *   
		 *   Student s=new Student()
		 *          ===주소 
		 *   this=s;
		 *   
		 *   Student s1=new Student()
		 *   this=s1;
		 *   
		 *   this=> static으로 설정 => 사용시마다 주소값이 변경 
		 *   
		 */
		
		/*
		 *    인스턴스변수 => 초기화 
		 *    ==================
		 *     1.명시적 초기화   ======> int page=1; , totalpage=3768
		 *     class Recipe
		 *     {
		 *         int page=1;
		 *         int totalpage=150001/10;
		 *         //if(150001%15>0)
		 *           // totalpage++;
		 *         public Recipe()
		 *         {
		 *             totalpage=150001/10;
		 *             if(150001%15>0)
		 *             totalpage++;
		 *         }
		 *         
		 *         {
		 *             totalpage=150001/10;
		 *             if(150001%15>0)
		 *             totalpage++;
		 *         }
		 *     }
		 *     2.생성자 
		 *     3.초기화 블럭
		 *     4. setTotalPage() : 멤버변수를 변경할 경우에 사용
		 *     5. 값 읽기 => getXxx() 
		 *     
		 *     ========= 변수 (메모리에 저장,메모리에서 읽기)
		 *                    setter / getter
		 */
	}
}
public class MainClass /*extends Object*/{

	static  public void main(String[] args) {
		// TODO Auto-generated method stub
        Student s1=new Student(1,"홍길동","남자");
        System.out.println("s1="+s1);
        //s1.Student(1, "홍길동", "남자");// s1이 가지고 있는 멤버메소드 
        s1.print();
        Student s2=new Student(2,"심청이","여자");
        System.out.println("s2="+s2);
        s2.print();
	}

}




