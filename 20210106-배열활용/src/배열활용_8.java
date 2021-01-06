
public class 배열활용_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*String data="Hello Java!!";
        char[] cdata=data.toCharArray(); // {'H','e','l'~~}
        for(char c:cdata)
        {
        	System.out.println(c);
        }*/
		/*char[] cdata={'A','B','C','D','E'};
		String data=String.valueOf(cdata);// 문자배열 => 스트링 
		System.out.println(data);*/
		// substring()
		/*
		 *   substring(int start)
		 *   substring(int start , int end)
		 *                         ======== 제외  6,10-1
		 *                         MainClass.java  => indexOf(".")
		 *                         A.java
		 *   
		 *   String data="Hello Java!!";
		 *                01234567891011
		 */
		String data="0123456789";
		System.out.println(data.substring(3));
		/*
		 *    "unhappy".substring(2) returns "happy"
		 *     0123445
              "Harbison".substring(3) returns "bison"
               01234567
               
               
                "hamburger".substring(4, 8) returns "urge" 4~7
                 012345678
                "smiles".substring(1, 5) returns "mile"  1~4
                 012345
                 
                 c>=4 && c<=8

		 */
		System.out.println(data.substring(3,6));// endIndex - 1
	}

}











