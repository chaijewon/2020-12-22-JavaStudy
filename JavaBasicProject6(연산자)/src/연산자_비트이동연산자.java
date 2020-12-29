/*
 *    << 왼쪽이동 
 *    >> 오른쪽 이동 
 *    
 *    10<<2
 *    ==
 *      1010
 *    101000 => 40
 *    
 *    13<<3
 *    ==
 *     1101 => 8+4+1 => 13
 *  1101000 ==> 104  64+32+8 => 104
 *  
 *     7<<2 => 28
 *     111
 *   11100  => 16+8+4 => 28
 *   
 *     10<<3 ==> 80
 *     1010
 *  1010000  ==> 64+16=80
 *  
 *    >> 
 *    10>>2
 *    1010
 *      10(10)  => 2
 *      
 *    25>>3
 *    11001
 *       11 => 3
 */
public class 연산자_비트이동연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *    X<<Y ==> X*2^y  
		 *    X>>Y ==> X/2^y
		 */
        System.out.println("10<<2="+(10<<2));
        System.out.println("13<<3="+(13<<3));
        System.out.println("7<<2="+(7<<2));
        System.out.println("10>>2="+(10>>2));//2
        System.out.println("25>>3="+(25>>3));//3
        
	}

}





