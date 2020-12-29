/*
 *   산술연산자 
 *     / , %
 *     나눗셈(/) 
 *       1. 0으로 나눌 수 없다     10/0 => error
 *       2. 정수/정수=정수
 *          5/2=2.5(X)   5/2=2  ==> 5/2.0 =2.5
 *          double d=5/2.0 ==> 2.0
 *     % 나누고 나머지값 => 배수 
 *       1. 주의점 : 결과값은 왼쪽편의 부호를 따라간다 
 *          5%2  ===> 1  1+4/2
 *          -5%2 ===> -1 -1-4/2
 *          5%-2 ===> 1  1+4/2
 *          -5%-2 ===> -1      -5*-2=10  -1-4/-2
 *          
 *          문자열 입력을 받아서 좌우대칭인지 여부를 출력 
 *          ABBA
 *          
 *        ==> 자동 형변환 
 *        ==> 프로그래머가 변경 (강제 형변환)
 */
// 최적화 
// 에러를 예측 (오류 방지) 
public class 연산자_산술연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=3;
		System.out.println(a/(double)b);
		//a=10;
		//b=0;
		//System.out.println(a/b); 
		int a1=5;
		int a2=2;
		int a3=-5;
		int a4=-2;
		System.out.println(a1%a2);// 5%2 = 1
		System.out.println(a1%a4);// 5%-2 =1
		System.out.println(a3%a2);// -5%2 =-1
		System.out.println(a3%a4);// -5%-2=-1
	}

}

















