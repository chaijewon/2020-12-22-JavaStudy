package com.sist.io;
// File정보 
import java.io.*;
import java.text.SimpleDateFormat;
/*
 *     자바파일 구조 
 *     ==========
 *     
 *     package package명 : 반드시 한번만 사용이 가능 
 *     import  : 여러개를 사용 할 수 있다 
 *     public class clasName{
 *       ===================
 *         [변수 (멤버변수,공유변수)]
 *       ===================
 *         [생성자] => 필요하지 않는 경우 (네트워크연결 , 윈도우배치, 오라클 연결)
 *                    default생성자를 첨부(컴파일러가 첨부)
 *       ===================
 *         [메소드]
 *       ===================
 *         [main 메소드]
 *       ===================
 *     
 *     }
 */
// 파일에 대한 정보 확인
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File file=new File("c:\\javaDev\\daum_movie.txt");
        System.out.println("====== daum_movie.txt 상세 정보 ========");
        // Bytes => KB => MB
        //      /1024    /1024
        System.out.println("***1. 파일 크기:"+file.length()+"Bytes");
        System.out.println("2. 숨김파일여부:"+file.isHidden());
        System.out.println("3. 읽기전용:"+file.canRead());
        System.out.println("4. 쓰기전용:"+file.canWrite());
        // 읽기,쓰기가 가능
        System.out.println("***5. 파일명:"+file.getName());
        System.out.println("6. 경로명:"+file.getParent());
        System.out.println("***7. 파일명+경로명:"+file.getPath());
        System.out.println("8. 파일여부:"+file.isFile());
        /*
         *    Date date=new Date(file.lastModified(());
         *    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
         *    String day=sdf.format(date)
         *    new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified(()))
         *    
         *    int a=10
         */
        System.out.println("9. 수정일:"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
        		          .format(new Date(file.lastModified())));// 출력용
        File create_file=new File("c:\\javaDev\\never_movie.txt");
        try
        {
           System.out.println("***10. 새로운 파일 생성:"+create_file.createNewFile());
           System.out.println("***11. 파일 삭제:"+create_file.delete());
        }catch(Exception ex) {}
	}

}











