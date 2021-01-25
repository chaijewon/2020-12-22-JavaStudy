package com.sist.movie;
import java.util.Scanner;
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        // 영화정보를 볼 페이지를 입력하시오 
        int totalpage=MovieManager.movieTotalPage();
        
        int page=1;
        // 페이지가 정상으로 입력되었는지 오류체크 
        while(true)
        {
        	System.out.print("영화 목록을 볼 페이지 지정(1~"+totalpage+"):");
        	page=scan.nextInt();
        	if(page<1 || page>totalpage)
        	{
        		System.out.println("존재하지 않는 페이지 입니다!!");
        		continue;
        	}
        	break;
        }
        System.out.println("===========현재 보고 있는 페이지는 "+page+"페이지 입니다=============");
        MovieVO[] movie=MovieManager.movieListData(page);
        for(MovieVO vo:movie)
        {
        	if(vo==null) break;
        	System.out.println("영화번호:"+vo.getMno());
        	System.out.println("영화명:"+vo.getTitle());
        	//System.out.println("장르:"+vo.getGenre());
        	//System.out.println("감독:"+vo.getDirector());
        	//System.out.println("출연:"+vo.getActor());
        	//System.out.println("등급:"+vo.getGrade());
        	//System.out.println("개봉일:"+vo.getRegdate());
        	System.out.println("============================================================");
        }
        System.out.print("영화 상세 볼 영화번호를 입력하세요?");
        int detail_no=scan.nextInt();
        MovieVO vo=MovieManager.movieDetailData(detail_no);
        System.out.println("==================="+vo.getTitle()+" 상세보기======================");
        System.out.println("영화번호:"+vo.getMno());
    	System.out.println("영화명:"+vo.getTitle());
    	System.out.println("장르:"+vo.getGenre());
    	System.out.println("감독:"+vo.getDirector());
    	System.out.println("출연:"+vo.getActor());
    	System.out.println("등급:"+vo.getGrade());
    	System.out.println("개봉일:"+vo.getRegdate());
        
	}

}







