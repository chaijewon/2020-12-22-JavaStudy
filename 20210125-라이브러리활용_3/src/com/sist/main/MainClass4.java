package com.sist.main;

import java.text.MessageFormat;

public class MainClass4 {
  public static void main(String[] args) {
	 String msg=" 이름:{0}\n 전화:{1}\n 나이:{2}\n 주소:{3}\n";
	 Object[] obj={"홍길동","010-1111-1111",30,"서울"};
	 String s=MessageFormat.format(msg, obj);
	 System.out.println(s);
  }
}
