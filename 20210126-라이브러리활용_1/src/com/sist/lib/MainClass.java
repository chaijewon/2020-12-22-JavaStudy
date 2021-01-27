package com.sist.lib;
/*
 *   java.util.*
 *   ============
 *    ���� : �� (Spring(�ڹ�,��Ʋ��) , ���(���̽�))
 *         ===
 *         �����ͺ��̽� (����Ŭ) : ���ڿ�,����,��¥ 
 *                            =====
 *                            String , int(Integer),double(Double) , Date(Calendar)
 *    1. StringTokenizer : split(�迭) => ������(�м�)
 *       = hasMoreTokens() : boolean
 *       = nextToken() : ���� �����͸� ������ �´� : String
 *       = counterTokens() : ���� : int
 *       = �����ͺ��̽� , ��Ʈ��ũ 
 *    2. Date : �ý����� �ð��� �д´� , ��¥ ���� : Calendar (�޷�:����ǥ , ����)
 *    3. ��ȯ (java.text.*)
 *       SimpleDateFormat : ��¥�� ��ȯ�ؼ� ��� 
 *                          �⵵ : yyyy (yy)
 *                          �� : MM(M)  => 1,01~07,08,09 => M:12 MM:12 (0=>8����)
 *                          �� : dd(d)
 *                          �ð�: hh(h) 
 *                          �� : mm(m)
 *                          �� : ss(s)
 *       ChoiceFormat
 *       MassageFormat
 */
import java.util.*;
import java.text.*; // ��ȯ(Format)
class A
{
	int aa=10;
	public void display()
	{
		System.out.println("A:display Call...");
	}
}
// TO_CHAR('12345678','L99,999,999') => 12,345,678
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. �ý����� �ð� �б� 
		Date date=new Date();
		// 2. ��¥�� ��ȯ 
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-M-d");
		String today=sdf.format(date);
		// 3. ����
		System.out.println(today);
		// 4. �и� 
		StringTokenizer st=new StringTokenizer(today,"-");
		String strYear=st.nextToken();
		String strMonth=st.nextToken();
		String strDay=st.nextToken();
		
		//strMonth="08";
		System.out.println("�⵵:"+strYear);
		System.out.println("��:"+strMonth);
		System.out.println("��:"+strDay);
		
		// 5. ���������� ��ȯ 
		int year=Integer.parseInt(strYear);
		int month=Integer.parseInt(strMonth);
		int day=Integer.parseInt(strDay);
		System.out.println("========������ ��ȯ�� ���========");
		System.out.println("�⵵:"+year);
		System.out.println("��:"+month);
		System.out.println("��:"+day);
		
		/*String today2=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
		System.out.println(today2);
		
		A a=new A();
		a.display();
		a.aa=100;
		
		new A().display();
		new A().aa=200;*/
	}

}











