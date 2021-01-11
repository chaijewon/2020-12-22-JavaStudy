import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 *   1. 사용자로부터 ID,Password를 받아서 로그인 처리 => 결과값은 true/false
 *      메소드명 => login
 *      리턴형 메소드명(매개변수...)
 *      boolean login(String id,String pwd) => login("","")
 *      
 *      boolean bCheck=login("","");
 *      
 *   2. 검색 => 노래제목을 사용자로 부터 받아서 가수명을 결과값을 출력 
 *      find()
 *      ==> String find(String title)
 *      String singer=find("")
 *   3. 5정수를 사용자로부터 받아서 정렬후 결과값을 다시 전송 
 *      int[] sort(int[] arr) 
 *      int[] aaa={3,6,5,7,1}
 *      int[] arr=sort(aaa);
 *      *** 라이브러리에서 제공하는 메소드명은 키워드가 아니다 ...
 *      리턴형 : 
 *      매개변수 :
 *      ========================== 기본데이터형 , 참조데이터형(배열,클래스)
 *   4. 메소드 만드는 이유 : 분리 => 소스를 나눠서 처리 (관련된 내용을 모아서 만든다) : 가독성 , 수정
 *      ===== 유지보수 
 *      
 *      사용자 보내주는 값 (매개변수)
 *      결과값이 있는 경우 (리턴형) 
 *   5. 메소드가 종료가 될때 return을 사용 
 *      void => return을 생략할 수 있다 => JVM이 자동으로 첨부  
 *      
 *      ==> int[] arr={};
 *          int[] arr=new int[]{}
 *          
 *      https://www.genie.co.kr/chart/top200
 *      
 *      <td class="info">
                                    
               <a href="#" class="title
 */

