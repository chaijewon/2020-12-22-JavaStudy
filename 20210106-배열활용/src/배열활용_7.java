// equals : 문자열 비교 (일반 데이터 ==)
import java.util.Scanner;
public class 배열활용_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final String ID="Admin"; // char[] id={'A','d','m','i','n'}
        final String PWD="1234"; // 상수 
        
        Scanner scan=new Scanner(System.in);
        String myid="";
        String mypwd="";
        
        System.out.print("ID를 입력하세요?");
        myid=scan.next();
        
        System.out.print("비밀번호를 입력하세요?");
        mypwd=scan.next();
        /*
         *    equalsIgnoreCase = 대소문자 구분 없이 
         *    equals = 대소문자 구분 
         *    Java JAVA JaVa 
         */
        if(myid.equalsIgnoreCase(ID) && mypwd.equals(PWD))
        {
        	System.out.println(myid+"님 로그인되었습니다");
        }
        else
        {
        	System.out.println("ID나 비밀번호가 틀립니다");
        }
        
	}

}







