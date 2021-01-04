import java.util.Scanner;
public class 문제15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("10~99 사이의 정수를 입력하시오?");
        int input=scan.nextInt();
        int a=input/10;
        int b=input%10;
        if(a==b)
        {
        	System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
        }
        else
        {
        	System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다");
        }
	}

}
