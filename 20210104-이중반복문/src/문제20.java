// 1~100 중에서 2의 배수이면서 3의 배수의 갯수를 구하시오
public class 문제20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count=0;
        for(int i=1;i<=100;i++)
        {
        	if(i%2==0 && i%3==0)
        	{
        		System.out.println("i="+i);
        		count++;
        	}
        }
        System.out.println("2의배수 3의배수인 갯수는?"+count);
	}

}
