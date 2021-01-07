// 숫자 야구게임 
/*
 *   UPDOWN 
 *   ======
 *     369 => 123 ==> 0S-1B
 *         => 345 ==> 1S-0B
 *         => 396 ==> 1S-2B
 *         => 369 ==> 3S-0B ==> Game Over!!
 *         
 *         1 2 3 4 5 6 7 9 10
 */
public class 배열활용_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		// 난수를 저장하는 변수 
		int su=0;
		// 중복여부 확인하는 변수 
		boolean bCheck=false;
		for(int i=0;i<arr.length;i++)
		{
			bCheck=true;
			// 1 ==> 2 ==> 2
			while(bCheck)
			{
				// 난수 발생 => 비교 (중복 여부 확인)
				su=(int)(Math.random()*10)+1;
				bCheck=false;
				for(int j=0;j<i;j++)
				{
					if(arr[j]==su)
					{
						bCheck=true;
						break;// continue ==> 자신의 반복문만 제어
					}
				}
			}
			arr[i]=su;
		}
		// 출력
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}

}
