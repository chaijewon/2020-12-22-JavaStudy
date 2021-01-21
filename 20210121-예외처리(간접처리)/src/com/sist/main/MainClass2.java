package com.sist.main;
/*
 *   예외 회피 : 시스템에서 처리 => throws
 *   형식)
 *        접근저정어 리턴형 메소드명(매개변수..) throws 예상되는 에러등록 ....
 *        
 *        예)
 *            public void display() throws NumberFormatException,NullPointerException,
 *                                  ClassCastException,Exception
 *                                  ================================ 순서가 없다
 *            => display() 호출시에 
 *                 = 회피
 *                 public void main() throws NumberFormatException,NullPointerException,
 *                                    ClassCastException,Exception
 *                 {
 *                    display();
 *                 }
 *                 
 *                 public void main() throws Exception
 *                 {
 *                    display()
 *                 }
 *                 
 *                 public void main() throws Throwable
 *                 {
 *                     display()
 *                 }
 *                 = 복구
 *                 public void main()
 *                 {
 *                      try
 *                      {
 *                         display()
 *                      }catch(Exception ex){}
 *                 }
 */
// 라이브러리 
import java.io.*;
public class MainClass2 {
    public void display() throws Exception,NumberFormatException,ArithmeticException,ArrayIndexOutOfBoundsException
    {
    	
    }
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        MainClass2 m=new MainClass2();
        FileReader fr=new FileReader("c:\\javaDev\\movie.json");
	}

}










