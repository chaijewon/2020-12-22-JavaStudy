package com.sist.main;
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap map=new HashMap();
        // mybatis
        map.put("movieAllData", "SELECT * FROM movie");
        map.put("movieDetailData", "SELECT * FROM movie WHERE mno=1");
        map.put("movieDelete", "DELETE FROM movie WHERE mno=1");
        
        System.out.println(map.get("movieAllData"));
        System.out.println(map.get("movieDelete"));
        
	}

}
