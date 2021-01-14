/*
 *    "no": 1,
	  "title": "삶은고사리조기찜 만드는법 ~",
	  "poster": "https://recipe1.ezmember.co.kr/cache/recipe/2020/12/14/340a26d592d68c43757cd03e79596e231_m.jpg",
	  "chef": "행복한미니미니맘",
	  "link": "/recipe/6948372",
	  "hit": "조회수 119"
	  
	  캡슐화 
	  =====
	    접근지정어 
	    ***private : 자신의 클래스에서만 접근이 가능 
	    ***default : private+같은 폴더에서 접근이 가능 
	    protected :  private+default+다른 폴더 => 상속
	    ***public :  모든 클래스에서 접근이 가능 
	    *
	    ===========================================
	    클래스 , 메소드 => 모든 클래스와 연결 : public
	    변수 (멤버변수) : private 
	    
	    
	    변수 => 변경할 수 있는 메모리 공간 
	    ===
	     기본데이터형 => 한개만 저장  
	     배열       => 같은 타입의 데이터 저장
	     클래스     => 다른 타입의 데디어 저장 
 */
// 캡슐화 코딩 
public class Recipe {
    private int no;// 14
    private String title;//14
    private String poster;//14
    private String chef;//14
    private String link;
    private String hit;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getChef() {
		return chef;
	}
	public void setChef(String chef) {
		this.chef = chef;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getHit() {
		return hit;
	}
	public void setHit(String hit) {
		this.hit = hit;
	}
	   
   
}









