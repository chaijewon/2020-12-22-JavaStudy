package com.sist.string;
// split => ºÐ¸® ==> regex
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String color="red?blue?green?black?yellow?magenta";
        String[] colors=color.split("\\?");
        
        for(String s:colors)
        {
        	System.out.println(s);
        }
	}

}
