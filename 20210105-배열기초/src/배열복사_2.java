// 라이브러리 이용 
public class 배열복사_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names={"홍길동","이순신","강감찬","을지문덕","박문수"};
		String[] members=new String[10];
		
		int[] arr= {10,20,30,40,50};
		double[] dd=new double[10];
		
		// ==>  dd[0]=arr[0]
		// ==> double d=10;  => 10.0
		//System.arraycopy(arr, 0, dd, 0, arr.length);
		for(int i=0;i<arr.length;i++)
		{
			dd[i]=arr[i];
		}
		for(double d:dd)
		{
			System.out.println(d);
		}
		// Object src, int srcPos, Object dest, int destPos, int length)
		/*
		 *         0       1      2       3       4
		 *      ========================================
		 *       "홍길동","이순신","강감찬","을지문덕","박문수"  names
		 *      ========================================
		 *         0     1     2     3     4     5      6     7     8     9
		 *      =============================================================
		 *        null  null  null  "홍길동","이순신","강감찬","을지문덕","박문수"  null  null   members
		 *      =============================================================
		 */
		System.arraycopy(names, 4, members,9, 1);
		//    members[9]=names[4];
		// 실행
		for(String name:members)
		{
			System.out.println(name);
		}

	}

}
