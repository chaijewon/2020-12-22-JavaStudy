import java.util.Scanner;
/*
 *    변수
 *      = 멤버변수 
 *      = 공유변수 : static 
 *      = 지역변수 
 *    메소드 
 *      = 멤버메소드
 *      = 공유메소드(클래스메소드) : static
 *      = 추상메소드 
 *    =================================
 *    1. 데이터를 묶어서 처리
 *    2. 명령문을 묶어서 처리
 *    ==================== + 클래스(변수+메소드)
 */
public class 메소드활용_5 {
    // 1. 메뉴 
	//  int m=menu()
	//  m=>return값을 받는 변수 
	static int menu()
	{
		Scanner scan=new Scanner(System.in);// 메뉴선택
		// 메뉴를 보여준다 
		System.out.println("================= 메뉴 ================");
		System.out.println("1. 뮤직 Top50 전체 보기");
		System.out.println("2. 노래 검색");
		System.out.println("3. 가수명 검색");
		System.out.println("4. 상세 보기");
		System.out.println("5. 프로그램 종료");
		System.out.println("======================================");
		int m=0;
		while(true)
		{
			System.out.print("메뉴를 선택하세요(1~5)?");
			m=scan.nextInt();
			if(m<1 || m>5)
			{
				System.out.println("없는 메뉴입니다!!");
				continue; // while 처음으로 이동
			}
			break; // while을 종료
		}
		return m;
	}
	// 2. 전체 목록
	static void musicAllData()
	{
		String[] title=메소드활용_4.title;
		String[] singer=메소드활용_4.singer;
		String[] album=메소드활용_4.album;
		System.out.println("************************ 음악 전체 목록 ****************************");
		for(int i=0;i<50;i++)
		{
			System.out.println("노래명:"+title[i]);
			System.out.println("가수명:"+singer[i]);
			System.out.println("앨범:"+album[i]);
			System.out.println("*****************************************************************");
		}
		
	}
	// 3. 노래 찾기
	// 4. 가수명으로 노래찾기 
	// 5. 상세보기 
	// 6. 종료
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        while(true)
        {
        	int m=menu();
        	switch(m)
        	{
        	case 1:
        		musicAllData();
        		break;
        	case 5:
        		System.out.println("프로그램 종료");
        		System.exit(0);// 프로그램 종료
        		//break;
        	}
        }
	}

}







