package com.sist.news;
import java.util.*;
import java.io.*;
public class NewsManager {
   private static ArrayList newsList=new ArrayList();
   // 데이터 공유 (static)
   static
   {
	   try
	   {
		   // 파일 읽기
		   FileReader fr=new FileReader("c:\\javaDev\\daum_news.txt");
		   int i=0;
		   StringBuffer sb=new StringBuffer();
		   while((i=fr.read())!=-1)
		   {
			   sb.append(String.valueOf((char)i));
		   }
		   fr.close();
		   // System.out.println(sb);// sb , sb.toString()
		   // 분리 
		   String data=sb.toString();
		   String[] news_data=data.split("\n");
		   
		   // aaa| |bbb|ccc
		   for(String news:news_data)
		   {
			   StringTokenizer st=new StringTokenizer(news,"|");
			   NewsVO vo=new NewsVO();
			   System.out.println(vo);
			   vo.setNo(Integer.parseInt(st.nextToken()));
			   vo.setTitle(st.nextToken());
			   vo.setContent(st.nextToken());
			   vo.setAuthor(st.nextToken());
			   vo.setPoster(st.nextToken());
			   vo.setLink(st.nextToken());
			   //vo.setLink(st.nextToken());
			   newsList.add(vo);
			   
		   }
		   
	   }catch(Exception ex){}
   }
   // 목록 출력 
   public ArrayList newsListData(int page)
   {
	   ArrayList list=new ArrayList();// 가변형 
	   int j=0;// 10개씩 나눠주는 변수   j<10
	   int pagecnt=(page*5)-5;
	   /*
	    *    1page : 0~9
	    *    2page : 10~19
	    *    3page : 20~29
	    */
	   for(int i=0;i<newsList.size();i++)
	   {
		   if(j>4) break;
		   if(j<5 && i>=pagecnt)
		   {
			   NewsVO vo=(NewsVO)newsList.get(i);
			   list.add(vo);
			   j++;
		   }
	   }
	   return list;
   }
   // 총페이지 
   public int newsTotalPage()
   {
	   return (int)(Math.ceil(newsList.size()/5.0)); // ceil:올림함수 
	   // 203/20.0 ==> 10.15  ==> ceil(10.15) ==> 11
   }
   public static void main(String[] args) {
	    NewsManager m=new NewsManager();
	    /*String msg="aaa| |bbb|ccc|ddd";
	    StringTokenizer st=new StringTokenizer(msg,"|");
	    System.out.println(st.nextToken());
	    System.out.println(st.nextToken());
	    System.out.println(st.nextToken());
	    System.out.println(st.nextToken());
	    System.out.println(st.nextToken());*/
		/*
		 * for(int i=0;i<newsList.size();i++) { NewsVO vo=(NewsVO)newsList.get(i);
		 * System.out.println(vo.getTitle()); }
		 */
	    ArrayList list=m.newsListData(30);
	    for(int i=0;i<list.size();i++)
	    {
	    	NewsVO vo=(NewsVO)list.get(i);
	    	//Object obj=list.get(i);
	    	
	    	System.out.println(vo.getNo()+"."+vo.getTitle());
	    }
	    //Integer ii=100;
	    //int i=ii;
	    
	    System.out.println("총페이지:"+m.newsTotalPage());
	    /*
	     *    class A
	     *    {
	     *        public String toString(){} //오버라이딩
	     *        public void display(){}
	     *    }
	     *    
	     *    Object obj=new A(); => Object가 가지고 있는 메소드중에 A클래스 오버라이딩된 것만 호출
	     *    
	     *    obj.toString()
	     *    obj.display() (X)
	     *    
	     *    A a=(A)obj;
	     *    a.toString();
	     *    a.display();
	     *    
	     */
	    String s="Hello"; // char[] s=new char[]{'H'...}
	    // int[] arr={10,20,30..}
	    // int[] arr=new int[]{}
	    
   }
}














