package com.sist.movie;
import java.util.Scanner;
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        // ��ȭ������ �� �������� �Է��Ͻÿ� 
        int totalpage=MovieManager.movieTotalPage();
        
        int page=1;
        // �������� �������� �ԷµǾ����� ����üũ 
        while(true)
        {
        	System.out.print("��ȭ ����� �� ������ ����(1~"+totalpage+"):");
        	page=scan.nextInt();
        	if(page<1 || page>totalpage)
        	{
        		System.out.println("�������� �ʴ� ������ �Դϴ�!!");
        		continue;
        	}
        	break;
        }
        System.out.println("===========���� ���� �ִ� �������� "+page+"������ �Դϴ�=============");
        
	}

}
