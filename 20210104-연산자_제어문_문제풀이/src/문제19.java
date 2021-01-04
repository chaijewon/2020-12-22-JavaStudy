// 정수를 입력받아서  수가 양수, 음수, 제로인지 출력하시오:다증 조건문 
/*
 *   char a='1'
 *   if(a>='A' && a<='Z')
 *      System.out.println("대문자")
 *   else 
 *      System.out.println("소문자")
 */
import java.util.Scanner;
public class 문제19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("정수 입력:");
        // 입력된 값을 받아서 메모리 저장 
        int a=scan.nextInt();
        
        if(a>0)
        	System.out.println(a+"는(은) 양수입니다");
        else if(a<0)
        	System.out.println(a+"는(은) 음수입니다");
        else
        	System.out.println(a+"는(은) 제로입니다");
	}

}
