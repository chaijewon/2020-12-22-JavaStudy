/*
 *    두 개의 정수를 입력 받아서 첫째 수를 둘째 수로 나눈 
 *    나머지를 출력하는 프로그램을 작성해 보자.
 */
import java.util.Scanner;
public class 문제14 {
  public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.print("두개의 정수 입력(10 20):");
	 int a=scan.nextInt();
	 int b=scan.nextInt();
	 int c=a%b;
	 System.out.println("c="+c);
  }
}
