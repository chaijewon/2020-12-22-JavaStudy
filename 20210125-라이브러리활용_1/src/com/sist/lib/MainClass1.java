package com.sist.lib;
/*
 *   java.lang.* => 프로그램마다 사용할 수 있는 클래스의 집합
 *   =========== 
 *   1) 특징 
 *      = import를 생략할 수 있다 
 *   2) 자바에서 지원하는 클래스 
 *      = Object
 *        = toString() 문자열 변환 (객체) => 객체의 주소값 출력
 *        = equals() 객체와 객체를 비교 
 *        = finalize() : 소멸자 (메모리 해제 자동 호출) => System.gc()
 *        = clone() : 복제 
 *          = 복제 : 새로운 메모리를 만들어 준다 
 *          = 참조 : 주소가 같다 (여러개로 한개의 메모리를 제어)
 *                  윈도우,네트워크서버,오라클서번연결 
 *            ===================== 여러개의 클래스에서 한개의 주소로 접근하는 방식 (싱글턴)
 *            ==> 서버(네트워크),데이터베이스:참조변수를 이용해서 한개의 객체로 모든 클래스를 제어
 *            ==> 소프트웨어 패턴 : 싱글턴,팩토리 패턴 => 웹에서 주로 이용(스프링)
 *      = String : 문자열과 관련된 클래스 
 *          = 일반데이터(기본형) 
 *          = 클래스형 (기능=메소드)
 *          = 메소드에서 매개변수를 이용해서 데이터 전송 
 *            매개변수 이용법 
 *             1) Call By Value (일반 데이터값) => 메모리가 따로 생성 => 기본데이터형,String
 *             2) Call By Reference => 배열 , 클래스일 경우에 주로 사용 (주소 넘겨서 주소 자체의 데이터값 변경)
 *          = 주요 기능 (메소드) 
 *            1) equals() : 실제 저장된 문자열을 비교  ==> 원형: public boolean equals(String str)
 *               예)  
 *                   String id="";
 *                   String id2="";
 *                   id.equals(id2)
 *               = 로그인 (ID,Password)
 *               = ID중복 
 *            2) substring() : 문자열을 자른다 
 *               = 오버로딩 : 여러개의 메소드가 만들어져 있다
 *               원형:
 *                    public String substring(int s) : 지정된 위치로부터 전체를 읽어 올때
 *                    public String substring(int s,int e) : 문자열 중간에서 자른다 
 *                         # 마지막문자는 제외된다 
 *               = 자바의 문자열은 시작번호가 0번이다  
 *            3) 찾기 : 앞에서 찾기 = indexOf()
 *                     뒤에서 찾기 = lastIndexOf() 
 *                     ============> public int indexOf(찾는 문자,찾는 문자열)
 *            4) 문자열로 찾기 
 *               startsWith() : 시작문자열이 같은 경우
 *               endsWith() : 끝나는 문자열이 같은 경우
 *               contains() : 문자열중에 포함된 경우
 *               
 *            5) 문자의 갯수 : length()
 *            6) 문자열 변환 (모든 데이터형을 문자열로 변환) : valueOf() => 유일 : static
 *            7) 문자열분리 : split => public String[] split(String regex) 
 *               
 *      = StringBuffer/StringBuilder
 *        StringBuffer = StringBuilder : 사용법은 동일 (네트워크에서 들어오는 데이터 읽어서 저장 : StringBuilder)
 *        ============
 *          = append() => 문자열 결합 
 *          = toString() => 저장된 문자열을 읽어 오는 경우
 *      = Wrapper : 일반데이터을 제어하기 쉽게 만들어 준 클래스 
 *        =======
 *         Byte (byte)
 *         **Boolean (boolean)
 *         **Long (long)
 *         **Double (double)
 *         Float (float)
 *         **Integer (int) 
 *         ==> 오토박싱 / 언박싱
 *             Integer i=new Integer(1); 
 *             int a=10;
 *             
 *             int b=i;
 *             =========================== Integer클래스는 일반 데이터값을 사용 할 수 있다 
 *             Integer i=10;
 *      = Math (모든 메소드가 static) : 산술 연산  
 *          = random() : 0.0~0.99 사이의 난수를 발생  => public static double random();
 *          = ceil() : 올림메소드 => 웹에서 목록 출력 => 페이지 나누기 (총페이지 구하기)
 *                     ** 페이징 기법 
 *      = Scanner : 키보드 입력값을 받는 경우 
 *   java.util.* => 반드시 import를 사용해서 클래스를 읽어온다 
 *      ***= 날짜
 *      = 문자열 분리 
 *      ***= 컬렉션 클래스 : 배열 대신 사용 
 *   java.io.* 
 *   java.net.* 
 *   ==================================================
 *   java.sql.* : Oracle연동 (오라클에서 데이터 읽기)
 *   javax.http.servlet.* : Web에서 사용 
 */
import java.io.*;// 파일에서 데이터 읽기 
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // String 이용 
		String data=""; // movie.txt 파일에서 데이터를 읽어서 저장하는 공간 
		// 파일 읽기 
		/*
		 *    IO , SQL , NetWork => CheckException = 반드시 예외처리를 한다 
		 */
		try
		{
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			// FileInputStream(1byte) , FileReader(2byte): 한글 깨짐 방지
			int i=0; // 한글자씩 읽어온다  => 문자번호로 읽는다  A => 65
			// char => 0~65535 => 멀티바이트 (UniCode) => ASC를 UniCode변경 (UTF-8)
			//System.out.println((int)'홍');
			/*
			 *   제어문 
			 *    while : 반복횟수가 없는 경우에 주로 사용
			 *    for : 반복횟수가 지정인 경우
			 */
			while((i=fr.read())!=-1) // 파일이 끝일때까지 읽는다 (-1:EOF)
			{
				data+=String.valueOf((char)i);
				// valueOf ==> static메소드 모든 데이터형을 문자열로 변환 
				// 연산처리 : 같은 데이터형끼리만 연산된다 
				// 문자열+int => 문자열+(int=>문자열)
			}
			// 파일 닫기 
			fr.close();
			// 읽은 데이터를 출력 한다 
			System.out.println("============= 영화 정보 =============");
			System.out.println(data);
		}catch(Exception ex) {}
	}

}





















