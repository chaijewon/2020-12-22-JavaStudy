package com.sist.exception;
// try~catch => 위치 선정을 잘해야 처리가 가능 
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr={10,20,30,20,0,10,20,30,40,50};
        int a=100;
        try
        {
        	for(int b:arr)
        	{
        		try
        		{
        		   System.out.println(a/b);
        		}catch(Exception e) {}
        	}
        }catch(Exception ex)
        {
        	ex.printStackTrace();
        }
        System.out.println("프로그램 종료!!");
	}

}
