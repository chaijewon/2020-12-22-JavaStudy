/*
 *    do~while : 조건검색을 나중에 하기 때문에 반드시 한번이상을 수행 
 *    형식)
 *         초기값  int i=1; =====> 1
 *         do
 *         {
 *             반복문장  ======> 2
 *             증가식    ======> 3
 *         }while(조건식); =====> 4  ======> 2 ===> 3 ==== 4
 *                                         ================ 4(false일경우에 종료)
 *                                         
 *                                         
 *         int i=1; ======================= 1
 *         do{
 *              System.out.println("i="+i);  i=1 i=2 i=3 i=4 i=5
 *              i++; => i=2 i=3 i=4 i=5 i=6
 *         }while(i<=5); 2<=5 true 3<=5 true  4<=5 true  5<=5 true 6<=5 false => 종료
 */
public class 반복문_doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
