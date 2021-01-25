package com.sist.string;
// data-lazy="https://mp-seoul-image-production-s3.mangoplate.com/keyword_search/meta/pictures/afkudopipqgww3lu.jpg?fit=around|600:400&amp;crop=600:400;*,*&amp;output-format=jpg&amp;output-quality=80"
// 문자의 위치를 찾아 준다 => indexOf,lastIndexOf(경로,확장자)
/*
 *     String s="ABCDEFGABC";
 *               0123456789
 *     s.indexOf('A') => 0  s.indexOf('E') => 4
 *     s.lastIndexOf('A') => 7 s.lastIndexOf('E') => 4
 *     
 *     int indexOf('A') indexOf("A")
 *     int lastIndexOf('A')
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String image="https://mp-seoul-image-production-s3.mangoplate.com/keyword_search/meta/pictures/afkudopipqgww3lu.jpg?fit=around|600:400&amp;crop=600:400;*,*&amp;output-format=jpg&amp;output-quality=80";
	    int index=image.indexOf("?"); //image.indexOf('?')
	    int last=image.lastIndexOf('?');
	    System.out.println("index="+index);
	    System.out.println("last="+last);
	    // substring: 문자열 자른다 
	    String real_image=image.substring(0,image.indexOf("?"));
	    System.out.println(real_image);
	    /*
	     *  "smiles".substring(1, 5) returns "mile"
             012345
	     *  String s="ABCDEFGHIJK";
	     *            012345678910 => 11
	     *  String substring(int s)
	     *  substring(3) ==> "DEFGHIJK"
	     *  String substring(int s,int e)
	     *  substring(5,9) ==> "FGHI" e-1
	     */
	    
	}

}













