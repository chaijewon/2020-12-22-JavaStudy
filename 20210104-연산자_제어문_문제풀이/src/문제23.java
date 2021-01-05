
public class 문제23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr={30,20,50,10,40};
        System.out.println("===== 정렬전 =====");
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        
        System.out.println("\n===== 정렬후 =====");
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
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
	}

}
