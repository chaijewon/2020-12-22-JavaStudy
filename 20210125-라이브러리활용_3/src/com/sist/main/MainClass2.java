package com.sist.main;
import java.util.*;
import java.text.*;

/*class A
{
	private static A a=null;
	public static A getInstance()
	{
		if(a==null)
			a=new A();
		return a;
	}
}*/
/*
 *    year/day 상관 없다 
 *    month => 0~11  ==> 저장할 때는 반드시 month-1
 *    week => DAY_OF_WEEK ==> 1~7 
 *    
 *    getActualMaximum() : 각달의 마지막 날짜를 읽어 온다
 *    set() : 날짜 설정
 *    get() : 설정된 날짜를 읽어 온다 
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance(); // 싱글턴 (static)
		/*
		 * A a=A.getInstance(); System.out.println("a="+a); A b=A.getInstance();
		 * System.out.println("b="+b); A c=A.getInstance(); System.out.println("c="+c);
		 */
		/*Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		System.out.print("월 입력:");
		int month=scan.nextInt();
		System.out.print("일 입력:");
		int day=scan.nextInt();
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);// 0~11 (1~12)
		cal.set(Calendar.DATE, day);
		
		int week=cal.get(Calendar.DAY_OF_WEEK); // 1~7
		int lastday=cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastday);
		String[] strWeek= {"","일","월","화","수","목","금","토"};
		
		String msg=String.format("%d년도 %d월 %d일 %s요일입니다",cal.get(Calendar.YEAR),
				 cal.get(Calendar.MONTH)+1,cal.get(Calendar.DATE),strWeek[week]);
		System.out.println(msg);*/
		Date date=new Date(); // 시스템의 날짜(시간) ==> 오라클 저장시에 사용
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));

	}

}







