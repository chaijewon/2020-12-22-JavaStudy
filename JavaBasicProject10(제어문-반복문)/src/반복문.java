/*
 *   자바에서 지원하는 반복문 
 *   => 같은 소스가 여러번 코딩이 된 경우에 사용 기술 
 *   1. while : 반복 횟수를 지정하지 않은 경우 (데이터베이스(오라클))
 *      게시물 , 레시피목록 , 영화목록등 ==> web  
 *   2. do~while : 한번 이상을 반복하는 경우에 사용 
 *                 ============= 조건검색 (나중에)
 *   3. for : 반복횟수가 지정된 경우
 *      =====
 *      
 *      1) 순서 : while,for => 선조건검색 ,do~while => 후조건검색
 *      2) 형식 :
 *           1-1 while
 *               초기값 int i=1; ======================== 1
 *               while(조건문) => i<=10  ================ 2
 *               {
 *                  반복문장 System.out.println("i="+i); ==== 3
 *                  증가식 i++;  ======================== 4 ========> 2번으로 이동 
 *               }
 *               1 (초기값) => 2 (초기값에 대한 조건검색) => 3 반복문장 수행 === 4. 증가식
 *                        => 증가된 값에 대한 조건검색 => 3 반복문장 수행 === 4. 증가식
 *                           ====================
 *                           true : 3=>4
 *                           false : 종료 
 *      3) 사용처
 *      
 *      
 *      *
 *      **
 *      ***
 *      ****    
 *      
 *      **
 *      *
 *      ********
 *      ***
 *      **
 *      *
 */
public class 반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======반복문을 사용하지 않는 경우========");
		System.out.println("i=1");
		System.out.println("i=2");
		System.out.println("i=3");
		System.out.println("i=4");
		System.out.println("i=5");
		System.out.println("i=6");
		System.out.println("i=7");
		System.out.println("i=8");
		System.out.println("i=9");
		System.out.println("i=10");
		System.out.println("====== 반복문을 사용할 때=====");
		int i=1;
		while(i<=10)
		{
			System.out.println("i="+i);
			i++;
		}
		

	}

}











