/*
 *    클래스 
 *     1) 구성요소 
 *        = 변수 
 *          멤버변수 : 클래스가 가지고 있는 변수 : new를 사용하면 따라 생성되는 메모리 공간  
 *          class A
 *          {
 *             ============== 자동 초기화 
 *              String name; name=null
 *              int age;     age=0
 *             ==============
 *               int = 0
 *               double = 0.0
 *               float = 0.0F
 *               boolean = false
 *               String = null
 *          }
 *          공유변수 : 클래스에서 공통으로 사용되는 변수 : 1개만 생성 
 *          class A
 *          {
 *             ====================
 *             static String dept;
 *             ====================
 *          }
 *          지역변수 : 메소드안에서 선언 
 *          class A
 *          {
 *              void display()
 *              {
 *                  ==========
 *                  int a=10; ===> 지역변수는 반드시 초기화를 한다 
 *                  ==========  display()가 종료하면 사라지는 변수 
 *              }
 *          }
 *          
 *          코드 영역 
 *          =======
 *           class 
 *           {
 *              선언만 가능 = 변수 선언 , 메소드 선언 => 구현은 할 수 없다 (메소드 호출,연산처리,제어문(X))
 *           }
 *           method()
 *           {
 *               선언(변수선언) , 메소드 호출 ,연산처리 , 제어문
 *           }
 *           ==> 사용자 요청 => 처리 (구현)
 *           프로그램 : 선언(필요한 데이터 선언) + 데이터 처리(읽기,쓰기,연산처리,제어문)
 *           
 *        = 메소드 : 기능 처리 
 *                 예) 자판기 
 *                    ======
 *                    동전,지폐 ==> 변수 
 *                    음료수 
 *                    =======
 *                    기능 => 동전을 첨부
 *                           버튼을 클릭 
 *                           잔돈을 계산 
 *                           
 *                    클래스 => 명사형 + 동사형
 *                            =====   =====
 *                             변수     메소드 
 *          형식)
 *               = 메소드는 항상 클래스 {}안에 존재 
 *                 ===== 클래스 종속
 *               class A
 *               {
 *                  메소드1(){}
 *                  메소드2(){}
 *                  메소드3(){}
 *                  메소드4(){}
 *                  메소드5(){}
 *                  // 지정 => 시작 메소드 => main 프로그램안에는 반드시 main이 1개이상 존재 
 *               }
 *               
 *               메소드의 구성 요소 
 *               ==============
 *               1. 리턴형(반환값)
 *               2. 메소드명 
 *               3. 매개변수 
 *               
 *               => 1. 사용자가 입력한 데이터를 받아서 => id,pwd
 *                  2. 요청 처리  => login처리 {}
 *                  3. 결과값을 전송 => true/false
 *                  
 *               형식)
 *                                    메소드=> 다른클래스와 연결할때 주로 사용 (의미를 부여)=> 재사용
 *                                    =======
 *                    리턴형(데이터형)    메소드명 (매개변수...: 사용자로부터 받는 값)
 *                    ============
 *                    기본데이터형
 *                     = 정수(int,long,byte,short)
 *                     = 실수(float,double)
 *                     = 논리(boolean)
 *                     = 문자(char)
 *                    참조형데이터(데이터가 여러개인 경우) 
 *                     = 배열 : 목록출력 
 *                     = 클래스 : 상세보기 
 *                     
 *                = 리턴형 (O) , 매개변수(O) => 상세보기 
 *                = 리턴형 (O) , 매개변수(X) => 목록 출력 
 *                =============================================
 *                = 리턴형 (X) , 매개변수(O)
 *                = 리턴형 (X) , 매개변수(X) => 자주 사용하지 않는다 
 *                =============================================
 *                반드시 void라고 사용한다 ==> 데이터베이스 (수정,삭제,추가)
 *                
 *                = 멤버메소드 => 리턴형 메소드명(매개변수...) => new를 이용해서 저장 
 *                = 공유메소드 => static 리턴형 메소드명(매개변수...) : 자동으로 저장 
 *                              데이터형 변환 
 *                              String.valueOf()
 *                              String s="Hello";
 *                              s.substring()
 *                              String s1="Java"
 *                              
 *                              String s="Hello Java!!";
 *                              s.substring(0,2)
 *                              String s1="Oracle Hello!!";
 *                              
 *                              String.valueOf(10)  => "10"
 *                              String.valueOf(true) => "true"
 *                              
 *                              Math.random()
 *                              
 *               
 *        = 생성자 
 *        
 *        동작 : 일치 ==> static 
 *        동작 : 다르다 ==> 인스턴스 메소드 
 */
/*
 *    학생 성적 계산 
 *    저장되는 데이터 
 *    학점
 *    총점
 *    평균 
 *    점수 입력 
 */
import java.util.Scanner;
/*
 *   static은 멤버메소드 아니라 => 독립적인 메소드 
 */
public class 클래스구성요소 {
	String name;
	int kor,eng,math;
	// 멤버는 멤버에서 사용이 가능 
	// 점수 입력
	int input(String subject)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(subject+" 점수 입력:");
		return scan.nextInt();
	}
	void input2()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("국어점수 입력:");
		kor=scan.nextInt();
		System.out.print("영어점수 입력:");
		eng=scan.nextInt();
		System.out.print("수학점수 입력:");
		math=scan.nextInt();
	}
	// 총점 
	int jumsuTotal()
	{
		return kor+eng+math;
	}
	// 평균
	double jumsuAvg()
	{
		return (kor+eng+math)/3.0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 클래스저장 
		클래스구성요소 hong=new 클래스구성요소();
		클래스구성요소 shim=new 클래스구성요소();
		클래스구성요소 kim=new 클래스구성요소();
		//hong.kor=hong.input("국어");
		//hong.eng=hong.input("영어");
		//hong.math=hong.input("수학");
		hong.input2();
		int total=hong.jumsuTotal();
		double avg=hong.jumsuAvg();
		
		shim.input2();
		kim.input2();
		// 출력 
		System.out.println("국어점수:"+hong.kor);
		System.out.println("영어점수:"+hong.eng);
		System.out.println("수학점수:"+hong.math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f",avg);
	}
}








