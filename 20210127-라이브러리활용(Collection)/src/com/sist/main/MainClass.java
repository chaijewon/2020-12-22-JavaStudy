package com.sist.main;
/*
 *    컬렉션 (Collection) : 데이터를 저장하는 표준화된 클래스
 *    ==================
 *      = CURD (Create,Update,Read,Delete)
 *      = 데이터 읽기 , 데이터 수정 , 데이터 추가 , 데이터 삭제 
 *      = 표준화 
 *      = 배열(고정) => 가변 
 *    1. 종류 
 *       List : 순서가 있다(인덱스번호=> 일괄적으로 생성) , 데이터가 중복적으로 저장 => 데이터베이스(오라클)
 *       Set  : 순서가 없다(인덱스가 존재하지 않는다) , 데이터 중복을 허용하지 않는다 => 사용빈도가 별로 없다 
 *       Map  : 순서가 없다 , 키와 값  => 키는 중복허용(X), 데이터는 중복(O)
 *       ====
 *       웹프로그램 : session,cookie,request,response
 *       
 *       List : 인터페이스 (미완성된 클래스) => 구현하고 있는 클래스를 이용한다 (표준화,서로다른 클래스 연결)
 *        구현한 클래스
 *        ==========
 *        배열 대신 사용을 한다 
 *        =========================================
 *        1) ArrayList : 비동기화 (데이터베이스) *** 
 *        2) Vector  : 동기화 (네트워크) 
 *        3) LinkedList : C언어 호환 => 속도가 빠르다 
 *        =========================================
 *          공통적으로 사용 
 *          1. 데이터 저장(추가) : add() ==========> INSERT
 *          2. 데이터 삭제      : remove() =======> DELETE
 *          3. 데이터 수정      : set()    =======> UPDATE
 *          4. 데이터 읽기      : get()    =======> SELECT      JOIN , SUBQUERY
 *          5. 저장된 데이터 갯수 : size()
 *        =========================================
 *        4) Stack : LIFO , Queue : FIFO
 *           ============   ============
 *           주차장           버스,네트워크,운영체제
 *           
 *        10/0
 *        a[3]=10
 *        // VARCHAR2 VARCHAR 
 *        6<5  false , 0  if(true) if(1) while(1)
 *        ArrayList
 *        ==========
 *        1. 생성하는 방법 
 *           ArrayList list=new ArrayList();
 *           =========          ===========
 *           Vector              Vector()
 *           LinkedList          LinkedList()
 *        2. 데이터 저장 
 *           = 맨뒤에 추가 list.add(데이터); 
 *                               ====== Object    public void add(Object obj)
 *                               1
 *                               2
 *           = 원하는 위치에 추가 list.add(int index,Object obj)
 *                               1
 *                               2 =  => 1,3,2
 *                                    
 *        3. 데이터 읽기   list.get(int index)      public Object get(int index)
 *                      예) list.get(1)           => int no=(int)list.get(i)
 *        4. 데이터 갯수 확인 
 *                      list.size()              public int size()
 *        5. 데이터 수정 
 *                      list.set(int index,Object obj)  public Object set(int index,Object obj)
 *                          0 1
 *                          1 1
 *                          2 1 => 5
 *                          3 1
 *                          4 1
 *                          5 2
 *        6. 데이터 삭제 => 한개,전체 
 *                      list.remove(int index)    public boolean remove(int index)
 *                      list.removeAll() , list.clear()
 *                      
 *                      'A'
 *                      10.5
 *                      10
 *                      10.7F
 *                      true
 *                      ""
 *                      ""
 *                      'B'
 *                      10
 *                      false
 */
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 이름을 저장 (여러개) String[] names=new String[10];
		// 저장할 메모리 공간 생성 
		ArrayList nameList=new ArrayList();//경고  ==> 저장 (Object)
		//Vector nameList=new Vector();
		//LinkedList nameList=new LinkedList();
		//Stack nameList=new Stack();
		// 저장 
		nameList.add("홍길동"); // 0 => Object o="홍길동"; Object o=new Object() => Object
		nameList.add("심청이"); // 1       Object o=new String(""); => String
		nameList.add("이순신"); // 2
		nameList.add("강감찬"); // 3
		nameList.add("박문수"); // 4
		nameList.add(10);
		
		/*
		 *    public void display(double d)
		 *    {
		 *           65.0
		 *    }
		 *    
		 *    display('A');  
		 *    
		 *    double d='A';   => 65.0
		 *    
		 *    public void add(Object o)
		 *    {
		 *    }
		 *    
		 *    add("aaa")
		 */
		Object o="AAAAA"; // "주소"  new
		Object o1=new Object();
		System.out.println(o);
		System.out.println(o1);
		/*
		 *    class A
		 *    class B extends A
		 *    A a=new B();
		 */
		System.out.println("====== ArrayList에 저장된 데이터 =======");
		// Object name=new String();
		// Object name="홍길동"; ==> "홍길동" => new String("홍길동")
		for(int i=0;i<nameList.size();i++)
		{
			Object obj=nameList.get(i);
			System.out.println(i+":"+obj);
		}
		
		System.out.println("현재 저장된 이름:"+nameList.size());
		
		// 원하는 위치 데이터를 출력 
		nameList.add(2, "을지문덕");
		/*
		 *    홍길동   0
              심청이   1
              을지문덕 2
              이순신   3
              강감찬   4
              박문수   5
                
		 */
		for(int i=0;i<nameList.size();i++)
		{
			Object obj=nameList.get(i);
			System.out.println(i+":"+obj);
		}
		
		System.out.println("======== 수정 ==========");
		nameList.set(3, "춘향이");
		
		for(int i=0;i<nameList.size();i++)
		{
			Object obj=nameList.get(i);
			System.out.println(i+":"+obj);
		}
	
		System.out.println("======== 삭제 ==========");
		nameList.remove(2);
		/*
		 *    홍길동   0
              심청이   1
              이순신   2
              강감찬   3
              박문수   4
                
		 */
		for(int i=0;i<nameList.size();i++)
		{
			Object obj=nameList.get(i);
			System.out.println(i+":"+obj);
		}
		
		System.out.println("======= 전체 삭제 ========");
		nameList.clear();
		System.out.println("저장된 이름:"+nameList.size());
	}

}



















