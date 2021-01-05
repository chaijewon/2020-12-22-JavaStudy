/*
 *     1.	100~999사이에 7의 배수의 갯수와 합을 출력하는 프로그램 작성
 *     2.	100~999 사이의 4의배수가 아닌 수의 갯수,합을 출력하는 프로그램 작성
 *     3.	1~30 짝수합,홀수합을 출력하는 프로그램을 작성
 *     4.	1~100 3의 배수이고 5의 배수를 출력하는 프로그램 작성
 *     5.	1~1000까지에서 7의 배수의 합 ,9의 배수의 합
 *     6.	10~99까지 정수중에 같은 자리의 정수를 출력하시오
 *     7.	정수 입력을 받아서 60이상 합격 =>불합격  if~else
 *     
		8.	int[] num = { 94, 85, 95, 88, 90 };
		
		다음 배열에서 최대값,최소값을 출력하는 프로그램을 작성하시오

        9.	정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 
			배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.
			예) 랜덤한 정수들 : 3 6 3 6 1 3 8 9 6 9 
			평균은 5.4
			[Hint] 1에서 10까지 범위의 정수를 랜덤하게 생성할 때는 다음 코드를 이용하라.
			int i  = (int)(Math.random()*10)+1;
	    10.	다음과 같이 임의의 정수를 배열로 선언하고 정렬해서 출력하는 프로그램을 작성하시오
 */
public class 문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1번
		/*int count=0,a7=0;
		for(int i=100;i<=999;i++)
		{
			if(i%7==0)
			{
				count++;
				a7+=i;
			}
		}
		System.out.println(count);
		System.out.println(a7);*/
		// 2번
		/*int count=0,a4=0;
		for(int i=100;i<=999;i++)
		{
			if(i%4!=0)
			{
				count++;
				a4+=i;
			}
		}
		System.out.println(count);
		System.out.println(a4);*/
		//3번
		/*int even=0,odd=0;
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{
				even+=i;
			}
			else
			{
				odd+=i;
			}
		}
		System.out.println(even);
		System.out.println(odd);*/
		// 4번
		/*for(int i=1;i<=100;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.print(i+" ");
			}
		}*/
		//5번
		/*
		int a7=0,a9=0;
		for(int i=1;i<=1000;i++)
		{
			if(i%7==0)
				a7+=i;
			if(i%9==0)
				a9+=i;
		}
		System.out.println(a7);
		System.out.println(a9);
		System.out.println(a7+a9);*/
		// 6번
		/*for(int i=10;i<=99;i++)
		{
			int a=i/10;
			int b=i%10;
			if(a==b)
			{
				System.out.print(i+" ");
			}
		}*/
		// 7번
		/*
		int score=(int)(Math.random()*101);//0~100
		if(score>=60)
			System.out.println(score+":합격");
		else
			System.out.println(score+":불합격");*/
		/*
		int[] num = { 94, 85, 95, 88, 90 };
		int max=num[0];
		int min=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(max<num[i]) // 94/94 , max=94,  94/95 max=95 
				max=num[i];
			if(min>num[i])
				min=num[i];
		}
		System.out.println(max);
		System.out.println(min);*/
		int[] arr=new int[10];// 모든 값 : 0
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1;
		}
		int sum=0;
		//double avg=0.0;
		for(int i:arr)
		{
			sum+=i;
		}
		
		// arr에 저장된 데이터 출력
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n평균:"+(sum/10.0));
		
	}

}








