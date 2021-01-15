import java.util.*;
public class RecipeMenu {
	private static String[] menu1={"밑반찬","메인반찬","찌개","디저트","만두밥","죽","퓨전","김치","젓갈","장류","양념","소스","잼","양식"
            ,"샐러드","스프","빵","과자","음료","술"};
    private static String[] menu2={"일상","초스피드","손님접대","술안주","다이어트도시락","영양식","간식","야식","푸드스타일링","해장","명절","이유식"};
    private static String[] menu3={"소고기","돼지고기","닭고기","육류","채소류","해물류","달걀","유제품","가공식품류","쌀","밀가루",
             "건어물류","버섯류","과일류","콩","견과류","곡류"};
    private static String[] menu4={"볶음","끓이기","부침","조림","무침","비빔","찜","절임","튀김","삶기","굽기","데치기","회"};
    /*
     *      종류별
			상황별
			재료별
			방법별
     */
    public int main_menu()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("=============== Main Menu ===============");
    	System.out.println("1. 종류별 , 2. 상황별 , 3. 재료별 , 4. 방법별");
    	System.out.print("메뉴를 선택하세요?");
    	int num=scan.nextInt();
    	return num;
    }
    public int menu(int index)
    {
    	String[] menu=null;
    	switch(index)
    	{
    	case 1:
    		menu=menu1;
    		break;
    	case 2:
    		menu=menu2;
    		break;
    	case 3:
    		menu=menu3;
    		break;
    	case 4:
    		menu=menu4;
    		break;
    	}
    	for(int i=0;i<menu.length;i++)
    	{
    		System.out.println((i+1)+"."+menu[i]);
    	}
    	System.out.println("=======================");
    	Scanner scan=new Scanner(System.in);
    	System.out.print("레시피 재료를 선택하세요?");
    	int num=scan.nextInt();
    	return num;
    }
    
    public static void main(String[] args) {
		RecipeMenu rm=new RecipeMenu();
		int num=rm.main_menu();
		int rnum=rm.menu(num);
		
	}
    
}
