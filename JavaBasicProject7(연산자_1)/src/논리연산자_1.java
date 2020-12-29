/*
 *    논리연산자 : 효율적인 계산처리
 *    && : 왼쪽편의 조건이 false => false
 *    || : 왼쪽펴의 조건이 true => true
 */
public class 논리연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
        int a=10;
        int b=9;
        boolean bCheck=(a>b && ++b==a);
        /*
         *    a>b ==> 10>9 ==> true
         *    ++b==a  10==10 ==> true 
         *    true && true = true
         */
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("결과:"+bCheck);
        long end=System.currentTimeMillis();
        System.out.println("수행시간:"+(end-start));
        // 효율적인 계산 
        
        start=System.currentTimeMillis();
        a=10;
        b=9;
        bCheck=(a<b && ++b==a);
        /*
         *    a<b ==> 10<9 ==> false
         *    => false
         */
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("결과:"+bCheck);
        end=System.currentTimeMillis();
        System.out.println("수행시간:"+(end-start));
        
	}

}
