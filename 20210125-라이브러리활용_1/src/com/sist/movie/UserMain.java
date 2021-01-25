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
        
	}

}
