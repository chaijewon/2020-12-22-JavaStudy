package com.sist.main;
import java.util.*;
import java.io.*;
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try 
        {
			Properties prop=new Properties();
			prop.load(new FileInputStream("C:\\Users\\SIST\\git\\javaStudy\\20210127-라이브러리활용(Collection)\\src\\com\\sist\\main\\db.properies"));
			String driver=prop.getProperty("driver");
			String url=prop.getProperty("url");
			String username=prop.getProperty("username");
			String password=prop.getProperty("password");
			System.out.println(driver);
			System.out.println(url);
			System.out.println(username);
			System.out.println(password);
		}catch(Exception ex) {} 
	}

}
