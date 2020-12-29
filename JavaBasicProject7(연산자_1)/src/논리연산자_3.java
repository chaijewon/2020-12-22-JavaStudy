// char를 선언 => 대문자 , 소문자를 확인하는 프로그램 구현 ==> 두개의 조건을 이용해서 연산처리 => 논리연산자 
// 산술연산자 => char변수가 연산이 되면 정수형으로 변경 
/*
 *   char alpha='K'
 *   alpha>=65 && alpha<=90  ==> 
 *   alpha>='A' && alpha<='Z'
 *   모든 char변수 => 연산시 무조건 정수형으로 변경 
 */
public class 논리연산자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //System.out.println((int)'Z');
		char alpha=(char)((Math.random()*26)+65); // alpha값이 대문자? 소문자?
		// 난수 
		/*
		 *    (char)((Math.random()*25)+65)
		 *           ==================
		 *              1
		 *          =======================
		 *               2
		 *    ======
		 *      3
		 *      
		 *      1. Math.random() => 0.0~0.99*25 ==> 0.0~25.... + 65
		 *                                         (char)65.0~89.000
		 *                                           65~89
		 */
		boolean bCheck=alpha>='A' && alpha<='Z'; //'A'와 'Z' 사이에 있는지 확인  (&&)
		String result=bCheck==true?"대문자":"소문자";
		System.out.println(alpha+"는(은) "+result);
		/*
		 *    변수 => 초기화 
		 *    1. 명시적인 초기화 : int a=10;
		 *    2. 입력값 받기 : int a=scan.nextInt()
		 *    3. 난수값 초기화: Math.random()
		 */
		
	}

}












