package com.sist.string;
// ���ڿ� ���� : concat(),+
import java.util.Scanner;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("�� �Է�:");
        String first=scan.next();
        System.out.print("�̸� �Է�:");
        String second=scan.next();
        // ���ڿ� ����
        String name=first.concat(second);
        System.out.println("�̸�:"+name);
        System.out.println("�̸�:"+first+second);
        
	}

}
