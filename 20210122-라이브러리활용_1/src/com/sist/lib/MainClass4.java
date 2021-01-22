package com.sist.lib;
// equals => 객체가 가지고 있는 값만 비교
// == 주소값을 비교(배열,클래스) 일반데이터는 값을 비교
/*
 *     int a=(int)(Math.random()*100)+1 => 1~100
 *                double 
 *                int
 */
class B
{
	String name;
	//String addr;
	public B(String name)
	{
		this.name=name;
	}
	/*@Override
	public boolean equals(Object obj) { 
		if(obj instanceof B)
			return name.equals(((B)obj).name);
		else
			return false;
	}*/
	
	
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B b1=new B("홍길동");
        B b2=new B("홍길동");
        B b3=b1;
        
        if(b1.name.equals(b2.name))
        	System.out.println("b1과 b2는 주소값이 같다");
        else
        	System.out.println("b1과 b2는 주소값이 다르다");
        
        if(b1==b3)
        	System.out.println("b1과 b3는 주소값이 같다");
        else
        	System.out.println("b1과 b3는 주소값이 다르다");
        	
	}

}
