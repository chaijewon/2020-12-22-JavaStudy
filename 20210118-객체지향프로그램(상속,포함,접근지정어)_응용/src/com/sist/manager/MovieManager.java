package com.sist.manager;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/*
 *   ================================
 *    1. 클래스 : public 
 *    2. 생성자 : public 
 *    3. 메소드 : public , protected
 *    4. 변수 : private
 *       = 지역변수 : final 
 *   =================================
 *   static , abstract , final 
 *   
 *   클래스 : public ,(default) , final , abstract
 *           = public class
 *           = class 
 *           
 *           예)
 *               => 일반 클래스 
 *               public class className{
 *               }
 *               
 *               => 종단 클래스 (상속하지 않는다) => 품절(거의 사용빈도 없다)
 *               public final class className{
 *               }
 *               
 *               => 추상 클래스 (자신이 메모리 할당을 할 수 없다) => new를 사용하지 않는다
 *               public abstract class className{
 *               }
 *               
 *               => public static class className(사용할 수 없다)
 *                   only public, abstract & final
 *   메소드 : public , protected , abstract , static , final 
 *   변수 : private , static , final 
 */
public class MovieManager {
	// public MovieManager(){}
	
   public MovieVO[] movieAllData()
   {
	   MovieVO[] movie=new MovieVO[7];// 데이터를 7개 모아서 main으로 전송
	   System.out.println("MovieManager:"+movie);
	   try
   	  {
   		FileReader fr=new FileReader("c:\\javaDev\\movie.json"); // movie.json파일안에 7개의 영화데이터
   		String data="";
   		int i=0;// 문자 번호 => 'A' => 65
   		while((i=fr.read())!=-1) // -1 파일끝  read()=>한글자씩 읽어온다 
   		{
   			data+=String.valueOf((char)i); // 문자열 결합 
   			//               문자 번호를 문자로 변환 => String에 저장
   			// 데이터가 많은 경우에는 String => StringBuffer
   			/*
   			 *   + => 산술연산자 , 문자열 결합 
   			 */
   		}
   		fr.close();// 파일 닫기 
   		System.out.println(data); // 전체가 파일에 묶였는지 확인 
   		
   		// 파싱 (파일에서 관련된 데이터 읽기)
   		/*
   		 *    {} => JSONObject
   		 *    [] => JSONArray
   		 *    
   		 *    {"datas":[{"actor":"가엘 가르시아 베르날 , 앤서니 곤잘레스 , 벤자민 브랫",
              "director":"리 언크리치",
              "grade":"전체",
				"title":"코코",
				"poster":"http:\/\/img.cgv.co.kr\/Movie\/Thumbnail\/Poster\/000080\/80397\/80397_185.jpg",
				"mno":1,
				"story"
				
				movie[i].setTitle("코코");// 데이터를 한개씩 읽어 온다 
   			    movie[i].setActor("가엘 가르시아 베르날 , 앤서니 곤잘레스 , 벤자민 브랫");
   		 *    
   		 */
   		JSONParser jp=new JSONParser();
   		JSONObject root=(JSONObject)jp.parse(data);
   		System.out.println(root.toJSONString());// 문자열 변환 
   		//{datas
   		JSONArray arr=(JSONArray)root.get("datas");
   		System.out.println(arr.toJSONString());
   		//[
   		//System.out.println(arr.size());
   		for(i=0;i<7;i++)
   		{
   			movie[i]=new MovieVO();// 객체 배열 
   			/*
   			 *    ======================  ==> 7개를 만들어서 데이터 수집 
   			 *           mno
   			 *    ======================
   			 *          title
   			 *    ======================
   			 *          director
   			 *    ======================
   			 *          actor
   			 *    ======================
   			 *          poster
   			 *    ======================
   			 *          grade
   			 *    ======================
   			 *          story
   			 *    ======================
   			 */
   			System.out.println("movie["+i+"]:"+movie[i]);
   			JSONObject obj=(JSONObject)arr.get(i);
   			System.out.println(obj.toJSONString());
   			// JSON => 데이터 (int=>long)
   			//int mno=(int)obj.get("mno");
   			//movie[i].setMno(mno);
   			// Integer.parseInt => String을 int변환
   			movie[i].setTitle((String)obj.get("title"));// 데이터를 한개씩 읽어 온다 
   			movie[i].setActor((String)obj.get("actor"));
   			movie[i].setPoster((String)obj.get("poster"));
   			movie[i].setDirector((String)obj.get("director"));
   			movie[i].setGrade((String)obj.get("grade"));
   			movie[i].setStory((String)obj.get("story"));
   			// 변수의 초기값을 설정 
   		}
   	}catch(Exception ex){}
	   return movie;
   }
}
