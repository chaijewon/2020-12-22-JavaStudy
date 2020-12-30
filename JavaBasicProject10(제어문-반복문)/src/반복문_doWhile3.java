/*
 *    1~100까지 총합 , 3의배수 합, 5의배수 합, 7의배수의 합을 출력 
 *    1-2+3-4+5-6+7-8+9-10  합
 */
public class 반복문_doWhile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=1;
        int a3=0,a5=0,a7=0,sum=0;
        //  a3=3의배수 , a5=5의배수 a7=7의배수 
        do 
        {
            sum+=i;//총합
            
            if(i%3==0) // 3의 배수 
            	a3+=i;
            if(i%5==0) // 5의 배수 
            	a5+=i;
            if(i%7==0) // 7의 배수
            	a7+=i;
            i++;
        }while(i<=100);
        System.out.println("총합:"+sum);
        System.out.println("3의배수 합:"+a3);
        System.out.println("5의배수 합:"+a5);
        System.out.println("7의배수 합:"+a7);
        // 1-2+3-4+5-6+7-8+9-10 수열 
        // 홀수 : +
        // 짝수 : -
        i=1;
        sum=0;
        do {
        	 if(i%2==0)
        		 sum-=i;
        	 else
        		 sum+=i;
        	 i++;
        }while(i<=10);
        System.out.println("합:"+sum);
        
        i=1;
        sum=0;
        do
        {
           sum = (sum + i) * -1;
		   i++;
        }while(i<=10);
        System.out.println("합:"+sum);

	}

}
