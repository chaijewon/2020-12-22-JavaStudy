/*
 *   변수 : 저장 , 읽기 , 쓰기 (수정)
 *         ===================== 한개만 저장이 가능 
 *         정수 , 실수 , 문자 , 논리 
 *   1. 변수 선언
 *   2. 변수 초기화 
 *   3. 변수값 변경
 *   4. 데이터 출력 
 *   
 *   1) 정수를 출력하는 방법 
 *      = 10진법 (주로 사용)
 *      = 2진법
 *      = 8진법
 *      = 16진법 : HTML 색상표 (16진법)
 *      
 *      << >> , & , | , ^ => 
 *      
 *      100
 *      ===
 *      128  64 32 16 8 4 2 0(1)
 *           1  1   0 0 1 0 0    ==> 0000 0000 0000 1100100
 *           
 *      27
 *      16 8 4 2 0(1)
 *      1  1 0 1 1    ===> 11011
 *      
 *      => 8진법 
 *      27 ==============================> 7  111
 *      ==> 11|011
 *          == ===
 *          3   3   => 033
 *                       8^1*3+ 8^0*3
 *                       =====  =====
 *                         24     3  ===> 27
 *                  => 033
 *      100 ============================> 15 1111
 *      ===> 110|0100
 *            6   4    ==> 0x64
 */
public class 변수활용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("100의 2진법:"+Integer.toBinaryString(100));// 2진법
        System.out.println("27의 2진법:"+Integer.toBinaryString(27));
        System.out.println("27의 8진법:"+Integer.toOctalString(27));// 8진법 (0)
        System.out.println("100의 16진법:"+Integer.toHexString(100));//HTML 16진법 0x
        // 0~15 => 10(A) , 11(B) , 12(C) , 13(D) , 14(E) ,15(F)
        // #CCFFCC
        //  ======  
        // RGB(CC,FF,CC) => 255,255,255
        System.out.println("033:"+033);
        System.out.println("0x64:"+0x64);
        // 10진법 , 16진법 , 2진법 , 8진법 
        System.out.println(0xFF);
        System.out.println(0b1100100);
        // 8bit ==> 1byte ==> word(문자열)
        /*
         *   키보드 입력 
         *       8bit        8bit
         *   ===========================
         *    scan-code  |  ASC  =========> 자동으로 처리
         *   ===========================
         */
        // 2진법 => 8진법 : 뒤에서부터  3bit씩 나눠서 처리 , 16진법 : 뒤에서부터 4bit를 나눠서 처리
        /*
         *   음수 표현법 
         *   =========
         *     1의 보수 
         *     2의 보수 
         *     
         *     ==> 78  ==> -79
         *        ====
         *        64  32  16  8  4  2  0(1)
         *         1  0    0  1  1  1  0
         *         ========================> 
         *         01001110
         *      => 10110001  => 0을 1로 변환 , 1을 0으로 변환 
         *      
         *      => 10110001
         *               +1
         *         ========
         *         10110010
         */
        //System.out.println(0b0110010);
        System.out.println(~78); // ~ 음수  100  => -101
        /*
         *  page 42 ~ 54 page
         *  10진법 ==> 2진법 
         *    Integer.toBinaryString(정수)
         *  10진법 ==> 8진법
         *    Integer.toOctalString(정수)
         *  10진법 ==> 16진법
         *    Integer.toHexString(정수)
         *  2진법 ==> 10진법
         *    0b(2진법)
         *  8진법 ==> 10진법
         *    0(8진법)
         *  16진법 ==> 10진법 
         *    0x(16진법)
         *  양수 => 음수 
         *    ~정수값
         */
        /*
         *    55page ~ 73 page
         *    기본데이터형 
         *    논리형 
         *      boolean : 조건식 , 반복문 ==> 제어문에서 주로 사용 
         *                ============ true/false
         *    =====
         *    정수형
         *      byte : 파일관련(파일 다운로드,파일 업로드)
         *      short: C언어와 호환(자바에서는 많이 사용하지 않는다)
         *      int : 주로 사용하는 데이터형 (default => 컴퓨터에서는 모든 숫자를 int로 인식)
         *      long : 금융권 , 증권 , 빅데이터 
         *    =====
         *    문자형
         *      char : 인코딩 / 디코딩
         *             =====  =====
         *                                     인코딩    디코딩  ==> 필요시마다 정수로 변환 
         *              숫자    문자    => 'A' ==> 65 ==> 'A' (UTF-8) 1byte=>2byte
         *                                     저장값    출력물  
         *    =====
         *    실수형
         *      float : 소수점을 6자리 이상
         *      double : 주로 사용 (default) : 건축  (15자리 이상)
         *    =====
         */
        /// 형변환 
        System.out.println('A');// 'A'를 출력해라
        System.out.println((int)'A');// 'A'를 정수로 변환한 값을 출력
        System.out.println((char)65);// 정수를 문자로 출력 
        
        // \n, \t,\\,\" ==> 특수문자 
        System.out.println("\"홍길동\""); // 홍길동 "홍길동"
        // \\ => 경로명 
        System.out.println("c:\\jdk-14.0.2");
	}
	// https://www.google.com/search?q=%EC%9E%90%EB%B0%94&rlz=1C1CHBD_koKR933KR933&oq=%EC%9E%90%EB%B0%94&aqs=chrome..69i57j69i59j35i39j0i433l2j0j0i433l2.5804j0j15&sourceid=chrome&ie=UTF-8

}













