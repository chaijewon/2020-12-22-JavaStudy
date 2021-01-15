// 파일읽기 => recipe.json
import java.io.*;// 파일입출력 , 메모리입출력 , 네트워크 입출력 
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/*
 *   1. 요구사항 분석 
 *   2. 프로그램을 제작하기 전에 => 에러발생에 대한 예측 
 */
public class RecipeSite {
    public Recipe[] recipeAllData(int page)//인스턴스메소드 
    {
    	Recipe[] recipe=new Recipe[10];
    	StringBuffer data=new StringBuffer();
    	// IO => 예외처리 
    	try
    	{
    		// 정상수행문장 
    		// 파일을 읽어서 문자열로 저장 
    		FileReader fr=new FileReader("c:\\javaDev\\recipe_data.json");
    		int i=0;// 단점 => 1글자를 읽는다 => 문자번호 
    		// -1은 파일의 끝 (EOF , BOF)
    		while((i=fr.read())!=-1)
    		{
    			data.append(String.valueOf((char)i));
    		}
    		fr.close();
    		
    		String json=data.toString();
    		//System.out.println(json);
    		JSONParser parser=new JSONParser();
    		// class JSONObject extends Object
    		//JSONObject re=(JSONObject)parser.parse(json);
    		//System.out.println("re="+re);
    		// JSONArray  extends Object
    		JSONArray arr=(JSONArray)parser.parse(json);
    		//System.out.println("arr="+arr);
    		System.out.println(arr.size());
    		int j=0;
    		int pagecnt=(page*10)-10;
    		for(i=0;i<arr.size();i++)
    		{
    			/*
    			 *  "no": 146854,
					  "title": "댑땅커서... 한개 먹으면 배부른 점보 바나나 초코렛칩 머핀",
					  "poster": "https://recipe1.ezmember.co.kr/cache/recipe/2015/06/09/340ad2b10d86eb75698a1f7f6637545a_m.jpg",
					  "chef": "June",
					  "link": "/recipe/340368",
    			 */
    			if(j>10)break;
    			if(j<10 && i>=pagecnt)
    			{
	    			JSONObject obj=(JSONObject)arr.get(i);
	    			recipe[j]=new Recipe();
	    			String a=String.valueOf(obj.get("no"));
	    			//System.out.println("a="+a);
	    			recipe[j].setNo(Integer.parseInt(a));
	    			recipe[j].setTitle((String)obj.get("title"));
	    			// 1.클래스 형변환 , 예외처리 , 라이브러리(최적화)
	    			recipe[j].setChef((String)obj.get("chef"));
	    			//recipe[i].setPoster((String)obj.get("poster"));
	    			recipe[j].setLink((String)obj.get("link"));// setxxx() 쓰기:메모리에 저장 
	    			recipe[j].setHit((String)obj.get("hit"));
	    			j++;
    			}
    		}
    		
    	}catch(Exception ex){
    		// 에러가 날 경우을 대비하는 프로그램 
    		//ex.printStackTrace();
    	}
    	return recipe;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("페이지 입력:");
			int page=scan.nextInt();
			RecipeSite rs=new RecipeSite(); // recipeAllData()가 저장된다 
			Recipe[] recipe=rs.recipeAllData(page);
			System.out.println("====================== 레시피 목록 =======================");
			for(Recipe r:recipe)
			{
				System.out.println("번호:"+r.getNo());// 메모리 값을 읽어 올때 getXxx() => 메소드를 이용해서 통신 
				System.out.println("제목:"+r.getTitle());
				System.out.println("쉐프:"+r.getChef());
				System.out.println(r.getHit());
				System.out.println(r.getLink());
				System.out.println("========================================================");
			}
			System.out.print("쉐프 작품 보기 번호:");
			int num=scan.nextInt();
			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "+"https://www.10000recipe.com/"+recipe[num-1].getLink());
		}catch(Exception e) {}
	}

}











