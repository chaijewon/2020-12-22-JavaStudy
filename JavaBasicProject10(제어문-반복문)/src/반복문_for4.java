// 3자리 정수를 입력하게 만든다 
/*
 *    1. 조건문 
 *       단일 조건문 
 *       선택 조건문 
 *       다중 조건문 
 *    2. 반복문 
 *       while
 *       for
 *    3. 반복제어문 
 *       break   ==============> web
 *   ================================
 *     switch~case , do~while , continue => 아주 종종 
 */
import java.util.Scanner;
public class 반복문_for4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        for(;;)//무한루프 
        {
        	System.out.print("세자리 정수를 입력하세요?");
        	int user=scan.nextInt();
        	// 세자리 정수가 입력이 안된 경우처리 
        	if(user<100 || user>999)
        	{
        		System.out.println("잘못된 입력입니다!!");
        		continue;
        		// continue나 break밑에는 소스 코딩이 불가능하다
        	}
        	
        	int a=user/100;
        	int b=(user%100)/10;
        	int c=user%10;
        	
        	System.out.println("백단위:"+a);
        	System.out.println("십단위:"+b);
        	System.out.println("단단위:"+c);
        	
        	break;// 종료 
        }
	}

}
