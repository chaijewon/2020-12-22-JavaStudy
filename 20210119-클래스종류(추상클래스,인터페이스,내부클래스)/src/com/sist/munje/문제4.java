package com.sist.munje;
/*
 *   Grade Ŭ������ �ۼ��غ���. 3 ������ ������ �Է¹޾� Grade ��ü�� �����ϰ� ���� ����� ����ϴ� main()�� ���� ���ô� ������ ����.
     public static void main(String[] args) 
     {  // TODO Auto-generated method stub   
     Scanner sc = new Scanner(System.in);  
      System.out.print("����, ����, ���� ������ 3���� ���� �Է� >> ");  
       int math = sc.nextInt();   
       int science = sc.nextInt();   
       int english = sc.nextInt();  
        Grade me = new Grade(math, science, english);   
        System.out.println("����� "+me.average()); 
    // average()�� ����� ����Ͽ� ����}
����, ����, ���� ������ 3���� ���� �Է� >> 90 88 96����� 91

 */
class Grade
{
	private int math,science,english;
	public Grade(int math,int science,int english)
	{
		this.math=math;
		this.science=science;
		this.english=english;
	}
	public double average()
	{
		return (math+science+english)/3.0;
	}
	
}
public class ����4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
