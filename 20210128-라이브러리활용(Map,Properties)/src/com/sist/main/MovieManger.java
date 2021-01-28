package com.sist.main;

public class MovieManger {
   @RequestMapping("홈")
   public void movieHome()
   {
	   System.out.println("영화 홈입니다");
   }
   @RequestMapping("목록")
   public void movieList()
   {
	   System.out.println("영화 목록 페이지입니다");
   }
   @RequestMapping("상세")
   public void movieDetail()
   {
	   System.out.println("영화 상세보기 입니다");
   }
   @RequestMapping("예매")
   public void movieReserve()
   {
	   System.out.println("영화 예매 페이지입니다");
   }
}
