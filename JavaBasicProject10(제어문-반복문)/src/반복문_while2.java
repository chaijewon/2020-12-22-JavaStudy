// 1~100까지의 합
// 1+2+3+4....+100 ?
public class 반복문_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 변수 => 1부터 100까지 변경되는 변수 => 루프변수
		int i=1;
		// 1~100까지 더한값을 누적변수 
		int sum=0; // + => 누적 (0) , * => 1
		int odd=0;
		int even=0;
		while(i<=100) // 100번을 반복한다 
		{
			//sum+=i;
			sum=sum+i;
			if(i%2==0)
				even+=i;
			else
				odd+=i;
			/*
			 *   sum = sum +i  
			 *   
			 *   i=1 
			 *   sum =0+1 ==> sum=1
			 *   i=2
			 *   sum= 1+2 ==> sum=3
			 *   i=3
			 *   sum=3+3 ==> sum=6
			 *   --
			 *   --
			 *   --
			 *   sum=()+100 ==> sum=?
			 */
			System.out.println("i="+i+",sum="+sum);
			i++;
		}
		System.out.println("1~100까지의 합:"+sum);
		System.out.println("1~100까지의 짝수합:"+even);
		System.out.println("1~100까지의 홀수합:"+odd);
	}

}
