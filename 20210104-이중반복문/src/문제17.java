// 문자 하나를 입력받아 대문자인지 소문자인지를 판별하는 프로그램
import java.util.Scanner;
public class 문제17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("알파벳 문자열 입력:");
        String alpha=scan.next();
        for(int i=0;i<alpha.length();i++)
        {
        	char c=alpha.charAt(i);
        	if(c>='A' && c<='Z')
        	  System.out.println(c+"는(은) 대문자입니다");
        	else if(c>='a' && c<='z')
        	  System.out.println(c+"는(은) 소문자입니다");	
        	else
        	  System.out.println(c+"는(은) 알파벳이 아닙니다");
        		
        }
	}

}
