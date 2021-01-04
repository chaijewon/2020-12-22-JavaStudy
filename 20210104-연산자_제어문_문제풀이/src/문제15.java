import java.util.Scanner;
public class 문제15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int input;
        while(true)
        {
        	System.out.print("두자리 정수를 입력하세요(10~99):");
        	input=scan.nextInt();
        	if(input<10 || input>99)
        	{
        		System.out.println("잘못된 입력입니다!!");
        		continue; // while문 첫번째 줄로 이동 (조건식)
        	}
        	break;// 정상적으로 입력이 되었다면 => while을 종료 
        }
        
        // 78/10 7    78%10 = 8
        int a=input/10;
        int b=input%10;
        
        if(a==b)
        {
        	System.out.println("Yes!");
        }
        else
        {
        	System.out.println("No!");
        }
        
	}

}







