import java.util.Scanner;
public class 배열문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course[]={"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int jumsu[]={95, 88, 76, 62, 55};
		Scanner scan=new Scanner(System.in);
		
		int index=0;
		while(true)
		{
			boolean bCheck=false;
			System.out.print("과목 이름:");
			String subject=scan.next();
			if(subject.equals("그만"))
			{
				break;
			}
			for(int i=0;i<course.length;i++)
			{
				if(subject.equals(course[i]))
				{
					bCheck=true;
					System.out.println(subject+"의 점수는 "+jumsu[i]);
					break;
				}
				
			}
			
		    if(bCheck==false)
		    {
		    	System.out.println("없는 과목입니다.");
		    }
		    
		    
		}

	}

}
