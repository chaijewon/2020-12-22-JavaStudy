package com.sist.lib;
/*
 *    Object : 
 *      1. ��ü�� ��ü �� : equals
 *      2. ���ο� �޸� ���� : clone
 *      3. ���ڿ� ��ȯ ��� : toString
 *      4. Ŭ������ ���� �б� : getClass
 *      5. �޸𸮿��� �������� Ȯ�� : finalized
 *      
 *      ============ ��ü �����(5���� ����� ����) 
 *      
 *      String => final 
 *      
 */
class C
{
	public void display()
	{
		System.out.println("C:display() Call...");
	}
}
// class Class => getClass()
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        C c=new C();
        Class cc=c.getClass();
        Class cc1=C.class;
        //Class cc2=Class.forName("");
		/*
		 * try { Class clsName=Class.forName("com.sist.lib.C"); Object
		 * obj=clsName.newInstance(); Method[] m=clsName.getDeclaredMethods();
		 * m[0].invoke(obj, null); }catch(Exception ex){}
		 */
	}

}
