package com.sist.movie;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

// daum_movie.txt 
// daum_news.txt
/*
 *    String sql="SELECT name,sex,addr FROM member"
 *              +"FROM member";
 *    데이터 읽기 => 파일 저장 
 *    데이터 읽기 => 데이터 전송 => 파일 저장 
 *    
 *    예외처리 => 사전에 에러에 대한 대비 (사용자 실수 , 프로그래머 실수)
 *                                  ========= 
 *     = 예외(에러:수정이 가능한 에러) 복구 
 *       실행 => try , 에러발생 => catch 에러복구 (처음으로 변경 , 점프) : 여러개 사용이 가능
 *     = 예외 회피 : 시스템에서 처리 (컴파일러 통과) : throws
 *     = 예외 전환 : 다른 에러발생 시선을 변경 : throw
 *     
 *     CheckException UnCheckExeption(RuntimeException)
 *       |
 *     IOException : 입출력 
 *                   =====
 *                   1) 메모리 입출력 
 *                   2) 파일 입출력
 *                   3) 네트워크 입출력 (실제 서버, 웹서버)
 *     MalformedURLException : 웹에 연결 
 *     InterrutedException : 쓰레드 (충돌)
 *     ClassNotFoundException 
 *     SQLException 
 *     
 *     
 *     <li>
				<a href="http://v.movie.daum.net/v/20210126150636582" 
				class="thumb_line bg_noimage2" data-tiara-layer="bestpoint" data-tiara-ordnum="1" data-tiara-id="20210126150636582" data-tiara-type="news">
				<span class="thumb_img" style="background-image:url(//img1.daumcdn.net/thumb/S320x200/?fname=https://t1.daumcdn.net/news/202101/26/Edaily/20210126150638344cybo.jpg);"></span>
				</a>
				<span class="cont_line">
					<strong class="tit_line">
					<a href="http://v.movie.daum.net/v/20210126150636582" class="link_txt" data-tiara-layer="title" data-tiara-ordnum="1" data-tiara-id="20210126150636582" data-tiara-type="news">전양준 집행위원장, 부국제 떠난다.."회한·미련 無"</a></strong>
					<a href="http://v.movie.daum.net/v/20210126150636582" class="desc_line" data-tiara-layer="desc_line" data-tiara-ordnum="1" data-tiara-id="20210126150636582" data-tiara-type="news">
						전양준 부산국제영화제 집행위원장[이데일리 스타in 박미애 기자] 전양준 부산국제영화제 집행위원장이 부산국제영화제를 떠난다. 전 집행위원장은 26일 SNS에 “부산국제영화제에서의 25년을 끝내고 1월 31일부로 새로운 모험을 향해 부산을 떠난다”고 밝혔다. 그는 “부산국제영화제를 창설하고, 부산이 아시아 유일의 메이저 영화제의 위상을 확립하는 데 크게 기여
					</a>
					<span class="state_line">
						이데일리<span class="txt_dot">・</span><span class="screen_out">발행일자</span>21.01.26
					</span>
				</span>
			</li>
 */
public class MovieManager {
  public static void main(String[] args) {
	 MovieManager m=new MovieManager();
	 m.daumNewsData();
	 //static에서 인스턴스메소드 호출시에는 반드시 객체를 생성후에 호출 
  }
  public void daumNewsData()
  {
	  // 웹서버 연결 (네트워크) => CheckException => 컴파일시에 예외처리 여부 확인 
	  /*
	   *   <li>
	   *    <img/> Element  <img>=>20 ==> Elements
	   *    <span></span>
	   *    <a></a>
	   *   </li>
	   *   <li>
	   *    <img/>
	   *    <span></span>
	   *    <a></a>
	   *   </li>
	   *   ...
	   *   ...
	   *   ...
	   */
	  try
	  {
		  // 1. 웹서버(다음)에 연결해서 news에 대한 데이터를 읽기 시작 
		  int k=1;
		  for(int i=1;i<=15;i++)
		  {
		     Document doc=Jsoup.connect("https://movie.daum.net/magazine/new?tab=nws&regdate=20210126&page="+i).get();
		      // Document => 문서 저장 공간
		     Elements title=doc.select("strong.tit_line a");
		     Elements content=doc.select("a.desc_line");
		     Elements author=doc.select("span.state_line");
		     Elements poster=doc.select("span.thumb_img");
		     Elements link=doc.select("a.link_txt");
		     for(int j=0;j<title.size();j++)
		     {
		    	 // size()=> 저장된 갯수 
		    	 /*
		    	  *    <span>aaa</span>
		    	  *    <img src="">
		    	  */
		    	 System.out.println("번호:"+k);
		    	 System.out.println("제목:"+title.get(j).text());
		    	 System.out.println("내용:"+content.get(j).text());
		    	 System.out.println("저자:"+author.get(j).text().replace("・", " "));
		    	 String img=poster.get(j).attr("style");
		    	 //System.out.println(img.indexOf("(")+1);
		    	 img=img.substring(img.indexOf("(")+1,img.lastIndexOf(")"));
		    	 /*
		    	  *   background-image:url(http://img1.daumcdn.net/thumb/S320x200/?fname=https://t1.daumcdn.net/news/202101/26/sportsdonga/20210126065714178xvwy.jpg);
		    	  */
		    	 System.out.println("http:"+img);
		    	 System.out.println("링크:"+link.get(j).attr("href"));
		    	 System.out.println("=============================================");
		    	 k++;
		     }
		  }
	  }catch(Exception ex)
	  {
		  ex.printStackTrace();
		  /*
		   *  오류를 확인 방법  : 에러 메세지 확인 (getMessage())
		   *                  실행하는 과정 => 에러난 소스위치 확인 (printStackTrace())
		   */
	  }
  }
}











