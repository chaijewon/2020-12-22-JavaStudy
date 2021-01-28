package com.sist.main;
import java.util.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list=new ArrayList();
        list.add("홍길동");
        list.add("심청이");
        list.add("홍길동");
        list.add("춘향이");
        list.add("홍길동");
        list.add("김두한");
        
        Set set=new HashSet();
        for(int i=0;i<list.size();i++)
        {
        	String name=(String)list.get(i);
        	set.add(name);
        }
        
        System.out.println(set);
        
        ArrayList list2=new ArrayList();
        Iterator it=set.iterator();
        while(it.hasNext())
        {
        	String name=(String)it.next();
        	list2.add(name);
        }
        
        System.out.println(list2);
	}

}
