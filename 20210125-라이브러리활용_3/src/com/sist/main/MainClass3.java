package com.sist.main;
import java.text.ChoiceFormat;
import java.util.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double[] limits={50,60,70,80,90};
        String[] grades={"F","D","C","B","A"};
        int[] score={85,56,70,95,62,80,78,90};
        ChoiceFormat form=new ChoiceFormat(limits,grades);
        for(int i=0;i<score.length;i++)
        {
        	System.out.println(score[i]+":"+form.format(score[i]));
        }
        
	}

}
