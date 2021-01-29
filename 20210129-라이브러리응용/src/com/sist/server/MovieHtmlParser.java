package com.sist.server;
// 임시
import java.util.*; // 데이터 수집 => ArrayList

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;// 파일에 저장 =>
/*
 *    자바에서 제공하는 IO(Input,Output)
 *    Input : 파일, 메모리,네트워크에서 데이터 읽기
 *    Output : 파일 , 메모리 , 네트워크 데이터 전송 
 *                   =====
 *                   System.out
 *                   System.in
 *    =======================================
 *    InputStream , OutputStream => 바이트 스트림(1byte씩 읽어 온다) => Upload,Download
 *    Reader , Writer => 문자 스트림 (2byte씩 읽어온다)
 *      *** 한글 (한글자당 => 2byte)
 */
public class MovieHtmlParser {
    // 상영 => 개봉 => 주간 => 월간 => 연간 ===> 저장은 한개의 파일에 저장 
	public void movieAllData()
	{
		/*
		 *   <div class="wrap_desc">
									<a href="/moviedb/main?movieId=135111"
		 */
		try
		{
			int mno=1;// 영화 고유 번호 
			int cno=1;// 카테고리 번호 
			for(int i=1;i<=3;i++)
			{
				Document doc=Jsoup.connect("https://movie.daum.net/premovie/released?reservationOnly=N&sort=reservation&page="+i).get();
			    Elements link=doc.select("div.wrap_desc a.desc_movie");
			    for(int j=0;j<link.size();j++)
			    {
			    	System.out.println(link.get(j).attr("href"));
			    	Document doc2=Jsoup.connect("https://movie.daum.net"+link.get(j).attr("href")).get();
			    	/*
			    	 *    <div class="aaa">
			    	 *      <a href="http://~">link</a>
			    	 *    </div>
			    	 *    
			    	 *    HTML은 데이터 저장 (태그,속성)
			    	 *    <span>aaa</span>  ==> select("span") ==> text()
			    	 *    <a href="http://~" class="">link</a> ==> ("a") ==> text():link attr("href"):http://~
			    	 *    
			    	 *    <div class="aaa">  select("div.bbb span")
			    	 *      <span>aaa</span>
			    	 *    </div>
			    	 *    <div class="bbb">
			    	 *      <span>bbb</span>
			    	 *    </div>
			    	 *    <div class="ccc">
			    	 *      <span>ccc</span>
			    	 *    </div>
			    	 *    
			    	 *    <a> => link 주소 
			    	 *    <img src="">
			    	 */
			    }
			}
		}catch(Exception ex)
		{
			// 에러 메세지 출력 
			ex.printStackTrace();// 복구 
		}
		/*
		 *  예외처리 
		 *    CheckException : IO(경로), 네트워크(서버IP),Thread(비동기화=>충돌),Web(URL=>site)
		 *                     SQL(sql문장)
		 *                     => 사전에 오류를 방지하는 프로그램 
		 */
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MovieHtmlParser m=new MovieHtmlParser();
        m.movieAllData();
	}

}










