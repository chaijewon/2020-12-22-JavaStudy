package com.sist.main;
import java.util.*;
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list=new ArrayList();
        list.add(10);
        list.add(1);
        list.add(7);
        list.add(9);
        list.add(5);
        list.add(10);
        list.add(7);
        Collections.sort(list);
        for(Object o:list)
        {
        	System.out.println(o);
        }
        
        ArrayList list1=new ArrayList();
        list1.add(10);
        list1.add(2);
        list1.add(7);
        list1.add(8);
        list1.add(5);
        
        boolean bCheck=list.containsAll(list1);
        System.out.println(bCheck);
        
        ArrayList list2=new ArrayList();
        for(Object o:list)
        {
        	if(list.contains(o))
        	{
        		list2.add(o);
        	}
        }
        
        for(Object o:list2)
        {
        	System.out.println(o);
        }
	}

}
