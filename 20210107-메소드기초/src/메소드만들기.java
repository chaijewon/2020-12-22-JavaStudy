/*
 *    메소드 유형 
 *    =====
 *    리턴형(결과값) 메소드명(매개변수목록)// 선언부
 *    ===========       ===========
 *    {
 *         구현부 
 *    }
 *    ***** 메소드는 {}가 없으면 메모리에 저장이 안된다 (추상메소드외)
 *    
 *    리턴형(결과값) : 사용자가 요청한 내용을 처리한 결과값
 *                  결과값은 1개만 사용이 가능 
 *                  *** 여러개의 결과값이 나오는 경우 (배열,클래스)
 *                  *** 처리후에 결과값이 없는 경우에는 void (자체에서 결과을 출력)
 *    1)결과값 메소드명(매개변수...)
 *    =====
 *    {
 *       값을 전송하는 방법 
 *       return 값
 *              ==
 *    }
 *    ****** return을 반드시 필요로 한다 
 *    void 메소드명(매개변수...)
 *    {
 *        // return이 없는 경우에는 JVM이 자동으로 추가(생략이 가능)
 *    }
 *    void 메소드명(매개변수...)
 *    {
 *       return; // 메소드가 종료
 *    }
 *    
 *    2) 메소드명 (변수명과 동일) : 식별자
 *       의미가 있으면 좋다 , 글자수는 제한이 없다 
 *       알파벳이나 한글로 시작한다 (단 알파벳은 대소문자를 구분한다)
 *       숫자는 사용가능 (앞에 사용금지)
 *       키워드는 사용할 수 없다 
 *       특수문장 사용이 가능 ( _ , $ )
 *       *** 변수,메소드 => 소문자로 시작 (단어가 두개이상일 경우 => next int  => nextInt():헝거리언식 표기법
 *       ========================== 권장사항 (프로그래머의 약속)
 *       메모리 공간 
 *       ================
 *        
 *        Method 영역 
 *       ================
 *       
 *        Stack ==> 지역변수 , 매개변수 ==> {}을 벗어나면 자동으로 메모리에서 삭제
 *        if(a<10)
 *        {
 *           int b=10;
 *        }//b는 사라진다 
 *       ================
 *       
 *        Heap  ==> new => 사용자 정의 (GC)
 *       ================
 *     3) 매개변수 (인자) : 기본데이터형 , 배열 , 클래스
 *        *** 사용자가 요청하는 값 
 *        
 *     4) 구현부 {구현하는 부분} => 사용자 요청에 대한 처리 => 종료는 반드시 return
 *        *** void일 경우에는 생략이 가능 
 *        return은 항상 마지막줄에 있는 것은 아니다
 *        
 *        void display()
 *        {
 *           if()
 *           {
 *               return; // 메소드 종료
 *               // 소스코딩이 불가능 (break,continue)
 *           }
 *           ...
 *           ...
 *           ...
 *           ...
 *           return;
 *           
 *        }
 *        
 *    메소드의 종류 
 *    ===================================================
 *       리턴형     매개변수 
 *    ===================================================
 *         O         O       String substring(int start)   ====> 1
 *    =================================================== 
 *         O         X       double random()               ====> 2
 *    ===================================================
 *         X         O       void println(10) ("aaa") ('A') ===> 3
 *    ===================================================
 *         X         X       void println()                 ====> 4 
 *    ===================================================
 *    ** 리턴형은 1개만 사용 
 *       매개변수는 여러개 사용이 가능 
 *       
 *       
 *    static void display() ===> 자동 저장 (클래스메소드)
 *    void display() =========> 저장 (멤버메소드)
 *     
 */
import java.util.Scanner;
public class 메소드만들기 {
    // 메소드는 클래스{}안에서 제작
	// 사용자로부터 단을 받아서 구구단을 출력 ==> 3유형 (리턴형(X),매개변수(0))
	static void gugudan(int dan)
	{
		// 블록안에서 직접 처리
        for(int i=1;i<=9;i++)
        {
        	System.out.printf("%d*%d=%d\n",dan,i,dan*i);
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("단 입력:");
        int dan=scan.nextInt();
        // 메소드 호출  => 메소드명(실제값)
        gugudan(dan);
        /*for(int i=1;i<=9;i++)
        {
        	System.out.printf("%d*%d=%d\n",dan,i,dan*i);
        }*/
        System.out.println("프로그램 종료");
        
	}

}













