// ÇÐÁ¡À» °è»ê ¸Þ¼Òµå ¸¸µé±â 
// replaceAll("[^°¡-ÆR]","")
//  [^0-9] [^A-Za-z]
import java.util.Scanner;
public class ¸Þ¼ÒµåÈ°¿ë_2 {
	// ¹Ýº¹À» Á¦°Å 
    static int input(String subject)
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print(subject+" Á¡¼ö ÀÔ·Â:");
    	return scan.nextInt();
    }
    // ÇÐÁ¡À» ±¸ÇÏ´Â ¸Þ¼Òµå (´ÙÀ½ ´Ù½Ã »ç¿ë) : Àç»ç¿ë 
    static char hakjum(int avg)
    {
    	char score='A';
    	switch(avg)
        {
        case 10:
        case 9:
        	score='A';
        	break;
        case 8:
        	score='B';
        	break;
        case 7:
        	score='C';
        	break;
        case 6:
        	score='D';
        	break;
        default:
        	score='F';
        }
    	return score;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int kor,eng,math;
        char score='A';
        // »ç¿ëÀÚ°¡ ÀÔ·Â 
        /*Scanner scan=new Scanner(System.in);
        System.out.print("±¹¾î Á¡¼ö ÀÔ·Â:");
        kor=scan.nextInt();
        System.out.print("¿µ¾î Á¡¼ö ÀÔ·Â:");
        eng=scan.nextInt();
        System.out.print("¼öÇÐ Á¡¼ö ÀÔ·Â:");
        math=scan.nextInt();*/
        kor=input("±¹¾î");
        eng=input("¿µ¾î");
        math=input("¼öÇÐ");
        
        // ÇÐÁ¡ 
        int avg=(kor+eng+math)/30;
        score=hakjum(avg);// ¸Þ¼Òµå´Â È£Ãâ => ¸Þ¼Òµå Ã³À½ºÎÅÍ ½ÇÇà => °á°ú°ªÀ» ³Ñ°ÜÁÖ°í ´ÙÀ½¹®ÀåÀ¸·Î ÀÌµ¿
        /*switch(avg)
        {
        case 10:
        case 9:
        	score='A';
        	break;
        case 8:
        	score='B';
        	break;
        case 7:
        	score='C';
        	break;
        case 6:
        	score='D';
        	break;
        default:
        	score='F';
        }*/
        
        System.out.println("±¹¾î:"+kor);
        System.out.println("¿µ¾î:"+eng);
        System.out.println("¼öÇÐ:"+math);
        System.out.println("ÃÑÁ¡:"+(kor+eng+math));
        System.out.printf("Æò±Õ:%.2f\n",(kor+eng+math)/3.0);
        System.out.println("ÇÐÁ¡:"+score);
	}
    
}










