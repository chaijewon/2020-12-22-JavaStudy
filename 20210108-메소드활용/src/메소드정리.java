/*
 *   프로그램 언어 => 컴퓨터 명령을 내리는 언어
 *   메소드 : 한개의 기능을 수행하기 위한 명령문의 집합 
 *           재사용이 가능 
 *           반복을 제거할 수 있다 
 *           메소드 호출 => 메소드명(값...) => 메소드 {}에 있는 모든 내용을 수행하고 다시 호출된 위치 복귀
 *          =================================
 *          ** 명령문 
 *             int a=10; // 10을 a라는 메모리 공간에 대입하라 
 *             int b=20;
 *             System.out.println(a+b);
 *         형식)
 *               리턴형(결과값) 메소드명(매개변수...)
 *               {
 *                  수행할 내용을 코딩 
 *               }
 *               
 *               int[] arr={1,2,3,4,5}
 *               = 리턴형(O)   매개변수(O)
 *                 *** 리턴형 : 사용자가 요청한 내용 처리후에 나오는 결과값 (결과값은 반드시 한개만들 수 있다)
 *                            여러개일 경우 : 배열,클래스 
 *                                         ========= 한개
 *                            = 모든 메소드는 메소드 종료를 위해서 return을 사용 
 *                              return 값; (void인 경우에는 return을 생략)
 *                 *** 매개변수 :사용자로부터 가공할 데이터를 받는다 
 *               = 리턴형(O)   매개변수(X)
 *               = 리턴형(X)   매개변수(O)
 *               = 리턴형(X)   매개변수(X)
 *               
 *               메소드는 소스가 많거나 복잡할 경우에 => 분리 
 */
/*
 *   1. 반복이 많다 (*******)
 *   2. 다음에 다시 사용 (******)
 *   3. 복잡한 소스코딩 
 */
public class 메소드정리 {

	// 출력하는 메소드 
	static void print(int[] arr)
	{
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	// 정렬하는 메소드 
	static int[] sort_asc(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	static int[] sort_desc(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	static int[] sort(int[] arr,String type)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			   if(type.equals("DESC"))
			   {
					if(arr[i]<arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
			   }
			   else
			   {
				    if(arr[i]>arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
			   }
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={30,20,50,10,40};
		System.out.println("====== 정렬 전 ======");
		// 출력 : for-each => 역순으로 출력 , 여러개의 배열을 동시 출력
		/*
		 * for(int i:arr) { System.out.print(i+" "); }
		 */
		print(arr);
		System.out.println("\n===== 정렬 후(ASC:올림차순) =====");
		/*       
		 *     i  30 20 50 10 40
		 *        == == 
		 *        20 30
		 *        ==    ==
		 *        20    50
		 *        ==       ==
		 *        10       20
		 *        ==          ==
		 *        10          40
		 */
		/*for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}*/
		int[] arr1=sort(arr,"ASC");//sort_asc(arr);
		// 출력 
		/*for(int i:arr)
		{
			System.out.print(i+" ");
		}*/
		print(arr1);
		System.out.println("\n===== 정렬 후(DESC:내림차순) =====");
		/*for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}*/
		int[] arr2=sort(arr,"DESC");//sort_desc(arr);
		// 출력 
		/*for(int i:arr)
		{
			System.out.print(i+" ");
		}*/
		print(arr2);

	}

}






















