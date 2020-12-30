/*
 *    switch(조건식) => 정수, 문자 
 *    switch(avg/10)
 *    1) 조건식을 계산 => 정수,문자 
 *    2) 계산된 동일한 case를 찾는다 
 *    3) case밑에 있는 문장을 수행 
 *    4) break가 있는 경우에는 switch를 종료 => break가 없는 경우에는 밑에 있는 case를 수행 
 *    ***** 순서는 상관없다 , 같은 라벨은 사용 할 수 없다 
 *    ***** 무조건 break를 사용하는 것은 아니다 
 *    switch(정수)
 *    {
 *      case 1:
 *      case 1:  ===> 오류 
 *    } 
 *    
 *    switch(정수) ==> 보기 편하기 
 *    {
 *      case 5:
 *      case 1:
 *      case 3:
 *      case 4:
 *      case 2:  ===> 오류가 아니다 (정상수행문장)
 *    }
 *    
 *    switch(정수) 정수 => 3
 *    {
 *       case 1:
 *          문장 1
 *       case 2:
 *          문장 2
 *       case 3:     ==> 문장 3 , 문장 4 , 문장 5
 *          문장 3
 *         
 *       case 4:
 *          문장 4
 *           break;
 *       default :
 *          문장 5
 *    }
 *    break가 존재하는 위치 종료 
 *    
 *    1. switch 
 *       1) case에 등록할 수 있는 데이터형 (정수, 문자 , 문자열)
 *          => 실수 (float,double) , boolean 제외 
 *       2) break 사용위치 => case 위치부터 break에 있는 case까지 수행 
 *       3) case에 등록이 안된 데이터가 들어 왔을때 처리하기 위해서는 
 *          default를 사용한다 (default는 생략이 가능)
 *          
 *          ** char는 정수취급 
 *          byte < char < int < long < float < double
 *                ======
 *          page 148 
 *          문자열 : jdk1.7이상 ==> 14.0.2 => 문자열을 허용 
 *          *** case의 값이 중복되면 안된다 (정렬)
 */
// 사칙연산 (+,-,*,/)
import java.util.Scanner;// 사용자로부터 키보드 입력값을 받는 경우 
/*
 *   프로그램 구성 
 *   ==========
 *     변수(배열,클래스) 
 *     연산자 
 *     제어문 
 *     ==============
 *       재사용 (메소드 => 연산자+제어문)  println("") Math.random() , nextInt()
 *       메소드 여러개 => 클래스
 */
public class 선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 산술 연산자 => 이항연산자 (값 2개가 필요)
		int num1,num2;
		String op;
		// 사용자로부터 데이터 받기 
		Scanner scan=new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력:");
		num1=scan.nextInt();
		
		System.out.print("두번째 정수 입력:");
		num2=scan.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/):");
		// Scanner => char는 받지 못하고 => 문자열로만 받는다  => 문자열 데이터형 (String)
		op=scan.next();
		char c=op.charAt(0);// 문자열에서 첫번째 문자를 읽어 온다 
		
		// 데이터 처리 => 경우수 => 5
		switch(c)
		{
		case 43:
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
			break;
		case 45:
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
			break;
		case 42:
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
			break;
		case 47:
			if(num2==0) // 오류처리
				System.out.println("0으로 나눌 수 없습니다");
			else
				System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
			break;
		default:
			System.out.println("잘못된 연산자입니다");
		}
		
		System.out.println((int)'+');// '+' 43
		System.out.println((int)'-');// '-' 45
		System.out.println((int)'*');// '*' 42
		System.out.println((int)'/');// '/' 47
		// 문자열 , 문자 , 정수

	}

}






