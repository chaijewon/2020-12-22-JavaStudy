// 1~100까지 합 , 짝수합 , 홀수합 
/*
 *    while 형식
 *    =========
 *    초기값 ==> 시작      =====> int i=1
 *    while(조건식) ==> 끝 =====> i<=10
 *    {
 *       반복문장 => 시작,끝 지정된 갯수만큼 수행
 *       증가식 i++;
 *    }
 *    
 *    초기값 ==> 시작    ====> int i=10
 *    while(i>=1)
 *    {
 *       반복문장 
 *       증감식 i--;  2개씩 => i+=2  , 3개씩 => i+=3 ....
 *    }
 *    
 *    
 *    ===> while은 횟수가 없는 경우에 주로 사용 
 *         while(true) => 무한루프    for(;;)
 *         {
 *            종료 => break;
 *         }
 */
public class 반복문_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 변수 3개 sum(전체 합누적) , even(짝수합) , odd(홀수합)
		int sum=0,even=0,odd=0;
		int i=1; // 1부터 100까지 변경되는 변수 
		while(i<=100)
		{
			// 전체합 
			sum=sum+i; // sum+=i
			// 짝수합 
			if(i%2==0)
				even=even+i;
			// 홀수합
			else
				odd=odd+i;
			i++;
		}
		// 결과값 출력 
		System.out.println("1~100까지의 총합:"+sum);
		System.out.println("1~100까지의 짝수의 합:"+even);
		System.out.println("1~100까지의 홀수의 합:"+odd);
	}

}
