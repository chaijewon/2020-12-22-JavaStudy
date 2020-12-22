// 한개의 파일안에 여러개의 클래스를 만들 수 있다 
// public class => 한개만 존재해야 한다
// 저장명은 반드시 public이 있는 클래스가 저장명이 된다
/*
 *   main() => 자동으로 인식하는 기능
 *   ======
 *    원형 
 *     static public void main(String[] args)
 *     public static void main(String[] args)
 *     public static void main(String[] aaba)
 *     
 *     // 실행 과정 
 *     java MainClass2
 *        1. MainClass2.class 파일 찾기 (javac)
 *        2. 클래스검사 (오류)
 *        3. main() => 출력한다 
 *     ================ main()
 */
public class MainClass2 {

	static public void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hello /**/ Java");
        //부연 설명시에 주로 사용 (메뉴얼)
        System.out.println("Hello Java //주석" /*Hello*/);//
        System.out.println(2440000000000000000L);
	}

}














