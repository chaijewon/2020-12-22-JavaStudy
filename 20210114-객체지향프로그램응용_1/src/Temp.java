import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.*;
/*
 *  private int no;// 14
    private String title;//14
    private String poster;//14
    private String chef;//14
    private String link;
    private String hit;
    
    <li class="common_sp_list_li">
                <div class="common_sp_thumb">
                    <a href="/recipe/6869017" class="common_sp_link">
                                                <img src="https://recipe1.ezmember.co.kr/cache/recipe/2017/04/26/78f62ae9ce3063eb2cc280e0c112a6ed1_m.jpg">
                    </a>
                </div>
                <div class="common_sp_caption">
                    <div class="common_sp_caption_tit line2">【반전의맛】스팸 양배추 덮밥 만들기~</div>
                    <div class="common_sp_caption_rv_name" style="display: inline-block; vertical-align: bottom;">
                        <a href="/profile/recipe.html?uid=20618485"><img src="https://recipe1.ezmember.co.kr/cache/rpf/2020/06/05/67ebc9100bec839cbff7fa660ad139f31.1d3c00132bbe67d06b7c7817824d48ef">조밍키</a>
                    </div>
                    <div class="common_sp_caption_rv">
                                                    <span class="common_sp_caption_rv_star"><img src="https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png"><img src="https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png"><img src="https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png"><img src="https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png"><img src="https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png"></span>
                            <span class="common_sp_caption_rv_ea">(211)</span>
                                                <span class="common_sp_caption_buyer" style="vertical-align: middle;">조회수 16.9만</span>
                    </div>
                </div>
            </li>
 */
public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	int k=1;
        	JSONArray arr=new JSONArray();
        	for(int i=1;i<=3765;i++)
        	{
        		Document doc=Jsoup.connect("https://www.10000recipe.com/recipe/list.html?order=reco&page="+i).get();
        		Elements title=doc.select("li.common_sp_list_li div.common_sp_caption div.common_sp_caption_tit");
        		Elements chef=doc.select("li.common_sp_list_li div.common_sp_caption_rv_name");
        		Elements link=doc.select("li.common_sp_list_li div.common_sp_caption_rv_name a");
        		Elements hit=doc.select("div.common_sp_caption_rv span.common_sp_caption_buyer");
        		for(int j=0;j<title.size();j++)
        		{
					/*
					 * System.out.println(title.get(j).text()+"  " +chef.get(j).text()+"  "
					 * +link.get(j).attr("href")+"  " +hit.get(j).text());
					 */
        			Recipe r=new Recipe();
        			r.setNo(k);
        			r.setTitle(title.get(j).text());
        			r.setChef(chef.get(j).text());
        			r.setLink(link.get(j).attr("href"));
        			r.setHit(hit.get(j).text());
        			
        			JSONObject obj=new JSONObject();
        			obj.put("no", r.getNo());
        			obj.put("title", r.getTitle());
        			obj.put("chef", r.getChef());
        			obj.put("link", r.getLink());
        			obj.put("hit", r.getHit());
        			arr.add(obj);
        			System.out.println(k+"번째 입력 완료");
        			k++;
        		}
        	}
        	FileWriter fw=new FileWriter(new File("c:\\javaDev\\recipe_data.json"));
        	fw.write(arr.toJSONString());
        	fw.close();
        }catch(Exception ex){ex.printStackTrace();}
	}

}








