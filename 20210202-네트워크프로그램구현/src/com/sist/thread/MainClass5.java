package com.sist.thread;
/*
 *   내부 클래스 
 *   멤버클래스 
 *   class A(윈도우)
 *   {
 *      class B(쓰레드)
 *      {
 *         A가 가지고 있는 모든 데이터,메소드 활용 
 *         A를 메모리 할당을 하지 않고 사용 
 *      }
 *   }
 *   익명의 클래스 : 상속없이 오버라이딩 가능 
 */
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*Runnable r=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("run Call...");
			}
		};
		
		Thread t=new Thread(r);
		t.start();*/
		// 람다식
		Runnable r=()->{
			System.out.println("run Call...");
		};
		Thread t=new Thread(r);
		t.start();
		/*
		 *    function aaa(){
		 *    }
		 *    
		 *    var aaa=function(){}
		 *    
		 *    var aaa=()=>{
		 *    }
		 */
	}

}











