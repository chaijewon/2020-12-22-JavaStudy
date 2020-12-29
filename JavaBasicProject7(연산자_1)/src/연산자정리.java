/*
 *    연산자의 종류
 *    단항연산자 (++,--,!,(type))
 *    이항연산자 
 *      = 산술연산자 ( + , - , / , * , %)
 *      = 비교연산자 ( == , != , < , > , <= , >= )
 *      = 논리연산자 ( && , || )
 *      = 대입연산자 ( = , += , -= )
 *    삼항연산자 : (조건)?값:값 
 *    
 *    page 91 (연산자 우선순위)
 *      단항연산자 => 산술연산자 => 비교연산자 => 논리연산자 => 삼항연산자
 *      = 대입연산자 
 *      ======> 필요하면 ()로 묶어서 처리 
 *      
 *      산술연산자 ( * , / , % ) > (+,-)
 *        (5+6)*10 ==> 
 *          ====
 *         5+ 60 ==> 65
 *      비교연산자 ( < , > , <= , >=) > (==,!=)
 *      논리연산자 ( && ) > ( || )
 *      
 *     page 91~92 
 *          *** 연산은 항상 같은 타입끼리 연산 => 같은 타입을 만들어서 처리
 *          자동형변환 : 큰 데이터형으로 변환  
 *            int + (int)double
 *            ====
 *            double 
 *          int이하 => 연산이 되면 =>int
 *     page 93
 *          ++ , -- : 1개증가,1개감소 
 *          94 page 
 *          전치 : 먼저 증가 => 다른 연산 수행
 *                int a=10;
 *                int b  =  ++a   ==> b=11
 *                      === ==
 *                       2  1
 *                       
 *                a=a+1;
 *                b=a
 *          후치 : 다른 연산 수행 => 나중에 증가 
 *                int a=10;
 *                int b =  a++
 *                     ===  ==
 *                      1   2
 *                b=a
 *                a=a+1
 *                =====무조건 수행하는 문장 : a는 1개 증가 
 *                
 *                -10  10
 *                
 *         page 97 
 *           정수/정수=정수 (소수점을 버린다)
 *         page 101 
 *           소스상에서 사용하는 모든 정수는 int (숫자 표기시에 21억 4천을 넘으면 오류 발생) L
 *            10 10L
 *         page 102
 *            'A': 65  'a': 97  '0': 48 ==> ASC
 *            0 != '0'
 *            
 *            ==> 존재하지 않는 값 : null
 *         page 108 
 *            나머지 => 왼편 부호 (- => -값이 남는다 , + => +값이 남는다)
 *         page 109 
 *            비교연산자 : 결과값 => true/false
 *            
 *         page 114 
 *            논리연산자 : && (두개의 조건이 true일 경우 = true), ||(조건중에 둘중에 1개이상 true=true)
 *         page 118 
 *            효율적인 연산 
 *            (조건) && (조건) 
 *            false    ====== 수행하지 않는다  => false
 *            
 *            (조건) || (조건)
 *            true     ====== 수행하지 않는다 => true
 *            
 *         page 130 
 *            삼항연산자 
 *         page 132
 *            대입연산자 
 *              =
 *              += 
 *              예)
 *                  int a=10;
 *                  a+=5 ==> 기존의 a값에 5를 더해서 저장
 *                           15
 *                           a=a+5
 *              -=
 *              예)
 *                  int a=10;
 *                  a-=5; 
 *                  a=a-5; ==> a=5
 *           
 */
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(21400000000L);
		// 오버플로우 byte => 127 => 350
		/*
		 *    127 
		 *    =======================
		 *     
		 *    =======================
		 *     0 1 0 1 | 1 1 1 0  
		 *       64  16  8 4 2    ==> 94
		 *        
		 *    350
		 *    
		 *    1 | 0 1 0 1 | 1 1 1 0
		 */
		//System.out.println(Integer.toBinaryString(350));
		System.out.println(10);
	}

}








