package com.sist.network2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Client extends JFrame implements ActionListener{
    JTextField tf; // 채팅 입력 
    JTextArea ta; // 채팅 출력 
    JButton b1,b2;// 접속 , 종료 
    // 초기화 
    public Client()
    {
    	tf=new JTextField(20);
    	tf.setEnabled(false);
    	b1=new JButton("접속");
    	b2=new JButton("종료");
    	ta=new JTextArea();
    	ta.setEditable(false);
    	JScrollPane js=new JScrollPane(ta); // V , H
    	// 배치
    	add("Center",js);
    	JPanel p=new JPanel();
    	p.add(tf);p.add(b1);p.add(b2);
    	add("South",p);
    	
    	// 윈도우 크기
    	setSize(400, 450);
    	setVisible(true);
    	
    	// 버튼을 누르면 actionPerformed를 호출 해라(이벤트 처리:사건)
    	b1.addActionListener(this);
    	// Client가 가지고 있는 actionPerformed(ActionEvent e) 호출
    	// ====== Client의 자신 : this
    	b2.addActionListener(this);
    	tf.addActionListener(this);
    	/*
    	 *   ActionListener => actionPerformed(ActionEvent e)
    	 *   ==============
    	 *     button종류 (JButton,JRadioButton)
    	 *     textfield => Enter
    	 *     menuItem
    	 */
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 생성자
		new Client();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2)
		{
			System.exit(0);// 프로그램 종료
		}
	}

}






