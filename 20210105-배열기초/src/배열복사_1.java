/*
 *   배열을 복사 
 *     한개씩 복사 
 *     라이브러리이용 => arraycopy()
 *   향상된 for
 */
public class 배열복사_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr={10,20,30,40,50};// 배열 => 저장공간
        // 큰 배열을 선언
        int[] temp=new int[10];
        //원시적인 방법 
        for(int i=0;i<arr.length;i++)
        {
        	temp[i]=arr[i];
        }
        /*
         *   =====================
         *    10  20  30  40  50  ==> arr
         *   =====================
         *   ==========================================
         *     10  20   30   40   50   0  0  0  0  0    ===> temp
         *   ==========================================
         */
        // 출력
        for(int i:temp) // for-Each , 향상된 for => 출력할때 
        {
        	// i=10 , i=20 ==> temp에 저장된 실제 데이터값을 받아 온다 (i는 인덱스번호가 아니다)
        	System.out.print(i+" ");
        }
        // 웹출력 
        System.out.println("\n======= forEach ========"); // JDK 1.5이상 , 값을 변경하지 못한다,출력담당
        // 반드시 배열,컬렉션(데이터가 모아져 있어야 가능)
        char[] alpha={'A','B','C','D','E'};
        System.out.println("저장된 데이터의 갯수:"+alpha.length);
        System.out.println("첫번째 저장된데이터:"+alpha[0]);
        System.out.println("마지막 저장된 데이터:"+alpha[alpha.length-1]);
        // 전체 데이터 출력
		/*
		 * for(int i=0;i<alpha.length;i++) { alpha[0]='K'; System.out.println(alpha[i]);
		 * }
		 */
        
        System.out.println("=====향상된 for(forEach)=====");
        for(char c:alpha)
        {
        	c='K';
        	System.out.println(c);
        }
        System.out.println("=====향상된 for(forEach)=====");
        int i=0;
        for(char c:alpha)
        {
        	alpha[i]='A';
        	System.out.println(c);
        	i++;
        }
        
        for(char c:alpha)
        {
        	System.out.println(c);
        }
	}

}







