package com.sist.string;
/*
 *   ������Ʈ�� ���� ��� : �˻��� 
 *   startsWith : �����ϴ� ���ڿ��� ���� ��� true
 *   ������ : boolean
 *   �Ű����� : �����ϴ� ���ڿ� String
 *   ���� : public boolean startsWith(String str)
 *   
 *   endsWith : ������ ���ڿ� ���� ��� true
 *   ������ : boolean
 *   �Ű����� : �� ���ڿ� String
 *   ���� : public boolean endsWith(String str)
 *   
 *   contains : ���ڿ��� ������ �� ��� : true
 *   ������ : boolean 
 *   �Ű����� : ���Ե� �ܾ� String
 *   ���� : public boolean constains(String str)
 */
import java.util.Scanner;
public class MainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] menu={
			"�ڹٿ� ����Ŭ",
			"�ڹ����α׷���",
			"ȥ�� ���� �ڹ�",
			"�ڹ� 200��",
			"����Ŭ�� Ajax",
			"Jquery and �ڹ�",
			"HTML5 & CSS3",
			"�ڹٿ� ���̽� ����",
			"������5�� ���̽�",
			"�ڹ� ����"
		};
		
		Scanner scan=new Scanner(System.in);
		//System.out.print("�˻��� �Է�:");
		//String find_data=scan.next();
		String find_data="  �ڹ�";
		// �˻�� ���Ե� �����͸� �����ش� 
		for(String s:menu)
		{
			if(s.startsWith(find_data.trim())) // LIKE '�ڹ�%'
			//if(s.endsWith(find_data)) // LIKE '%�ڹ�'
			//if(s.contains(find_data)) // LIKE '%�ڹ�%'
			{
				System.out.println(s);
				try
				{
					Thread.sleep(300);
				}catch(Exception ex){}
			}
		}

	}

}











