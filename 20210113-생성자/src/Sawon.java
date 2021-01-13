import java.util.Scanner;
public class Sawon {
    String name;//null
    String sex;// null
    String dept;//null
    String loc;//null
    long pay;//0L
    // Sawon(){} => 생성자를 추가하지 않는다 
    Sawon(){
    	System.out.println("멤버변수에 대한 초기화 담당");
    	System.out.println("이름:"+name);
		System.out.println("성별:"+sex);
		System.out.println("부서명:"+dept);
		System.out.println("근무지:"+loc);
		System.out.println("연봉:"+pay);
    }
    Sawon(String name,String sex,String dept,String loc,long pay){
    	/*
    	 *   변수에 대입 
    	 *   멤버변수 
    	 *     = 인스턴스변수
    	 *     = static : 공통변수(클래스변수)
    	 *   지역변수 
    	 *     = 메소드안에 선언 
    	 *     = 매개변수 
    	 *     
    	 *   =====> 우선 적용 (지역변수가 우선순위)
    	 *          1. 지역변수,매개변수를 찾는다 
    	 *          2. 멤버변수에서 찾는다 
    	 */
    	this.name=name;
    	this.sex=sex;
    	this.dept=dept;
    	this.loc=loc;
    	this.pay=pay;
    	// 구분시에는 반드시 this를 이용해서 사용
    	System.out.println("this="+this);
    	
    	// 클래스안에 선언된 모든 메소드(제외:static)에서 this를 사용할 수 있다)
    	// 모든 메소드 => 생성자가 포함이 된다 
    	// 생성자는 사용자가 입력한 데이터를 받아서 멤버변수의 초기값을 설정
    	// 외부에서 읽어와서 저장 
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 사용자가 입력 
		/*Sawon sa=new Sawon();
		Scanner scan=new Scanner(System.in);
		System.out.print("이름 입력:");
		sa.name=scan.next();
		System.out.print("성별 입력:");
		sa.sex=scan.next();
		System.out.print("부서명 입력:");
		sa.dept=scan.next();
		System.out.print("근무지 입력:");
		sa.loc=scan.next();
		System.out.print("연봉 입력:");
		sa.pay=scan.nextInt();
		//출력
		System.out.println("이름:"+sa.name);
		System.out.println("성별:"+sa.sex);
		System.out.println("부서명:"+sa.dept);
		System.out.println("근무지:"+sa.loc);
		System.out.println("연봉:"+sa.pay);
		//return;
		 
		*/
		Scanner scan=new Scanner(System.in);
		System.out.print("이름 입력:");
		String name=scan.next();
		System.out.print("성별 입력:");
		String sex=scan.next();
		System.out.print("부서명 입력:");
		String dept=scan.next();
		System.out.print("근무지 입력:");
		String loc=scan.next();
		System.out.print("연봉 입력:");
		long pay=scan.nextInt();
		// 클래스를 저장 
		Sawon sa=new Sawon(name,sex,dept,loc,pay);
		Sawon sa1=new Sawon(name,sex,dept,loc,pay);
		Sawon sa2=new Sawon(name,sex,dept,loc,pay);
		
		/*
		 *   JVM 
		 *   메모리에 저장 
		 *   Sawon sa=new Sawon()
		 *         == 메모리를 만들어서 메모리주소를 sa에 저장 
		 *                =======
		 *                 sa가 가지고 있는 변수에 대한 초기값을 저장
		 *   this=sa;
		 */
		System.out.println("sa="+sa);
		//출력
		System.out.println("이름:"+sa.name);
		System.out.println("성별:"+sa.sex);
		System.out.println("부서명:"+sa.dept);
		System.out.println("근무지:"+sa.loc);
		System.out.println("연봉:"+sa.pay);
		/*
		 *     Sawon sa;
		 *     sa=new Sawon()
		 *     sa=new Sawon(name,sex,dept,loc,pay);
		 *     ====sa===
		 *        100
		 *     =========
		 *              100==============
		 *                 ===name====  sa(100).name
		 *                   이순신
		 *                 ===========
		 *                 
		 *                 ====sex====
		 *                   남자
		 *                 ===========
		 *                 
		 *                 ====dept===
		 *                   개발부
		 *                 ===========
		 *                 
		 *                 ====loc====
		 *                    부산
		 *                 ===========
		 *                 
		 *                 ====pay====
		 *                   4500
		 *                 ==========
		 *  
		 *               ==============
		 */
	}

}







