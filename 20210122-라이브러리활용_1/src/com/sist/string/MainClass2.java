package com.sist.string;
/*
 *    1. String 메소드 
 *       = int length()
 *       = char charAt(int no)
 */
import java.util.Scanner;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*Scanner scan=new Scanner(System.in);
        System.out.print("문자열 입력:");
        String msg=scan.next(); // 문자열  => 정수 nextInt() , 문자열 => next()
        System.out.println("msg="+msg);
        System.out.println("문자 갯수:"+msg.length());*/
        
        // 문자열이 좌우 대칭인지? => Google  => 이미지를 뒤집어서 출력 
		Scanner scan=new Scanner(System.in);
        //System.out.print("문자열 입력:");
        /*String msg=scan.next();
        for(int i=msg.length()-1;i>=0;i--) 
        {
            System.out.print(msg.charAt(i));	
        }*/
        String msg="";
		while(true)
		{
			System.out.print("문자열 입력:");
			msg=scan.next();
			if(msg.length()%2!=0)
			{
				System.out.println("짝수개의 문자가 필요합니다");
				// while처음으로 이동
				continue;
			}
			break;// while종료 
		}
		// 변수 => 사용범위 => {} 
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
		
		// 결과값
		if(bCheck==true)
			System.out.println("좌우 대칭입니다");
		else
			System.out.println("좌우 대칭이 아닙니다");
		
        // if의 사용 목적 => 오류 처리
		// 오류방지 => 시스템 (try~catch), 프로그램(if)
	}

}









