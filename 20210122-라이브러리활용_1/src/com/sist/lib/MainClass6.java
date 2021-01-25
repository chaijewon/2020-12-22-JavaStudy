package com.sist.lib;
import java.util.*;
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calendar cal=Calendar.getInstance();
		/*
		 * cal.add(Calendar.YEAR, 2021); cal.add(Calendar.MONTH, 1);
		 * cal.add(Calendar.DATE, 25);
		 */
        int year=cal.get(Calendar.YEAR);
        int month=cal.get(Calendar.MONTH)+1; // 0~11
        int day=cal.get(Calendar.DATE);
        int week=cal.get(Calendar.DAY_OF_WEEK)-1; // 1~7
        System.out.println("Year:"+year);
        System.out.println("Month:"+month);
        System.out.println("Day:"+day);
        System.out.println("Week:"+week);
        String[] strWeek={"일","월","화","수","목","금","토"};
        System.out.println(strWeek[week]);
	}

}
