/*
 *     형식)
 *         if(조건문) => 조건문(연산자,부정,비교,논리)
 *         {
 *             조건문이 true일때 처리하는 문장
 *             (여러문장을 수행할 수 있다)
 *         }
 *         else
 *         {
 *             조건문이 false일때 처리하는 문장
 *             (여러문장을 수행 할 수 있다)
 *         }
 *         
 *     오류)
 *          if(조건문)
 *          {
 *            실행문장 1
 *            실행문장 2
 *          }
 *          else =======> if밑에서 처리 (else는 단독 실행문장을 만들 수 없다)
 *            실행문장 3
 *          
 *          // 자바
 *          if(조건문){
 *          }
 *          // C
 *          if(조건문)
 *          {
 *          
 *          }
 *          
 *         []
 *         int[] arr
 *         int arr[]
 */
// 3개의 정수를 입력 => 평균 ==> 60이상이 Pass 아니면 Non-Pass
import java.util.Scanner;
public class 선택조건문_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 입력받은 데이터를 저장할 공간이 필요 => 정수 4
		int kor,eng,math,avg;
		Scanner scan=new Scanner(System.in);
		// 사용자 입력 : 국어
		System.out.print("국어 영어 수학 점수 입력:");// enter, space
		kor=scan.nextInt();
		eng=scan.nextInt();
		math=scan.nextInt();
		/*System.out.print("국어 점수 입력:");
		kor=scan.nextInt();
		
		System.out.print("영어 점수 입력:");
		eng=scan.nextInt();
		
		System.out.print("수학 점수 입력:");
		math=scan.nextInt();
		*/
		
		// 평균 => 가공 (연산자)
		avg=(kor+eng+math)/3;  // 정수/정수=정수 (소수점 제거한다)
		
		// 결과값을 출력 
		if(avg>=60)
			System.out.println("Pass");
		else
			System.out.println("Non-Pass");
	}
}



















