/*
 *    continue : 특정부분을 제외하고 다시 실행한다 
 *    ========= 반복문에서만 사용 
 *    
 *    for(초기값;조건식;증가식)
 *    {
 *         반복수행 문장 
 *         if(조건문)
 *           break;  ========> if에 있는 조건문이 true => for을 중단 
 *    }
 *    
 *    초기값 int i=1
 *    while(조건식) i<=10
 *    {
 *       반복실행문장 
 *       if(조건문) i==5
 *         continue; ==> 조건문이 true일 경우 => while의 조건식으로 이동  
 *         
 *       증가식 
 *    }
 *        int i=1;i<=10;i++)
 *    for(초기값;조건식;증가식) i=6
 *    {
 *       
 *       if(조건문) i==5
 *         continue; ==> true ==> 증가식으로 이동 
 *       반복실행문장 i=1,2,3,4,6,7,8,9,10
 *    }
 */
public class 반복문_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i=1;
		while(i<=10)
		{
			System.out.println("i="+i);
			if(i==5)
				continue; // 조건식으로 간다
			
			i++;
		}*/
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				continue;// i++ 이동 
			System.out.println("i="+i);
		}
		

	}

}














