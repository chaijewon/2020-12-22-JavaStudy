package com.sist.main;
// �ٸ� ��Ű���� �ִ� Ŭ���� �б� => �ڹٿ� �����ϴ� ���̺귯�� , ����� ���� 
import com.sist.manager.*;
/*
 *     public String[] aaa(){}
 *     
 *     => String[] a=aaa();
 *     
 *     int[] a={10,20,30}
 *     int[] b=a;
 *           {10,20,30}
 *     
 *     int a=10;
 *     int b=a;
 *     
 *     A a=new A();
 *     A b=a;
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MovieManager m=new MovieManager();
        MovieVO[] movie=m.movieAllData();
        System.out.println("MainClass:"+movie);
        // ���
        System.out.println("========== ��ȭ ��� ==========");
        for(MovieVO vo:movie) // For-Each
        {
        	//System.out.println("����:"+vo.getMno());
        	System.out.println("��ȭ��:"+vo.getTitle());
        	System.out.println("������:"+vo.getDirector());
        	System.out.println("�⿬:"+vo.getActor());
        	System.out.println("���:"+vo.getGrade());
        	System.out.println("�ٰŸ�:"+vo.getStory());
        	System.out.println("===============================================");
        }
	}

}
