import java.util.*;
public class MainClass {

	static int menu()
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("============= 메뉴 ============");
		System.out.println("1. 전체 목록");
		System.out.println("2. 노래 찾기");
		System.out.println("3. 가수 노래 찾기");
		System.out.println("4. 상세 보기");
		System.out.println("5. 종료");
		System.out.println("===============================");
		
		int m=0;
		while(true)
		{
		   System.out.print("메뉴를 선택하세요?");
		   m=scan.nextInt();
		   if(m<1 || m>5)
		   {
			   System.out.println("없는 메뉴입니다.");
			   continue;
		   }
		   break;
		}
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        menu();
	}

}
