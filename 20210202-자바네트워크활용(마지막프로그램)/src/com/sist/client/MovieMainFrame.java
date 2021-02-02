package com.sist.client;
// 윈도우
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MovieMainFrame extends JFrame{
	
	JMenuItem home=new JMenuItem("홈");
	JMenuItem rmovie=new JMenuItem("현재상영영화");
	JMenuItem smovie=new JMenuItem("개봉예정영화");
	
	JMenuItem wbox=new JMenuItem("주간");
	JMenuItem mbox=new JMenuItem("월간");
	JMenuItem ybox=new JMenuItem("연간");
	
	CardLayout card=new CardLayout();
	MovieHomeForm mhf=new MovieHomeForm();
    public MovieMainFrame()
    {
    	setLayout(card);
    	JMenuBar bar=new JMenuBar();
    	JMenu menu1=new JMenu("홈");
    	menu1.add(home);
    	
    	JMenu menu2=new JMenu("영화");
    	menu2.add(rmovie);
    	menu2.add(smovie);
    	
    	JMenu menu3=new JMenu("박스오피스");
    	menu3.add(wbox);
    	menu3.add(mbox);
    	menu3.add(ybox);
    	
    	bar.add(menu1);
    	bar.add(menu2);
    	bar.add(menu3);
    	
    	// 윈도우 추가
    	setJMenuBar(bar);
    	
    	// 화면 추가
    	add("HOME",mhf);
    	setSize(1600, 1000);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		  UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
		
		 new MovieMainFrame();
	}

}