public class 메소드만들기3{
	/*Your Lights
	겨울잠
	우린 어쩌다 헤어진 걸까
	요즘
	VVS (Feat. JUSTHIS) (Prod. by GroovyRoom)
	Dynamite
	밤하늘의 별을 (2020)
	첫사랑 (Feat. SOLE (쏠))
	Life Goes On
	이제 나만 믿어요
	나로 바꾸자 (Duet With JYP)
	잠이 오질 않네요
	What Do I Call You
	ON AIR (Feat. 로꼬 & 박재범 & GRAY)
	오래된 노래
	한잔이면 지워질까
	힘든 건 사랑이 아니다
	For You (Feat. Crush)
	Savage Love (Laxed - Siren Beat) (BTS Remix)
	취기를 빌려 (취향저격 그녀 X 산들)
	HERO
	Lovesick Girls
	서로를 위한 것
	뻔한남자
	내일이 오면 (Feat. 기리보이 & BIG Naughty (서동현))
	작은 것들을 위한 시 (Boy With Luv) (Feat. Halsey)
	잘할게
	CREDIT (Feat. 염따 & 기리보이 & Zion.T)
	어느 60대 노부부이야기
	만개 (Prod. 신지후)
	악역 (Feat. 이하이 & 사이먼 도미닉) (Prod. by 코드 쿤스트)
	혼술하고 싶은 밤
	흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야
	오늘도 빛나는 너에게 (To You My Light) (Feat.이라온)
	오래된 노래
	살았소
	그날에 나는 맘이 편했을까
	나보다 더 사랑해요
	입김
	모든 날, 모든 순간 (Every day, Every Moment)
	바램
	내 마음이 움찔했던 순간 (취향저격 그녀 X 규현)
	가을밤에 든 생각
	이제 나만 믿어요 (Piano by 조영수)
	뿌리 (Feat. JUSTHIS) (Prod. by GroovyRoom)
	에잇 (Prod. & Feat. SUGA of BTS)
	아무도 잠들지 마라 (Nessun Dorma)
	늦은 밤 너의 집 앞 골목길에서
	Achoo (Feat. pH-1 & HAON) (Prod. by GroovyRoom)
	Blueming*/
    /*
         이수 (엠씨더맥스)
장덕철
허각
양다일
미란이 (Mirani) & 먼치맨 & Khundi Panda & 머쉬베놈 (MUSHVENOM)
방탄소년단
경서
정준일
방탄소년단
임영웅
비
장범준
태연 (TAEYEON)
릴보이 (lIlBOI)
임영웅
황인욱
임창정
이하이
Jawsh 685 & Jason Derulo & 방탄소년단
산들
임영웅
BLACKPINK
나얼
이승기
릴보이 (lIlBOI)
방탄소년단
이승기
릴보이 (lIlBOI)
임영웅
김호중
스윙스 (Swings)
벤
장범준
마크툽 (Maktub)
Standing Egg (스탠딩 에그)
김호중
이예준
김호중
10CM
폴킴
임영웅
규현 (KYUHYUN)
잔나비
임영웅
Khundi Panda
아이유 (IU)
김호중
노을
미란이 (Mirani)
아이유 (IU)

     */
	/*Your Lights (바이크 원정대 OST Part.1)
	겨울잠
	Hello
	요즘
	쇼미더머니 9 Episode 1
	Dynamite (DayTime Ver.)
	밤하늘의 별을 (2020)
	첫사랑
	BE
	내일은 미스터트롯 우승자 특전곡
	나로 바꾸자
	잠이 오질 않네요
	What Do I Call You - The 4th Mini Album
	쇼미더머니 9 Final
	사랑의 콜센타 Part19
	한잔이면 지워질까
	힘든 건 사랑이 아니다
	For You
	Savage Love (Laxed - Siren Beat) (BTS Remix)
	취기를 빌려 (취향저격 그녀 X 산들)
	HERO
	THE ALBUM
	서로를 위한 것
	뻔한남자
	쇼미더머니 9 Episode 3
	MAP OF THE SOUL : PERSONA
	The Project
	쇼미더머니 9 Final
	내일은 미스터트롯 트롯 에이드 베스트
	우리家
	쇼미더머니 9 Semi Final
	혼술하고 싶은 밤
	멜로가 체질 OST Part 3 (JTBC 금토 드라마)
	Red Moon : To You My Light
	오래된 노래
	살았소
	그날에 나는 맘이 편했을까
	나보다 더 사랑해요
	5.1
	'키스 먼저 할까요?' OST Part. 3 (SBS 월화드라마)
	내일은 미스터트롯 예선곡 베스트
	내 마음이 움찔했던 순간 (취향저격 그녀 X 규현)
	잔나비 소곡집 l
	이제 나만 믿어요
	쇼미더머니 9 Episode 3
	에잇
	The Classic Album
	늦은 밤 너의 집 앞 골목길에서
	쇼미더머니 9 Episode 3
	Love poem*/
	/*유지
	유지
	유지
	유지
	유지
	유지
	유지
	유지
	2상승
	2상승
	1하강
	1하강
	7상승
	7상승
	2상승
	2상승
	3상승
	3상승
	4하강
	4하강
	26상승
	26상승
	20상승
	20상승
	8상승
	8상승
	32상승
	32상승
	7하강
	7하강
	20상승
	20상승
	23상승
	23상승
	23상승
	23상승
	16상승
	16상승
	28상승
	28상승
	12하강
	12하강
	30상승
	30상승
	30상승
	30상승
	48상승
	48상승
	34상승
	34상승
	12상승
	12상승
	18상승
	18상승
	14상승
	14상승
	16하강
	16하강
	19하강
	19하강
	39상승
	39상승
	7상승
	7상승
	27상승
	27상승
	61상승
	61상승
	31상승
	31상승
	21하강
	21하강
	26상승
	26상승
	21하강
	21하강
	23상승
	23상승
	27상승
	27상승
	25하강
	25하강
	5상승
	5상승
	44상승
	44상승
	26하강
	26하강
	6상승
	6상승
	9상승
	9상승
	28하강
	28하강
	38상승
	38상승
	7상승
	7상승
	15상승
	15상승
    */
	static void genie()
    {
    	try
    	{
    		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
    		Elements title=doc.select("td.number span.rank");
    		//Elements title=doc.select("td.info a.albumtitle");
    		String s="{";
    		for(int i=0;i<title.size();i++)
    		{
    			s+="\""+title.get(i).text()+"\",";
    		}
    		
    		s+="}";
    		System.out.println(s);
    	}catch(Exception ex) {}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       genie();
	}

}























