import java.util.*;
public class RecipeMenu {
	private static String[] menu1={"�ع���","���ι���","�","����Ʈ","���ι�","��","ǻ��","��ġ","����","���","���","�ҽ�","��","���"
            ,"������","����","��","����","����","��"};
    private static String[] menu2={"�ϻ�","�ʽ��ǵ�","�մ�����","������","���̾�Ʈ���ö�","�����","����","�߽�","Ǫ�彺Ÿ�ϸ�","����","����","������"};
    private static String[] menu3={"�Ұ��","�������","�߰��","����","ä�ҷ�","�ع���","�ް�","����ǰ","������ǰ��","��","�а���",
             "�Ǿ��","������","���Ϸ�","��","�߰���","���"};
    private static String[] menu4={"����","���̱�","��ħ","����","��ħ","���","��","����","Ƣ��","���","����","��ġ��","ȸ"};
    /*
     *      ������
			��Ȳ��
			��Ằ
			�����
     */
    public int main_menu()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("=============== Main Menu ===============");
    	System.out.println("1. ������ , 2. ��Ȳ�� , 3. ��Ằ , 4. �����");
    	System.out.print("�޴��� �����ϼ���?");
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
    	System.out.print("������ ��Ḧ �����ϼ���?");
    	int num=scan.nextInt();
    	return num;
    }
    
    public static void main(String[] args) {
		RecipeMenu rm=new RecipeMenu();
		int num=rm.main_menu();
		int rnum=rm.menu(num);
		
	}
    
}
