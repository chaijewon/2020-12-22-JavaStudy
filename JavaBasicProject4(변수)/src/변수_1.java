/*
 *   프로젝트명칭 (문법없다) => 본인 찾기 쉽게 만든다 
 *   변수 , 클래스명 명칭법 
 *   1. 알파벳,한글로 시작 (알파벳 사용시 => 대소문자 구분)
 *      웹프로그램에서는 한글 사용시 인식을 못할 수 있다(권장사항 : 알파벳)
 *   2. 이름의 길이는 제한하지 않는다 (5~10)
 *      a,b,c => kor eng , math
 *   3. 숫자는 사용이 가능 (앞에 사용할 수 없다)
 *      2a , 3a (X) ==> a1 , a1b
 *   4. 특수문자 : $ , _
 *   5. 키워드 (자바에서 이미 사용중이 단어)는 사용 할 수 없다 (색상이 빨간색)
 *   
 *   => 목표 
 *      1. 변수 
 *      2. 데이터형 
 *      ==========================
 *      3. 연산자 일부 (단항,이항,삼항) : 보류
 *      
 *      책 page 20
 *      ==========
 *      1. 09시 ~ 13 => 기본 문법 (책)
 *      2. 14시 ~ 17시 => 응용
 *      3. 18시 (문제풀이)=> 정리 
 *      ===========================
 *      
 *      변수 : 변하는 수 (값을 변경해서 사용 할 수 있다)
 *            => 한개의 데이터 저장할 수 있는 메모리 공간
 *            => 저장 : 컴퓨터에 명령을 내린다 
 *               1. 데이터 저장 크기를 설정 
 *                  (1byte , 2byte , 4byte , 8byte)
 *               2. 어디에 저장되는지 알 수가 없다 => 저장된 위치에 이름을 부여  
 *               3. 값을 첨부 (초기화)
 *               4. 가공 
 *            => 메모리 크기(데이터형 , 자료형)
 *               사용법) 데이터형(메모리 크기) 변수명 = 값
 *                      int a=100  
 *                      
 *            자바에서 제공하는 데이터형 (한개의 데이터만 저장이 가능 => 저장 메모리의 위치 : 변수)
 *            = 기본 데이터형
 *              정수형
 *                = byte (1byte) => -128 ~ 127
 *                = short (2byte) => -32768 ~ 32767
 *                = int (4byte) => 24억 (default)
 *                ================================== 
 *                = long (8byte)  
 *                ================================== 데이터를 저장할 때  10L
 *                   long , int ==> 숫자(l,L)
 *              실수형
 *                = float (4byte) => 10.5 =====> 10.5F(f)
 *                                   ====        ========
 *                                   double        float
 *                = double (8byte) => 10.5 ======> 10.5D(d)
 *                                                     ==== 생략
 *              문자형
 *                = char (2byte) : 0~65535 (외국어 전체,국어,영문...특수문자)
 *                  char s='★'  ◑ => 특수문자 (ㅁ => 한자키)
 *              논리형 
 *                = boolean (1byte) : ture,false만 저장이 가능 
 *            ===============
 *            = 참조형 데이터형 
 *              클래스 (원하는 데이터형이 없는 경우 : 20byte=>사용자 정의) => class
 *              배열 
 *            
 */
public class 변수_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1byte메모리 공간에 정수 100을 저장한다 
		// ==========      =======
		byte byteValue=100;
		// byte : 메모리 크기 , byteValue:변수  =100 : 초기화
		/*
		 *   변수를 설정 
		 *   메모리 크기결정(데이터형중에 한개 설정)
		 *   변수명설정 
		 *   초기값 부여
		 */
		// 2byte(16bit)메모리 공간을 만들고 정수 200을 저장해라
		// =====================
		short shortValue=200;
		// 4byte(32bit)메모리 공간을 만들고 정수 25을 저장한다
		int intValue=300;
		// 8byte(64bit)메모리 공간을 만들고 정수 25억을 (8byte)을 저장한다
		
		long longValue=2500000000L;
		//             === 4byte ==> 8byte로 변경 400L
		// 왼쪽편에 있는 데이터형이 크거나 같으면 대입이 가능 
		/*
		 *    long = int값,byte값,short값,long값
		 *    int = int , byte , short
		 *    short = short , byte
		 *    byte = byte
		 *    
		 *    int intValue=(값)
		 *                =====
		 *                int (24억)
		 *    int가 디폴트 (데이터형을 설정하지 않은 상태에서 정수를 사용하면 모든숫자는 int로 인식한다) 
		 */
		//25억을 출력해라 
		System.out.println(2500000000L);
		// 실수 : 평균 , 통계 , 건축  (float , double) => 일반 실수는 double을 인식
		// 100.5 (double)
		System.out.println(100.5);
		//                ======= double인식
		// 실수(4byte) 메모리 공간을 만들고 10.5을 저장해라 
		// float를 설정할때는 반드시 => 실수F(f)
		float floatValue=10.5F;
		// 10.5 => double
		// 실수(8byte) 메모리 공간을 만들고 10.5을 저장하라
		double doubleValue=10.5;// 10.5D => d는 생략이 가능
		///////////////////////// 숫자 관련 
		// 문자 저장 : 문자한개 저장 , 문자여러개 저장 
		char charValue='A';
		String stringValue="ABCDEFG";
		// 논리형 => 조건문,반복문
		// true/false저장하는 방법 
		boolean booleanValue1=true;
		boolean booleanValue=false;
		// 선언하는 방식 , 초기값을 설정 ==> 변수(변경해서 사용하는 방법)
		// 변수 : 변경해서 다시 사용이 가능 , 변경할 수 없는 상수
		char c='B';// 변수
		c='D';
		System.out.println(Integer.toHexString(255));
		System.out.println(Integer.toOctalString(255));
		System.out.println(0xff);
		System.out.println(0377);

	}

}










