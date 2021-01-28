package com.sist.main;
/*
 *   Map , Properties 
 *   ================
 *   Map => 두가지 저장 (key,value) : 클래스를 저장 , SQL문장 저장 , 웹과 관련된 클래스
 *   ===
 *    1. 저장 => put() 
 *    2. 읽기 => get(key) => value을 얻어 온다 
 *    
 *   java.util.*
 *   Map => interface
 *   === HashMap 
 */
import java.util.*;
public class MainClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        HashMap map=new HashMap();
        map.put("id", "admin");
        map.put("pwd", "1234");
        map.put("name", "홍길동");
        map.put("sex", "남자");  // 키(중복할 수 없다) , 값(중복할 수 있다)
        map.put("sex", "여자");
        
       // 값을 읽어 온다
       System.out.println("ID:"+map.get("id"));
       System.out.println("Password:"+map.get("pwd"));
       System.out.println("Name:"+map.get("name"));
       System.out.println("Sex:"+map.get("sex"));
       
       
	}

}














