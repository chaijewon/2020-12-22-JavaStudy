package com.sist.string;
/*
 *   ***trim() : �¿쿡 �ִ� ���鹮�� ���� (�¿쿡 �ִ� ��� ������ ����
 *            ��) " Hello Java ".trim() ==> "Hello Java"
 *            ���) �˻��� ,�α��� ó��, ���̵��ߺ� , �Խ��� ��й�ȣ
 *   ������ : String
 *   �Ű�����: ���� 
 *   ���� : public String trim()
 *   
 *   ***valueOf() : ��� ���������� ���ڿ��� ��ȯ�Ҷ� ��� : �����ε� 
 *               100 => "100"
 *               true => "true"
 *   ������ : String 
 *   �Ű����� : valueOf(char c)
 *            valueOf(int i)
 *            valueOf(long l)
 *            valueOf(float f)
 *            valueOf(double d)
 *            valueOf(boolean b)
 *            valueOf(Object o)
 *   ���� : public static String valueOf(��������)
 *                ======
 *   
 *   100 => int a=100;
 *          String s=(String)a; (X)
 *                   a.toString() (X)
 *                   String.valueOf(a);
 *                   
 *    String s="Hello Java";
 *    String s1="Oracle";
 *    substring(0,3)
 *    
 *    Web,Window => String
 *            
 */
public class MainClass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String msg="                  Hello Java ";
        System.out.println(msg);
        System.out.println(msg.length());
        
        String msg2=msg.trim();
        System.out.println(msg2);
        System.out.println(msg2.length());
        
        int a=100;
        int b=200;
        String s=String.valueOf(a); // s="100"
        String s1=String.valueOf(b);// s1="200"
        String s2=String.valueOf(true);// s2="true"
        String s3=String.valueOf(10.5);//s3="10.5"
        
	}

}








