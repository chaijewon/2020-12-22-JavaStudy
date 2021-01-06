/*
 *   선택정렬 
 *   ======
 *     30  20  50  10  40    i=0 (일차 for) j=1~4
 *     ==  ==============
 *     
 *         ==  ==========    i=1  j=2~4
 *             
 *             ==  ======    i=2  j=3,4
 *                 
 *                 == ===    i=3  j=4
 *                           ===
 *                           arr.length-1
 *    i    j(s)  j(e)    
 *    0     1     4
 *    1     2     4
 *    2     3     4
 *    3     4     4
 *    
 *    i=j-1 => j=i+1  j=4(arr.length)
 *    for(int i=0;i<3;i++)
 *    {
 *       for(int j=i+1;j<4;j++)
 *       {
 *          
 *       }
 *    }
 *    
 *    30  20  50  10  40
 *    ==  ==
 *    20  30
 *    ==      ==
 *    20      50
 *    ==          ==
 *    10          20
 *    ==              ==
 *    10              40
 *    ============================ for (1)
 *    10  30  50  20  40
 *        ==  ==
 *        30  50
 *        ==      ==
 *        20      30
 *        ==          ==
 *        20          40
 *    ============================ for (2)
 *    10  20  50   30  40
 *            ==   ==
 *            30   50
 *            ==       ==
 *            30       40
 *    ============================ for (3)
 *    10  20  30   50  40
 *                 ==  ==
 *                 40  50
 *    ============================ for (4)
 *    10  20  30   40  50
 *                     ==
 */
public class 배열활용_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr={30 , 20 , 50 , 10 , 40}; // 정렬 
        System.out.println("===== 정렬 전 =====");
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
        System.out.println("\n===== 정렬 후 =====");
        /*
         *    int a=10;
         *    int b=20;
         *    
         *    a=b; // a=20
         *    b=a; // b=20
         *    
         *    int temp=a; temp=10
         *    a=b; // a=20
         *    b=temp; // b=10
         */
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
        		for(int k:arr)
                {
                	System.out.print(k+" ");
                }
        		System.out.println();
        	}
        	
        	System.out.println((i+1)+"Round 종료");
        }
        // 최종 
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
	}

}








