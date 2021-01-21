package com.sist.main;
class Student
{
	String name;
	public boolean equals(Object obj)
	{
		if(obj instanceof Student)
			return name==((Student)obj).name;
		else
			return false;
	}
	public Student(String name)
	{
		this.name=name;
	}
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s1=new Student("홍길동");
        Student s2=new Student("홍길동");
        
        if(s1==s2)
        	System.out.println("같은 학생입니다");
        else
        	System.out.println("다른 학생입니다");
        System.out.println("====================");
        if(s1.equals(s2))
        	System.out.println("같은 학생입니다");
        else
        	System.out.println("다른 학생입니다");
	}

}
