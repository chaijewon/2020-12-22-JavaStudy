package com.sist.main;
import java.lang.reflect.Method;
import java.util.*;
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("페이지 선택:");
        String page=scan.next();
        /*MovieManger m=new MovieManger();
        if(page.equals("홈"))
        {
        	m.movieHome();
        }
        else if(page.equals("목록"))
        {
        	m.movieList();
        }
        else if(page.equals("상세"))
        {
        	m.movieDetail();
        }
        else if(page.equals("예매"))
        {
        	m.movieReserve();
        }*/
        try
        {
        	Class clsName=Class.forName("com.sist.main.MovieManger");
			Object obj=clsName.getDeclaredConstructor().newInstance();
        	Method[] methods=clsName.getDeclaredMethods();
        	for(Method m:methods)
        	{
        		RequestMapping rm=m.getAnnotation(RequestMapping.class);
        		if(rm.value().equals(page))
        		{
        			m.invoke(obj, null);
        			break;
        		}
        	}
        }catch(Exception ex) {ex.printStackTrace();}
	}

}
