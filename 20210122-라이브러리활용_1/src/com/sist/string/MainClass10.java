package com.sist.string;
/*
 *   Object
 *    = toString()
 *    = clone()
 *    = equals()
 *   String
 *    = length()
 *    = equals() , equalsIgnoreCase()
 *    = startsWith(),endsWith(),contains()
 *    = substring() , indexOf(),lastIndexOf()
 *    = trim(), valueOf()
 *    = split()
 *    ========================================
 *    replace,replaceAll,charAt()
 *    
 *    https://www.google.com/search?q=%EC%9E%90%EB%B0%94&rlz=1C1CHBD_koKR933KR933&oq=%EC%9E%90%EB%B0%94&aqs=chrome..69i57j69i59l3j35i39l2j0i395i433l2.11605j1j15&sourceid=chrome&ie=UTF-8
      %EC%9E%90%EB%B0%94 => 자바
 */
public class MainClass10 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//byte[] s="안녕하세요".getBytes();
        //String str=new String(s,"UTF-8");
        //System.out.println(str);
		// String.format()
		// StringJoiner
		String color="red,blue,green";
		String[] colors=color.split(",");
		String str=String.join("-", colors);
		System.out.println(str);
		
		//String s=String.format("%d * %d = %d", 10,20,10+20);
		//System.out.println(s);
		int year=2021;
		int month=1;
		int day=22;
		String s=year+"년도 "+month+"월 "+day+"일";
		System.out.println(s);
		String s2=String.format("%d년도 %d월 %d일", year,month,day);
		System.out.println(s2);
	}

}








