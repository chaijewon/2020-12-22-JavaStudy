package com.sist.lib;
// MessageFormat => SQL������ ���鶧 
/*
 *   SQL 
 *    = DML
 *      = SELECT
 *      = INSERT
 *      = UPDATE
 *      = DELETE
 *    = DDL
 *    = DCL
 *    = TCL
 *    
 *    PL/SQL
 */
import java.text.*;
// �����͸� ������ ������� ����� �� �ַ� ��� (����Ŭ ����)
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String msg="�̸�:{0}\n����:{1}\n��ȭ:{2}\n�ּ�:{3}\n����:{4}\n";
        Object[] obj={"ȫ�浿","����","010-1111-1111","����",30};
        // Object�� ��� ���������� ���� �� �ִ� 
        String result=MessageFormat.format(msg, obj);
        System.out.println(result);
        
	}

}












