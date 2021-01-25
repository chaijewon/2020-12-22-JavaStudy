package com.sist.movie;
import java.io.*;
// String/StringBuffer
public class MovieManager {
   // 모든 사용자(user)가 같은 영화정보를 공유한다 
   private static MovieVO[] movie=new MovieVO[1938];
   // 1. 파일에서 데이터를 읽어서 배열에 저장 => 초기화 
   /*
    *   1. 명시적 초기화 
    *   2. 생성자 : 사용자의 입력값을 받아서 초기 : 오버로딩 
    *   3. 초기화 블럭 : 사용자의 입력값을 받아서 초기화 (X) => 인스턴스블럭보다 static블럭일 경우에 주로 사용 
    *   
    */
   static
   {
	   // 파일에서 읽어서 저장을 할 수 있다 => 구현 
	   // 파일 전체 읽기
	   // 읽은 데이터 => 분리 => MovieVO에 저장
	   try
	   {
		   StringBuffer sb=new StringBuffer();
		   int i=0;
		   FileReader fr=new FileReader("c:\\javaDev\\movie.txt"); // IO(CheckException)
		   while((i=fr.read())!=-1)
		   {
			   sb.append(String.valueOf((char)i));//문자를 한글짜 읽어서 메모리에 저장한다 
			   // valueOf() : web,윈도우,네트워크 => 문자열만 사용(String)
		   }
		   fr.close();
		   // 배열에 저장 
		   String data=sb.toString();
		   String[] movie_data=data.split("\n");
		   i=0;// 배열 첨자(배열 인덱스)
		   // String m==> 1938
		   for(String m:movie_data)
		   {
			   //System.out.println(m);
			   String[] vo=m.split("\\|"); // split는 정규식 => 사용중인 
			   movie[i]=new MovieVO();// 1938개 생성 
			   // MovieVO[] movie=new MovieVO[1938]; => 메모리가 생성 
			   // MovieVO[] movie={null,null,......}
			   // int[] arr=new int[10]; => 0,0,0
			   // arr[0]=10;
			   movie[i].setMno(Integer.parseInt(vo[0])); 
			   // 문자열을 정수로 변환 Integer.parseInt(문자열)
			   movie[i].setTitle(vo[1]);
			   movie[i].setGenre(vo[2]);
			   movie[i].setPoster(vo[3]);
			   movie[i].setActor(vo[4]);
			   movie[i].setRegdate(vo[5]);
			   movie[i].setGrade(vo[6]);
			   movie[i].setDirector(vo[7]);
			   //System.out.println("오류:"+(i+1));
			   /*
			    *    ^ : 부정 , 시작    [^A-Z]:알파벳 대문자 제외 , ^[A-Z] : 대문자로 시작
			    *    $ : 끝 [0-9] : 숫자로 끝난 문자열
			    *    + : 한글자 이상이 존재 
			    *        맛있+ => 맛있는 , 맛있고 ...
			    *    * : 0이상 
			    *    | : 선택   => 맛있|맛없
			    *    ? : 앞에,뒤에 한글자 포함 
			    *    . : 임의의 한글 
			    *    ===> 일반 문자열로 사용 => \\
			    */
			   i++;
		   }
	   }catch(Exception ex){ex.printStackTrace();}
   }
   
   /*
    *    class A
    *    {
    *        선언만 가능 (예외처리,제어문,연산처리 , 값대입 (X))
    *        int a=10; (O)
    *        int a;
    *        a=10; (X)
    *    }
    */
   // 기능 설계 (메소드)
   // 첫번째 => 목록 출력 
   public static MovieVO[] movieListData(int page)
   {
	   // 페이지 나누기 
	   MovieVO[] m=new MovieVO[10];
	   if(page==movieTotalPage())
	   {
		   m=new MovieVO[movie.length%10];
	   }
	   
	   int j=0;// 10개씩 나눠주는 변수 
	   int rowSize=10;
	   int pagecnt=(rowSize*page)-rowSize;// 페이지의 시작점 
	   /*
	    *   1page => 0~9
	    *   2page => 10~19
	    */
	   for(int i=0;i<movie.length;i++)
	   {
		   if(j<10 && i>=pagecnt)
		   {
			   m[j]=movie[i];
			   j++;
		   }
	   }
	   
	   return m;
   }
   // 두번째 => 총페이지 
   public static int movieTotalPage()
   {
	   int count=movie.length;
	   int total=(int)(Math.ceil(count/10.0)); // 1938/10.0  => 193.8(0이상=> 올림) => 194
	   return total;
   }
   // 영화 상세보기 => MovieVO (영화 1개에 대한 모든 정보) => ArrayList,Vector(컬렉션)
   public static MovieVO movieDetailData(int mno)
   {
	   MovieVO vo=new MovieVO();
	   // vo에 값을 채운다 
	   vo=movie[mno-1];// 영화번호=> 1번부터 , 배열의 인덱스=>0번부터 
	   return vo;
   }
   
}













