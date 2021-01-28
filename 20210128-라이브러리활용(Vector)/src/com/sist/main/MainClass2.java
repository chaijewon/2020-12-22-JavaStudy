package com.sist.main;
import java.util.*;
/*
 *   T => Type     ArrayList<Integer>
 *   E => Element  Vector<String>
 *   K => Key      Map<String,Integer>
 *   V => Value
 *   
 *   1 , "" , 10.6 , new A() , 10 , new B() , "" , 3
 *   1,2,3,4,5,6
 *   
 *   1,1,1,2,3,1,4,1,6,7,8,9
 *   1,2,3,4,5,6 => 수열 
 *   
 *   MovieVO , NewsVO ,NewsVO,MovieVO , NewsVO,MovieVO => 프로그램 (데이터 모아서 관리)
 *                                                                ==========
 *                                                                같은 것끼리 => 관련된 것
 *   
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *   CURD
		 *   C => Create => add()  => INSERT
		 *   U => Update => set()  => UPDATE
		 *   R => Read   => get()  => SELECT
		 *   D => Delete => remove()=> DELETE
		 */
        Vector vec=new Vector();
        // 추가 => Object
        // 영화 장르 
        vec.add("액션");
        vec.add("드라마");
        vec.add("멜로");
        vec.add("코미디");
        vec.add("판타지");
        vec.add("SF");
        vec.add("애니메이션");
        vec.add("멜로");
        vec.add("코미디");
        vec.add("판타지");
        // 중복 ======> DISTINCT
        HashSet set=new HashSet();
        for(int i=0;i<vec.size();i++)
        {
        	String genre=(String)vec.get(i);
        	set.add(genre);
        }
        
        System.out.println(set);
        /*System.out.println("======= 저장된 장르 ========");
        System.out.println("장르:"+vec.size());
        // 출력
        for(int i=0;i<vec.size();i++)
        {
        	//String genre=(String)vec.elementAt(i);
        	String genre=(String)vec.get(i);
        	System.out.println(genre);
        }
        // 수정 
        System.out.println("======= 데이터 수정 ========");
        vec.setElementAt("공포", 9);// vec.set()
        for(int i=0;i<vec.size();i++)
        {
        	//String genre=(String)vec.elementAt(i);
        	String genre=(String)vec.get(i);
        	System.out.println(genre);
        }
        
        System.out.println("======= 데이터 삭제 =======");
        vec.removeElementAt(8);
        for(int i=0;i<vec.size();i++)
        {
        	//String genre=(String)vec.elementAt(i);
        	String genre=(String)vec.get(i);
        	System.out.println(genre);
        }
        
        System.out.println("======= 전체 삭제 ========");
        vec.removeAllElements();// vec.clear()
        System.out.println("갯수:"+vec.size());*/
	}

}



























