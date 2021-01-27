package com.sist.main;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import com.sist.news.*;
import java.util.*;
public class NewsForm extends JPanel implements ActionListener{
   JButton b1,b2;
   JLabel la;
   int curpage=1;
   int totalpage=0;
   JPanel p=new JPanel();
   NewsManager mgr=new NewsManager();
   public NewsForm()
   {
	   setLayout(new BorderLayout());
	   
	   
   	   //p.setLayout(null);
   	   JScrollPane pp=new JScrollPane();
   	   Dimension size = new Dimension();
   	   size.setSize(1000, 1000);
   	   p.setPreferredSize(size);
   	   pp.setViewportView(p);
	   
	   p.setLayout(new GridLayout(5, 1));
	   
	   
	   add("Center",pp);
	   b1=new JButton("이전");
	   b2=new JButton("다음");
	   totalpage=mgr.newsTotalPage();
	   la=new JLabel(curpage+" page / "+totalpage+" pages");
	   JPanel ppp=new JPanel();
	   ppp.add(b1); ppp.add(la); ppp.add(b2);
	   add("South",ppp);
	   
	   b1.addActionListener(this);
	   b2.addActionListener(this);
	   
   }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
