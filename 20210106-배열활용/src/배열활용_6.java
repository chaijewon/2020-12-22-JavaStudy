// 문자열 => String => char[] 
/*
 *   String : 데이터형 , 클래스 (문자열을 제어 할 수 있는 기능=메소드)
 *   문자열에서 문자한개를 가지고 올때   => charAt(0) 
 *      ABCDEFG
 *      0123456
 *   문자열의 갯수 확인 length()
 *   문자열 비교 equals => Login (id,pwd)
 *   문자열 포함된 단어 contains() 
 *   =============
 *   시작하는 문자열 startsWith()
 *   끝나는 문자열  endsWith()
 *   ============= 서제스트 (검색)
 *   문자열 자르기 substring()  ==> A.java  02)111-1111
 *   문자열 => 대문자 , 소문자 
 *           =====   =====
 *           toUpperCase() , toLowerCase()
 *   
 */
import java.util.Scanner;
public class 배열활용_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. 문자의 갯수 가지고 오기 (length())
		String data="Hello Java!!"; // 공백도 포함 
		System.out.println("문자의 갯수:"+data.length());
		// 2. 대문자로 변환 (toUpperCase())
		System.out.println("대문자 변환:"+data.toUpperCase()); //알파벳만 변경
		// char c='a' ==> (c-32) ='A' a=97 A=65
		// 3. 소문자로 변환 (toLowerCase())
		System.out.println("소문자 변환:"+data.toLowerCase());
		// 4. charAt(index) => 문자열은 번호 0번 부터 시작 
		/*
		 *   Hello Java!!
		 *   01234567891011
		 *   
		 *   J ==> charAt(6)
		 */
		System.out.println("문자한개 읽기:"+data.charAt(8));
		
		// 5. contains() => 문자열중에 특정문자가 포함 => true/false
		System.out.println("포함여부:"+data.contains("Java"));// LIKE => 우편번호검색
		
		Scanner scan=new Scanner(System.in);
		String[] find_data={"자바라",
							"자바",
							"자바라 칸막이",
							"자바라 호스",
							"자반증 자바",
							"자바 다운로드",
							"자바라 문",
							"자바라 자바",
							"자바라 커튼",
							"자바 스크립트",
							"자발적 퇴사 실업급급여 조건",
							"자바라 자바",
							"자바나스",
							"자바스크립트 오류 해결",
							"자반 고등어"};
		System.out.print("검색어 입력:");
		String fd=scan.next();// 검색어를 받는다 
		for(String s:find_data) // 자동 완성기 (검색기)  
		{
			//if(s.startsWith(fd))
			if(s.endsWith(fd))
			{
				System.out.println(s);
			}
		}
	}

}










