package com.sist.string;



/*
 *   equals() : ���ڿ��� ������ Ȯ�� (��ҹ� ����)
 *    ������ : boolean
 *    �Ű����� : String 
 *    ���� : public boolean equals(String str)
 *   equalsIgnoreCase() : ���ڿ��� ������ Ȯ�� (��ҹ��� ������ ����)
 *    ������ : boolean
 *    �Ű����� : String 
 *    ���� : public boolean equalsIgnoreCase(String str)
 *    
 *    ### �ڹٿ����� ���ڿ�("") ��ü�� �ּ� 
 *    String s="Hello";
 *    s.equals("Hello")
 *    "Hello".equals(s)
 *    
 *    ### ���ڿ� ���� 
 *    String s="Hello"; => {'H','e','l','l','o'}
 *    String s=new String("Hello");
 *    
 *    => ã�� , �������̵� , ���� 
 */
public class MainClass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �����̸� String�� ���� �ּҸ� ������ �ִ� 
        String s1="Java";
        String s2="Java";
        String s3=new String("JAVA");// ���ο� �޸𸮿� ���� 
        
        if(s1==s2)
        	System.out.println("����");
        else
        	System.out.println("�ٸ���");
        
        if(s1==s3)
        	System.out.println("����");
        else
        	System.out.println("�ٸ���");
        
        // �ּҸ� ���ϴ� ���� �ƴ϶� => ���� ���� �� 
        
        if(s1.equals(s2))
        	System.out.println("���ڿ��� ����");
        else
        	System.out.println("�������� �ʴ´�");
        
        if(s1.equals(s3))
        	System.out.println("���ڿ��� ����");
        else
        	System.out.println("�������� �ʴ´�");
        
        // ��ҹ��� ���о��� ��
        
        if(s1.equalsIgnoreCase(s3))
        	System.out.println("���ڿ��� ����");
        else
        	System.out.println("�������� �ʴ´�");
	}

}
















