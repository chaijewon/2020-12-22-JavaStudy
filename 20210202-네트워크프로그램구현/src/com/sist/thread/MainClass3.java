package com.sist.thread;
import javax.swing.*;// Component(Button...) , Container(윈도우)
import java.awt.*;//Color , Image , Layout
import java.awt.event.*;//Event => 사건
public class MainClass3 extends JFrame implements ActionListener{
    JProgressBar[] bar=new JProgressBar[5];
    JButton b1,b2;
    // 초기화 (객체 메모리 할당 => 배치 => 윈도우 크기 => 윈도우를 보여준다)
    BarThread[] bt=new BarThread[5];
    static int rank;
    public MainClass3()
    {
    	b1=new JButton("시작");
    	b2=new JButton("종료");
    	
    	JPanel p=new JPanel();
    	p.setLayout(new GridLayout(5,1,5,5));
    	Color[] color= {Color.cyan,Color.yellow,Color.pink,Color.orange,Color.magenta};
    	for(int i=0;i<5;i++)
    	{
    		bar[i]=new JProgressBar();
    		bar[i].setMinimum(0);
    		bar[i].setMaximum(100);
    		bar[i].setStringPainted(true);
    		bar[i].setBackground(Color.white);
    		bar[i].setForeground(color[i]);
    		p.add(bar[i]);
    	}
    	JPanel p2=new JPanel();
    	p2.add(b1);p2.add(b2);
    	
    	// 윈도우 추가
    	add("Center",p);
    	add("South",p2);
    	
    	// 크기
    	setSize(640, 350);
    	setVisible(true);
    	
    	// 등록 
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MainClass3();
	}
	// 프로그래스바가 동작 => 쓰레드 (5개가 동작을 다르게 만든다)
	// 쓰레드가 프로그래스바를 공유 => 멤버 클래스 
	class BarThread extends Thread
	{
		// 프로그래바 한개만 작동하게 만든다
		int index;
		public BarThread(int index)
		{
			this.index=index;
		}
		// 동작을 구현
		public void run()
		{
			for(int i=0;i<=100;i++)
			{
				bar[index].setValue(i);
				int a=(int)(Math.random()*300);// 일시정지 
				try
				{
					Thread.sleep(a);
				}catch(Exception ex){}
				
				if(i==100)
				{
					rank++;
					interrupt();// 쓰레드 종료 
				}
			}
			System.out.println((index+1)+"번째:"+rank+"등");
		}
		
	}
	// 클래스와 클래스 => 데이터 공유 (내부 클래스 , static)
	/*
	 *   내부 클래스 
	 *   = 멤버 클래스 : 데이터 공유 (메모리 할당이 없는 상태에서) => 윈도우,쓰레드,네트워크
	 *                 네트워크 : 서버(한 컴퓨터에서 두번을 실행하면 오류 발생)
	 *     public class A
	 *     {
	 *        윈도우 
	 *        main()
	 *        {
	 *            A a=new A(); => 윈도우 보여라 
	 *        }
	 *        class MyThread extends Thread
	 *        {
	 *        
	 *        }
	 *     }
	 *     
	 *   =
	 *   =
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			// 쓰레드 실행
			for(int i=0;i<5;i++)
			{
				bt[i]=new BarThread(i);
				bt[i].start();
			}
		}
		if(e.getSource()==b2)
		{
			// 종료
			System.exit(0);
		}
	}
	
	
}






