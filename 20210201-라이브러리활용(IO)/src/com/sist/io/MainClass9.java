package com.sist.io;
// BufferedReader : 네트워크 => 보조 스트림 
/*
 *    FileInputStream/FileOutputStream
 *    BufferedInputStream / BufferedOutputStream 
 *    
 *    FileReader / FileWriter
 *    BufferedReader
 *    
 *    ============================================
 *    
 */
import java.io.*;
public class MainClass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2753 => 33
        try
        {
        	/*// 파일 읽기 => duam_movie.txt
        	File file=new File("c:\\javaDev\\daum_movie.txt");
        	FileReader fr=new FileReader(file);
        	int i=0;
        	StringBuffer sb=new StringBuffer();// 읽은 데이터 저장 공간 
        	long start=System.currentTimeMillis();
        	//String data="";
        	while((i=fr.read())!=-1)
        	{
        		//data+=String.valueOf((char)i);
        		sb.append(String.valueOf((char)i));   ==> \n
        	}
        	System.out.println(sb.toString());
        	long end=System.currentTimeMillis();
        	System.out.println("걸린 시간:"+(end-start));*/
        	File file=new File("c:\\javaDev\\daum_movie.txt");
        	FileInputStream fis=new FileInputStream(file);
        	BufferedReader br=new BufferedReader(new InputStreamReader(fis));
        	//                      InputStream => Reader (1byte=>2byte)
        	long start=System.currentTimeMillis();
        	// 데이터 => 인코딩 ==> 실행 => 디코딩
        	while(true)
        	{
        		String str=br.readLine();
        		if(str==null) break;// 종료 => 데이터를 다 읽은 경우
        		System.out.println(str);
        	}
        	br.close();
        	long end=System.currentTimeMillis();
        	System.out.println("걸린 시간:"+(end-start));
        }catch(Exception ex){}
	}

}





