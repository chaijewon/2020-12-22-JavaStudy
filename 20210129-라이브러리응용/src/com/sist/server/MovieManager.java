package com.sist.server;
// 데이터를 관리 (파일 = 오라클)
/*
 *    배열 (객체 배열) : 갯수 (고정)
 *    => 가변형 : 컬렉션 
 *    
 *    Collection 
 *       |
 *   ------------       
 *   |          |
 *  List      Set     Map  ===> 인터페이스
 *  기준점 
 *    List : 순서(인덱스)가 존재 , 데이터 중복 
 *           => 구현한 클래스 : ArrayList, Vector , LinkedList , Stack
 *                          ===========
 *    Set  : 순서(인덱스)가 없다 , 데이터 중복허용하지 않는다 
 *           => HashSet (중복없는 데이터를 모아서 List에 저장) ==> 오라클 DISTINCT
 *    
 *    = 라이브러리로 변경 : session,cookie,request,response(웹)
 *    Map  : 순서(인덱스)가 없다 , => key,value가 동시 저장 
 *                                key는 중복할 수 없다
 *                                value는 중복이 가능 
 *           => HashMap
 *    ======>
 *    프로그램 => 관련된 데이터끼리 모아서 관리 => 한개의 이름으로 제어(간결하고,사용하기 쉽다)
 *              int a=10; int b=20; int c=30;
 *              
 *              // 최대값 
 *              int max=0;
 *              if(max<a)
 *                 max=a;
 *              if(max<b)
 *                 max=b;
 *              if(max<c)
 *                 max=c
 *                 
 *              int[] arr={10,20,30};
 *              제어문 반복문 => 패턴(반복) => 데이터형이 통일
 *                                        ============ 제네릭스 
 *              ArrayList,Vector...
 *              ==================== 모든 데이터형 Object <String> 
 *           
 */
import java.util.*;
import java.io.*;
/*
 *    변수 : 한개만 저장할 수 있는 공간 
 *    배열 , 클래스 
 *    클래스 여러개 : 컬렉션
 */
