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
 *    year/day ��� ���� 
 *    month => 0~11  ==> ������ ���� �ݵ�� month-1
 *    week => DAY_OF_WEEK ==> 1~7 
 *    
 *    getActualMaximum() : ������ ������ ��¥�� �о� �´�
 *    set() : ��¥ ����
 *    get() : ������ ��¥�� �о� �´� 
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance(); // �̱��� (static)
		/*
		 * A a=A.getInstance(); System.out.println("a="+a); A b=A.getInstance();
		 * System.out.println("b="+b); A c=A.getInstance(); System.out.println("c="+c);
		 */
		/*Scanner scan=new Scanner(System.in);
		System.out.print("�⵵ �Է�:");
		int year=scan.nextInt();
		System.out.print("�� �Է�:");
		int month=scan.nextInt();
		System.out.print("�� �Է�:");
		int day=scan.nextInt();
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);// 0~11 (1~12)
		cal.set(Calendar.DATE, day);
		
		int week=cal.get(Calendar.DAY_OF_WEEK); // 1~7
		int lastday=cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastday);
		String[] strWeek= {"","��","��","ȭ","��","��","��","��"};
		
		String msg=String.format("%d�⵵ %d�� %d�� %s�����Դϴ�",cal.get(Calendar.YEAR),
				 cal.get(Calendar.MONTH)+1,cal.get(Calendar.DATE),strWeek[week]);
		System.out.println(msg);*/
		Date date=new Date(); // �ý����� ��¥(�ð�) ==> ����Ŭ ����ÿ� ���
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));

	}

}







