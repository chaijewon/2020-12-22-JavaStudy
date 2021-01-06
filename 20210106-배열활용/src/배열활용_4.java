/*
 *    버블정렬 : 인접한 수끼리 비교해서 변경
 *    i=0  j=0 j=4
 *    i=1  j=0 j=3
 *    i=2  j=0 j=2
 *    i=3  j=0 j=1
 *        ====
 *        
 *        i+j=4 ==> j=4-i
 *    
 *    30  20  50  10  40
 *    ==  ==
 *    20  30
 *        ==  ==
 *        30  50
 *            ==  ==
 *            10  50
 *                ==  ==
 *                40  50(고정)
 *    ================================
 *    
 *    20  30  10  40  50
 *    ==  ==
 *    20  30
 *        ==  ==
 *        10  30
 *            ==  ==
 *            30  40  50
 *   
 *   =================================
 *   
 *   20  10  30  40  50
 *   ==  ==
 *   10  20
 *       ==  ==
 *       20  30  40 50
 *   =================================
 *   10  20  30  40  50
 *   ==  ==
 *   10  20  30  40  50
 *   =================================
 *    
 */
public class 배열활용_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={30 , 20 , 50 , 10 , 40}; // 정렬 
        System.out.println("===== 정렬 전 =====");
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
        System.out.println("\n===== 정렬 후 =====");
        for(int i=0;i<arr.length-1;i++)
        {
        	for(int j=0;j<arr.length-1-i;j++)
        	{
        		if(arr[j]>arr[j+1])
        		{
        			int temp=arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=temp;
        		}
        		for(int k:arr)
        		{
        			System.out.print(k+" ");
        		}
        		System.out.println();
        	}
        	System.out.println("===== "+(i+1)+" Round End =====");
        }
        System.out.println("======최종 결과=======");
        for(int k:arr)
		{
			System.out.print(k+" ");
		}
	}

}