public class MovieManager {
   private static ArrayList<MovieVO> list=new ArrayList<MovieVO>();// 제한이 없다
   // MovieVO[] 데이터 저장공간의 제한 => 고정  
   // 프로그램이 시작 => 데이터를 저장 => 초기화 블럭 (파일 => 메모리)
   static
   {
	   try
	   {
		   // 파일 읽기 , 오라클 
		   // | 별로 분리 => VO에 담는다 
		   // VO=>list
		   FileReader fr=new FileReader("c:\\javaDev\\daum_movie.txt");
		   StringBuffer sb=new StringBuffer();
		   int i=0;
		   while((i=fr.read())!=-1)
		   {
			   sb.append(String.valueOf((char)i));
		   }
		   fr.close();
		   //System.out.println(sb.toString());
		   // 영화별로 분리 
		   String[] movie_data=sb.toString().split("\n");
		   /*
		    *   218|
		    *   5|
		    *   밤쉘: 세상을 바꾼 폭탄선언(2019)|
		    *   8.0|
		    *   드라마|
		    *   2020.07.08 |
		    *   109분|
		    *   15세이상관람가|
		    *   제이 로치|
		    *   샤를리즈 테론|
		    *   //img1.daumcdn.net/thumb/C155x225/?fname=
		    *      https%3A%2F%2Ft1.daumcdn.net%2Fmovie%2F0a3e3e96d51a73
		    *      8c0e45c314899ce6e4793443ea|
		    *   182,026|
		    *   판단은 날카롭게, 외침은 당당하게, 행동은 과감하게! 
		    *   대선후보 토론회에서 트럼프와 설전을 벌인 폭스뉴스의 간판 
		    *   앵커 메긴 켈리(샤를리즈 테론)는 트럼프의 계속되는 트위터 공격으로 화제의 중심에 선다. 
		    *   한편, 동료 앵커인 그레천 칼슨(니콜 키드먼)은 
		    *   ‘언론 권력의 제왕’이라 불리는 폭스뉴스 회장을 고소하고 
		    *   이에 메긴은 물론, 야심 있는 폭스의 뉴페이스 케일라 포스피실(마고 로비) 
		    *   역시 충격을 감추지 못하는데… 최대 권력을 날려버릴 폭탄선언 이제
                이들의 통쾌하고 짜릿한 역전극이 시작된다!

		    */
		   for(String s:movie_data)
		   {
			   //System.out.println(s); // | 별로 분리 => VO에 첨부 => ArrayList첨부 
			   StringTokenizer st=new StringTokenizer(s,"|");
			   // String[] data=s.split("\\|");
			   MovieVO vo=new MovieVO();
			   vo.setNo(Integer.parseInt(st.nextToken()));
			   vo.setCno(Integer.parseInt(st.nextToken()));
			   vo.setTitle(st.nextToken());
			   vo.setScore(st.nextToken());
			   vo.setGenre(st.nextToken());
			   vo.setRegdate(st.nextToken());
			   vo.setTime(st.nextToken());
			   vo.setGrade(st.nextToken());
			   vo.setDirector(st.nextToken());
			   vo.setActor(st.nextToken());
			   vo.setPoster("http:"+st.nextToken());
			   vo.setShowUser(st.nextToken());
			   vo.setStory(st.nextToken());
			   
			   list.add(vo);
		   }
		   /*
		    *   | |
		    *   69|2|365일: 비밀의 여자(2018)|
		    *   0.0|스릴러|2021.01 |78분|청소년관람불가|콜린 플룸|그렉 네머|
		    *   //img1.daumcdn.net/thumb/C155x225/?fname=https%3A%2F%2Ft1.daumcdn.
		    *   net%2Fmovie%2Fc752aabe7c6e78facfcd63d6e7b55cc71c984913|
		    *   (개봉예정)|갑작스러운 어머니의 죽음으로 혼자가 된 브랜던. 어려운 형편으로 힘겹게 장례를 준비하는 중에 도움의 손길을 내민 피오나와 가까워진다. 장례식장을 운영하는 피오나와 언니 부부는 브랜던을 저녁 식사에 초대하고 처음 맛보는 요리와 아름다운 노래로 브랜던은 상처받은 마음에 위로를 얻는다. 자연스럽게 서로의 감정을 확인하는 브랜던과 피오나. 하지만 피오나의 사랑에는 어둡고 위험한 비밀이 숨겨져 있는데...

		    */
	   }catch(Exception ex){ex.printStackTrace();}
   }
   // 목록 출력 (전체)
   public ArrayList<MovieVO> movieListData(int page)
   {
	   ArrayList<MovieVO> mList=new ArrayList<MovieVO>();
	   int j=10; // 10개씩 나눠서 저장 
	   
	   int pagecnt=(page*10)-10; // 시작 위치 
	   // 0~218  (1~219)  == 219
	   int totalpage=movieListTotalPage();
	   
	   if(page==totalpage)
	   {
		  if(list.size()%10>0)
		  {
		      j=list.size()%10;   //220%10 ==> 0
		  }
	   }
	   
	   for(int i=pagecnt;i<pagecnt+j;i++)
	   {
		   MovieVO vo=list.get(i);
		   mList.add(vo);
	   }
	   
	   return mList;
   }
   // 카테고리별 출력 
   public ArrayList<MovieVO> movieCategoryData(int page,int cno)
   {
	   ArrayList<MovieVO> mList=new ArrayList<MovieVO>();
	   return mList;
   }
   // 상세 보기 
   public MovieVO movieDetailData(int no)
   {
	   MovieVO vo=list.get(no-1);
	   // vo=>영화 한개에 대한 모든 정보를 가지고 있다 
	   return vo;
   }
   // 찾기 
   public ArrayList<MovieVO> movieFindData(String title)
   {
	   ArrayList<MovieVO> mList=new ArrayList<MovieVO>();
	   for(MovieVO vo:list)
	   {
		   // 포함 
		   // SELECT * FROM movie WHERE title LIKE '%소%'
		   if(vo.getTitle().contains(title))
		   {
			   mList.add(vo);
		   }
	   }
	   return mList;
   }
   // 총페이지
   public int movieListTotalPage()
   {
	   int total=(int)(Math.ceil(list.size()/10.0));
	   return total;
   }
   public int movieCategoryTotalPage(int cno)
   {
	   // SELECT CEIL(COUNT(*)/10.0) FROM movie WHERE cno=1
	   int total=0;
	   int count=0;
	   for(MovieVO vo:list)
	   {
		   if(vo.getCno()==cno)
		   {
			   count++;
		   }
	   }
	   total=(int)(Math.ceil(count/10.0));
	   return total;
   }
   public static void main(String[] args) {
	  MovieManager m=new MovieManager();
	  /*String[] category={"","현재상영영화","개봉예정영화","박스오피스(주간)","박스오피스(월간)","박스오피스(연간)"};
	  System.out.println("총페이지:"+m.movieListTotalPage());
	  for(int i=1;i<=5;i++)
	  {
		  System.out.println(category[i]+":"+m.movieCategoryTotalPage(i));
	  }*/
		/*
		 * for(MovieVO vo:list) { System.out.println(vo.getNo()+"|"+vo.getStory()); }
		 */
	  Scanner scan=new Scanner(System.in);
	  /*System.out.print("검색어 입력:");
	  String find_data=scan.next();
	  ArrayList<MovieVO> list=m.movieFindData(find_data);
	  System.out.println("검색된 결과:"+list.size());
	  for(MovieVO vo:list)
	  {
		  System.out.println(vo.getNo()+":"+vo.getTitle());
	  }*/
	  /*System.out.print("상세볼 영화번호 입력(1~219):");
	  int no=scan.nextInt();
	  MovieVO vo=m.movieDetailData(no);
	  System.out.println("번호:"+vo.getNo());
	  System.out.println("제목:"+vo.getTitle());
	  System.out.println("감독:"+vo.getDirector());
	  System.out.println("출연:"+vo.getActor());
	  System.out.println("장르:"+vo.getGenre());
	  System.out.println("등급:"+vo.getGrade());
	  System.out.println("평점:"+vo.getScore());
	  System.out.println("시간:"+vo.getTime());
	  System.out.println("줄거리:"+vo.getStory());*/
	  System.out.print("페이지 입력:");
	  int page=scan.nextInt();
	  ArrayList<MovieVO> list=m.movieListData(page);
	  for(MovieVO vo:list)
	  {
		  System.out.println(vo.getNo()+":"+vo.getTitle());
	  }
   }
}





























