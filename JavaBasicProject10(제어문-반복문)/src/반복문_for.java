/*
 *   for 
 *   1. 사용처 => 반복횟수가 지정된 경우에 주로 사용 
 *   2. while,do~while(1차) ==> for(2차 for)
 *   3. for의 형식 
 *      1-1. 일반 for    false => 종료
 *                 ①  →  ②  ← ④      
 *                 i=1 i<=10  i++ 
 *                 1부터 10까지 1씩증가              →  ↗  ↘
 *           for(초기값;조건식;증가식)
 *           {          ↓ true
 *                   ③       ↗
 *                  반복수행문장 
 *           }
 *           
 *           실행 과정 
 *             초기값 => 조건식 (조건검색)                 ↑ 
 *                       = true  : => 반복수행문장 => 초기값을 변경(증가식)
 *                       = false : for문을 종료 
 *      ***1-2. 향상된 for (JDK1.5이상) => web (forEach구문)
 *           ==========
 *           1. 배열 , 2. 컬렉션 
 *           
 */
public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//☆ 홀수면 짝수면 ★ 
		// ★★☆★★☆★★☆★
        for(int i=1;i<=10;i++)
        {
			 
        	if(i%3==0)
        		System.out.print("☆");
        	else
        		System.out.print("★");
        		
        }
	}

}
