package com.sist.main;
import java.util.*;
import java.io.*;
public class MainClass5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        Properties prop=new Properties();
        prop.load(new FileInputStream("C:\\Users\\SIST\\git\\javaStudy\\20210127-라이브러리활용(Collection)\\src\\com\\sist\\main\\data.properties"));
	    for(Object obj:prop.keySet())
	    {
	    	//String st=prop.getProperty("student");
	    	//System.out.println(st);
	    	System.out.println(obj+":"+prop.getProperty((String)obj));
	    }
	}

}
