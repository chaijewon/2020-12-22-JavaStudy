import java.util.*;
public class 달력만들기_메소드 {
    // 입력
	static int input(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 입력:");
		return scan.nextInt();
	}
	// 요일출력
	static void weekPrint()
	{
		String[] week={"일","월","화","수","목","금","토"};
		for(String s:week)
		{
			System.out.print(s+"\t");
		}
		System.out.println();
	}
	// 요일 구하기 
	static int weekData(int year,int month)
	{
		// 1. 전년도까지의 합 
				int total=(year-1)*365+(year-1)/4
						              -(year-1)/100
						              +(year-1)/400;
				// 2. 전달까지의 합
				/*
				 *    case 2:
				 *       total+=31 
				 *         3
				 *        total+=31+28
				 *          4
				 *          total+=31+28+31
				 */
				int[] lastday={31,28,31,30,31,30,
						       31,31,30,31,30,31};
				if((year%4==0 && year%100!=0)||(year%400==0))// 윤년 2월 => 29
					lastday[1]=29;
				else
					lastday[1]=28;
				
				for(int i=0;i<month-1;i++)
				{
					total+=lastday[i];
				}
				
				// 3. +1 
				total++; // 각달의 1일자 확인 
				int week=total%7;// 요일
				return week;
	}
	// 달력출력하기
	static void datePrint(int month,int week)
	{
		int[] lastday={31,28,31,30,31,30,
			           31,31,30,31,30,31};
		for(int i=1;i<=lastday[month-1];i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");  // 공백
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}
	}
	static void process()
	{
		int year=input("년도");
		int month=input("월");
		int week=weekData(year, month);
		weekPrint();
		datePrint(month, week);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
