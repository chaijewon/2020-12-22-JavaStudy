package com.sist.main;
import java.util.*;
import static java.util.Collections.*;
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list=new ArrayList();
        System.out.println(list);
        
        addAll(list,1,2,3,4,5);
        System.out.println(list);
        
        rotate(list, 2);
        System.out.println(list);
        
        swap(list,0,2);
        System.out.println(list);
        
        shuffle(list);
        System.out.println(list);
        
        sort(list);
        System.out.println(list);
        
        System.out.println(max(list));
        System.out.println(min(list));
        
        
	}

}
