package com.sist.string;
/*
 *   ½ºÆ®¸µ Å¬·¡½º 
 *   ===========
 *     char[]À» Á¦¾îÇÏ´Â ÇÁ·Î±×·¥ 
 *     String => Å¬·¡½º 
 *            => ¹®ÀÚ¿­À» ÀúÀå 
 *            => ¹®ÀÚ¿­À» ½±°Ô Á¦¾î°¡ °¡´ÉÇÏ°Ô ¸¸µç Å¬·¡½º 
 *            => ¹®ÀÚ¿­À» ÀúÀåÇÏ´Â ÀÏ¹Ý µ¥ÀÌÅÍÇüÀ¸·Î »ç¿ëÀÌ °¡´É
 *               ***String name=""
 *               String name=new String(""); 
 *     StringÅ¬·¡½º´Â Call By Reference¸¦ »ç¿ë ÇÒ ¼ö ¾ø´Ù 
 *     
 *     => ¸Þ¼Òµå È£Ãâ 
 *        °ª¸¸ Àü¼Û : Call By Value (º¹»çº») => ±âº»µ¥ÀÌÅÍÇü (int a,int b)
 *        ÁÖ¼Ò Àü¼Û : Call By Reference     => ¹è¿­, Å¬·¡½º (A a) => StringÀº ¿¹¿Ü Á¶°Ç
 *     => Å¬·¡½º¿Í Å¬·¡½º¿¬°á => ¸Þ¼ÒµåÈ£Ãâ 
 *     
 *     String¿¡¼­ ±â´É 
 *     =============
 *     º¯È¯ 
 *       = ´ë¹®ÀÚ º¯°æ : toUpperCase() => "aaa".toUpperCase() => "AAA" String
 *       = ¼Ò¹®ÀÚ º¯°æ : toLowerCase() => String
 *       = °ø¹é¹®ÀÚ Á¦°Å : ÁÂ¿ìÀÇ °ø¹é¸¸ Á¦°Å => trim() " aaa ".trim() => "aaa" String
 *       = ¹®ÀÚ¿­ °áÇÕ : concat() => ºóµµ°¡ ÀÛ´Ù  (+)
 *                    "Hello".concat("Java") ==> "HelloJava" => "Hello"+"Java"
 *     Á¦¾î
 *       ######  ¸ðµç ¹®ÀÚ¿­Àº ½ÃÀÛ¹øÈ£°¡ 0¹øºÎÅÍ ½ÃÀÛÇÑ´Ù
 *       "Hello Java"
 *        0123456789   ==> length():10 
 *       = ¹®ÀÚ¿­ ±æÀÌ : length()
 *       = ¹®ÀÚ ÇÑ°³¸¦ °¡Áö°í ¿Â´Ù : charAt()  => charAt(6)
 *       =================================
 *       = ½ÃÀÛ¹®ÀÚ¿­ : startsWith()
 *       = ³¡³ª´Â ¹®ÀÚ¿­ : endsWith()
 *       ================================= °Ë»ö±â Á¦ÀÛ  
 *       = Æ÷ÇÔ¹®ÀÚ : contains() : ÃßÃµ 
 *       "hello" "Hello" => ID,Password
 *       = ¹®ÀÚºñ±³ : equals():´ë¼Ò¹®±¸ºÐ , equalsIgnoreCase():´ë¼Ò¹®ÀÚ ±¸ºÐ¾øÀÌ ºñ±³
 *         "Hell.o.java" => 
 *       = ¹®ÀÚÀ§Ä¡ Ã£±â : indexOf():Ã³À½ , lastIndexOf():¸¶Áö¸·¿¡ ÀÖ´Â ¹®ÀÚ
 *         "ABCADEF".replace('A','K')  ==> KBCKDEF
 *       = ¹®ÀÚº¯È¯ : replace:ÇÑ±ÛÀÚ,replaceAll:Á¤±Ô½Ä
 *         "abcAbc1234ÇÑ±Û"=> replaceAll("[^0-9]","") => "1234"
 *         ¼ýÀÚ [0-9]
 *         ¾ËÆÄºª [A-Z] [a-z] => [A-Za-z] 
 *         ÇÑ±Û [°¡-ÆR]
 *         
 *         "red,green,blue,yellow,black"
 *       = ¹®ÀÚºÐÇØ 
 *         = split : ±¸ºÐÀÚº°·Î ¹è¿­¿¡ ÀúÀå 
 *         = substring : ¹®ÀÚÀÇ À§Ä¡ ÁöÁ¤ 
 *       = °´Ã¼¸¦ ¹®ÀÚ¸¦ º¯È¯ : toString()
 *       = ¸ðµç µ¥ÀÌÅÍÇüÀ» ¹®ÀÚ¿­·Î º¯È¯ => valueOf()
 *       = ¹®ÀÚ Å©±â ºñ±³ (Á¤·Ä) : "ABC" "ACD" compareTo() int => °°´Ù(0),¿ÞÂÊ: 1 , ¿À¸¥ÂÊ :-1
 *          "aaa".compareTo("aaa") => 0
 *     
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="hello";
        String s=str.toUpperCase();
        String s1=str.toLowerCase();
        System.out.println(str);
        System.out.println(s);
        String s2=str.concat("Java");
        System.out.println(s2);
        System.out.println(str);
	}

}







