package com.sist.main;

import java.text.MessageFormat;

public class MainClass4 {
  public static void main(String[] args) {
	 String msg=" �̸�:{0}\n ��ȭ:{1}\n ����:{2}\n �ּ�:{3}\n";
	 Object[] obj={"ȫ�浿","010-1111-1111",30,"����"};
	 String s=MessageFormat.format(msg, obj);
	 System.out.println(s);
  }
}
