/*
 *    메소드 (Method) : 재사용 (수정,추가)
 *    ==============
 *     = 특정작업을 수행하기 위한 명령문의 집합 
 *     ** 한개의 기능을 수행하기 위한 키워드 
 *     목적 : 중복하는 코드의 반복을 줄일 수 있다 
 *     예) 
 *         로그인 처리
 *         ID중복체크 
 *         회원가입 , 회원수정 , 회원탈퇴 
 *         게시판 
 *         =====
 *           1. 글쓰기 => 수정 
 *           2. 내용보기 
 *           3. 찾기
 *           3-1 . 답변
 *           4. 수정
 *           5. 삭제 
 *           
 *     1) 메소드 선언 
 *        결과값(리턴형) 메소드명(사용자 입력값.....(매개변수)) : 매개변수 => 
 *        ===========        =======================
 *        int,double(float),char,boolean,byte,short,[]...,String
 *        결과값이 없는 경우 : void
 *     2) 메소드 구현
 *        {
 *            구현부 
 *        }
 *     3) 메소드 호출 
 *        메소드명(값,값);
 *     
 */
public class 메소드기초 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        
        for(int i=1;i<=100;i++)
        {
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}









