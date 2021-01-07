/*
 *    자바 => 알고리즘 (순서) => 라이브러리 => 조립
 *           ============
 *           => 제어문
 *    ======================================
 *    재사용기법 (변경,추가) , 데이터 보호(캡슐화)
 *    ======================================
 *    비정상 종료를 방지하는 프로그램(예외처리)
 *    ======================================
 *    
 *    1. 사용자가 년도/월 입력
 *    2. 처리 => 달력 출력 
 *       2-1. 매월 1일자의 요일확인  
 *       2-2. 달력을 출력 
 */
import java.util.Scanner;
public class 달력만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. 사용자 입력을 받는다 
		Scanner scan=new Scanner(System.in); //System.in => 키워드 입력값을 읽어오는 기능
		// 년도 입력 
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		System.out.print("월 입력:");
		int month=scan.nextInt();
		// 사용자 요청한 년/월에 대한 달력 
		// 출력 
		System.out.println(year+"년도 "+month+"월");
		System.out.println("\n");
		/*System.out.print("일\t");
		System.out.print("월\t");
		System.out.print("화\t");
		System.out.print("수\t");
		System.out.print("목\t");
		System.out.print("금\t");
		System.out.print("토\t");*/
		String[] strWeek={"일","월","화","수","목","금","토"};
		for(String s:strWeek)
		{
			System.out.print(s+"\t");
		}
		System.out.println();// 다음줄에 출력
		/*
		 *    2021.1 
		 *    
		 *    => 1년 1월 1일 ~ 2020.12.31 
		 *       ======================= + 1 (총날수 %7)
		 */
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

}












