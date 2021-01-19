package com.sist.main;
/*
 *   추상 클래스 ===> Board
 *     = 구현이 가능한 메소드
 *     = 선언만 하는 메소드
 */
abstract class Board
{
	public abstract void write();// 글쓰기  
	public abstract  void list();// 목록
	public abstract  void detail();// 상세보기
	public void update(){}// 수정
	public abstract void delete(); // 삭제
	public void find() {}
}
class 게시판 extends Board
{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	/*public void write() {} // 글쓰기  
	public void list() {} // 목록
	public void detail() {} // 상세보기
	public void update() {} // 수정
	public void delete() {} // 삭제
	public void find() {}*/
}
class 자료실 extends Board
{
	/*public void write() {} // 글쓰기 , 파일올리기
	public void list() {} // 목록
	public void detail() {} // 상세보기 , 파일 다운로드
	public void update() {}  // 수정
	public void delete() {} // 삭제 => 파일
	public void find() {} // 찾기*/
	public void upload() {}
	public void download() {}
	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void detail() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
}
class 답변게시판 extends Board
{
	/*public void write() {} // 글쓰기
	public void list() {} // 목록 , 답변을 출력 
	public void detail() {} // 상세보기 
	public void update() {} //수정
	public void delete() {} // 삭제 => 답변
	public void find() {} //찾기*/
	public void reply() {}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
}
class 댓글게시판 extends Board
{
	/*public void write() {} // 글쓰기
	public void list() {} // 목록
	public void detail() {} // 상세보기 , 댓글 
	public void update() {} //수정 
	public void delete() {} // 삭제 => 댓글 
	public void find() {} //찾기*/
	public void replyWrite() {}
	public void replyDelete() {}
	public void replyUpdate() {}
	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void detail() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
