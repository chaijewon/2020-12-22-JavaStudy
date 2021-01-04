// 1~100 중에서 2의 배수이면서 3의 배수의 갯수를 구하시오
public class 문제20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 갯수를 저장하는 변수
		int count=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0 && i%3==0)
			{
				count++;
				System.out.println("i="+i);
			}
		}
		// 갯수 확인
		System.out.println("2배수,3배수의 갯수:"+count);
	}

}
