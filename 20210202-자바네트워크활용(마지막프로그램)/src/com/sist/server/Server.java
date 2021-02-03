package com.sist.server;
/*
 *     서버
 *     class Server
 *     {
 *         접속자를 저장 (변수) => Server , Client => 공유
 *         ==> 저장 
 *         class Client
 *         {
 *            ==> 퇴장 (제거) ==> 여러개 데이터 , 메소드를 동시에 공유 (쓰레드)
 *         }
 *     }
 *     
 *     공유 : 내부 클래스 , static (저장 공간 1)
 *     
 *     class Server
 *     {
 *         static Vector waitvc=new Vector();
 *     }
 *     class Client
 *     {
 *     }
 *     
 *     class DAO
 *     {
 *        Connection conn;
 *        Statement stmt;
 *     }
 */
import java.net.*;
import java.io.*;
import java.util.*;
// LOGIN => id,대화명,성별  ==> 로그인 버튼 클릭 => 100|id|대화명|성별 ==> Server (StringTokenizer)
public class Server implements Runnable{
    // 접속을 담당 
	private ServerSocket ss;
	public Server()
	{
		try
		{
			ss=new ServerSocket(3355); // 접속자가 50명 , ServerSocket(3355,1000)
			// ss.bind("localhost",3355) => 개통
			// ip(전화번호), port(연결선)
			// 대기 => listen() 
			/*
			 *    class ServerSocket
			 *    {
			 *        public ServerSocket(int port)
			 *        {
			 *            this.bind("localhost",port);
			 *            this.listen();
			 *        }
			 *    }
			 */
			System.out.println("Server Start...");
		}catch(Exception ex){}
	}
	// 클라이언트가 접속시마다 처리 
	/*
	 *    클라이언트 접속을 하면 => 클라이언트 정보(IP,PORT=>SCOKET) 받아서 쓰레드에 전송 
	 *                                                           ======
	 *                                                           전송받은 클라이언트와 통신 
	 *                      => 정보를 저장 
	 */
	public void run()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// 통신만 담당하는 클래스 => 접속자마다 따로 생성 => 여러개가 동시에 동작 (쓰레드)
	class Client extends Thread
	{
		// 클라이언트의 모든 정보를 가지고 있다 
		// ip,port
		Socket s;
		// 클라이언트와 입출력 (저장 공간 확인)
		OutputStream out;
		BufferedReader in;
		// 일반 변수 
		String id,name,sex;
		// 소켓을 받아 온다 
		public Client(Socket s)
		{
			
		}
		// 통신 처리 
		public void run()
		{
			
		}
		// 동일한 기능 
		// 한사람에게 전송
		public void messageTo(String msg)
		{
			
		}
		// 접속자 모두에게 보내는 기능 
		public void messageAll(String msg)
		{
			
		}
	}

}
















