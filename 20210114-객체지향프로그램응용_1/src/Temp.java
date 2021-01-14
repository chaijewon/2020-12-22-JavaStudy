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
    
    <div class="common_sp_thumb">
                    <a href="/recipe/18398" class="common_sp_link">
                                                <img src="https://recipe1.ezmember.co.kr/cache/recipe/2015/06/05/a85e6336befeec1cae2ca1cf3773d682_m.jpg">
                    </a>
                </div>
                <div class="common_sp_caption">
                    <div class="common_sp_caption_tit line2">과일샐러드</div>
                    <div class="common_sp_caption_rv_name" style="display: inline-block; vertical-align: bottom;">
                        <a href="/profile/recipe.html?uid=lsy"><img src="https://recipe1.ezmember.co.kr/img/df/pf_100_100.png">새날</a>
                    </div>
                    <div class="common_sp_caption_rv">
                                                <span class="common_sp_caption_buyer" style="vertical-align: middle;">조회수 976</span>
                    </div>
                </div>
 */
public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	for(int i=1;i<=3765;i++)
        	{
        		Document doc=Jsoup.connect("https://www.10000recipe.com/recipe/list.html?order=reco&page="+i).get();
        		Elements title=doc.select("div.common_sp_caption_tit");
        		Elements chef=doc.select("div.common_sp_caption_rv_name");
        		Elements link=doc.select("div.common_sp_caption_rv_name a");
        		Elements hit=doc.select("span.ommon_sp_caption_buyer");
        		for(int j=0;j<title.size();j++)
        		{
        			System.out.println(title.get(j).text()+"  "
        					+chef.get(j).text()+"  "
        					+link.get(j).attr("href")+"  "
        					+hit.get(j).text());
        		}
        	}
        }catch(Exception ex){ex.printStackTrace();}
	}

}
