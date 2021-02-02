package com.sist.thread;
/*
 *   쓰레드 :한개의 프로그램안에서 여러개의 기능을 동시에 수행
 *          ===========(프로세스)
 *          쓰레드는 메소드 호출 : 게임 , 채팅 , 웹(서버=> 통신기능)
 *   1. 쓰레드 구현과 실행 
 *      1) Thread를 상속 (Thread는 클래스) => 멀티쓰레드
 *         public class MyThread extends Thread
 *         {
 *         } 
 *      2) Runnable 구현 (Runnable 인터페이스) => 싱글쓰레드 (윈도우)
 *         ============ 이미 상속이 있는 경우에 주로 사용
 *         public class MyThread implements Runnable
 *         {
 *             public void run()
 *             {
 *                쓰레드 동작을 코딩
 *             }
 *         }
 *   2. 쓰레드 생명주기                     ====> Blocked (일시정지)
 *      new    ====>  Runnable  ====> Running 
 *                                      ====> Dead (메모리 해제)
 *      1) new 
 *         Thread t=new Thread();
 *         => JVM
 *            = 이름이 부여 (Thread-0...)
 *              이름 가지고 오기 : getName()
 *              이름 변경 : setName()
 *            = 우선순위 부여 (1~10)
 *              1: MIN_PRIORITY
 *              10: MAX_PRIORITY
 *              5: NORM_PRIORITY(사용자 정의)
 *              == 기준 (작업 종료)
 *              = 쓰레드는 한가지 일만 수행 
 *                예) 서버 / 클라이언트 (서버로부터 응답값을 받아서 출력)
 *                   클라이언트 
 *                     1) 서버에 요청 : 채팅문자열을 접속자 전체 전송 
 *                                   응답메세지 출력 (쓰레드)
 *                     2) 게임 : 비행기
 *                              비행기 총알
 *                              아바타 총알
 *                              아바타
 *              =========================================================                     
 *               메인프레임 => C/S  => 데이터 공유 => 감성 컴퓨터 => Empty
 *                                   GRID
 *                                  =========    =========
 *                                  클라우드          AI
 *              =========================================================
 *       2) Runnable (대기상태) => 자원(CPU=>메모리공간) 공유
 *          start()
 *       3) Running (쓰레드 실행) => 쓰레드가 어떻게 동작을 할지 코딩
 *          run()
 *       4) 실행하는 과정 : 일시정지 
 *          sleep()
 *       5) 종료 : 쓰레즈 해제 
 *          interrupt() 
 *   3. 쓰레드는 데이터가 없다 => 프로세스의 데이터 공유해서 사용(내부클래스)
 *   class Game
 *   {
 *       Game과 관련된 데이터
 *       
 *       class ThreadEx extends Thread
 *       {
 *          
 *       }
 *   }
 */
class MyThread extends Thread
{
	// 동작 
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread()+":"+i);
			try
			{
				Thread.sleep(1000);// 1/1000 => 일시정지 
			}catch(Exception ex) {}
		}
	}
}
/*
 *    모든 프로세스는 main()부터 시작한다 
 *                =======
 *                Thread ==> 모든 프로세스는 한개 이상의 쓰레드를 가지고 있다
 */
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 쓰레드 생성 
		System.out.println(Thread.currentThread());
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		MyThread t4=new MyThread();
		MyThread t5=new MyThread();
		
		t1.setName("홍길동");
		t2.setName("심청이");
		t3.setName("이순신");
		t4.setName("강감찬");
		t5.setName("을지문덕");
		
		// 우선순위 1(MIN) ~ 5(NORM)default ~ 10(MAX)
		//        ======                    =======
		//          GC                       main() => 쓰레드 
		t1.setPriority(10);
		t2.setPriority(1);
		t3.setPriority(1);
		t4.setPriority(1);
		t5.setPriority(1);
		// 대기상태 => start()
		t1.start();t2.start();t3.start();t4.start();t5.start();// 시분할 (한번씩 수행)
		
		// 실행상태 => run()
		// start()=>run() 자동 호출 
	}

}










