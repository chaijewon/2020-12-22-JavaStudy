package com.sist.string;
/*
 *   replace : �Ѱ��� ���ں��� 
 *   replaceAll : ���Խ� => �ѹ��� ó���� ���� 
 *   
 *   �̸��� : ^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$
 *   IP 
 *       211.238.142.181
 *       127.0.0.1
 *       
 *       [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
 */
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String msg="ABCDEFGABCD";
        String replace_msg=msg.replace('A', 'K');
        System.out.println(replace_msg);
        // ��Ʈ��ũ => ������ ���� �޴� ��� ==> \n 
        // => replace('\n','\t') =>  replace("<title>","");
        String msg2="<title>���Ѽ� ���� <b>����</b>����</title>\r\n"
        		+ "<link>http://openapi.naver.com/l?AAABWLyw6CMBREv+ayNJe2UrrogvJwg8aYKGvACiSUalNR/t6azGLO5Mzrrd0moVSQJZDl/6I4KIxGpx9y9P4JNANShXSzHXZLu2q3660Jw2bt0k1+aF1rgFYXfZ+c7j3QorYDkCT4JxuIEEyRUYGcxpGXMeMs3VPBOUEWGXntynUW03k7ohBYfG+mOdRqbPL6E84/apnqgaEAAAA=</link>\r\n"
        		+ "<description>���Ѽ� ���� <b>����</b>���� �츮 ��α��Ͻô� �е鲲�� �� �߿��� ������ ���� �ֽ��ϴ� �װ͵� �ַ� <b>����</b> ���ַ� ��α׸� �����Ͻ� ���̶�� ���� �� ������\r\n"
        		+ "���� ��������, ��� �ϸ� �������̰� ���� <b>����</b>��... </description>\r\n"
        		+ "<bloggername>��¯�� Best Drawing World2</bloggername>";
        msg2=msg2.replaceAll("[^��-�R ]","");
        // [��-�R] => �ѱ� ��ü  [^��-�R] => �ѱ��� ����  ^[��-�R] �ѱ۷� ���� [��-�R]$ => �ѱ۷� ���� 
        System.out.println(msg2);
        
	}

}














