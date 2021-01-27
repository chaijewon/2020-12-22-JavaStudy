package com.sist.main;
import java.util.*;
class Diary
{
	public void myDate()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("�⵵ �Է�:");
		int year=scan.nextInt();
		System.out.print("�� �Է�:");
		int month=scan.nextInt();
		System.out.print("�� �Է�:");
		int day=scan.nextInt();
		
		// ���⵵ 
		int total=(year-1)*365
				  +(year-1)/4
				  -(year-1)/100
				  +(year-1)/400;
		int[] lastDay={31,28,31,30,31,30,
				       31,31,30,31,30,31};
		if((year%4==0 && year%100!=0)||(year%400==0))
			lastDay[1]=29;
		else
			lastDay[1]=28;
		// ����
		for(int i=0;i<month-1;i++)
		{
			total+=lastDay[i];
		}
		// +day
		total+=day;
		// %7
		int week=total%7;
		String[] strWeek= {"��","��","ȭ","��","��","��","��"};
		System.out.printf("%d�⵵ %d�� %d���� %s�����Դϴ�\n",year,month,day,strWeek[week]);
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Diary d=new Diary();
        d.myDate();
	}

}
