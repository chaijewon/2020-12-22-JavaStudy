package com.sist.string;
/*
 *    1. String �޼ҵ� 
 *       = int length()
 *       = char charAt(int no)
 */
import java.util.Scanner;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*Scanner scan=new Scanner(System.in);
        System.out.print("���ڿ� �Է�:");
        String msg=scan.next(); // ���ڿ�  => ���� nextInt() , ���ڿ� => next()
        System.out.println("msg="+msg);
        System.out.println("���� ����:"+msg.length());*/
        
        // ���ڿ��� �¿� ��Ī����? => Google  => �̹����� ����� ��� 
		Scanner scan=new Scanner(System.in);
        //System.out.print("���ڿ� �Է�:");
        /*String msg=scan.next();
        for(int i=msg.length()-1;i>=0;i--) 
        {
            System.out.print(msg.charAt(i));	
        }*/
        String msg="";
		while(true)
		{
			System.out.print("���ڿ� �Է�:");
			msg=scan.next();
			if(msg.length()%2!=0)
			{
				System.out.println("¦������ ���ڰ� �ʿ��մϴ�");
				// whileó������ �̵�
				continue;
			}
			break;// while���� 
		}
		// ���� => ������ => {} 
		// ABCCBA
		/*
		 *   012
		 *   543
		 */
		boolean bCheck=true;
		for(int i=0;i<msg.length()/2;i++)
		{
			// ABC CCA
		   char s=msg.charAt(i);
		   char e=msg.charAt(msg.length()-1-i);
		   if(s!=e)
		   {
			   bCheck=false;
			   break;
		   }
		}
		
		// �����
		if(bCheck==true)
			System.out.println("�¿� ��Ī�Դϴ�");
		else
			System.out.println("�¿� ��Ī�� �ƴմϴ�");
		
        // if�� ��� ���� => ���� ó��
		// �������� => �ý��� (try~catch), ���α׷�(if)
	}

}









