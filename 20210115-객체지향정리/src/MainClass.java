class Student /*extends Object*/{
	private int hakbun;//0
	private String name;//null
	private String sex;//null
	public Student(int hakbun,String name,String sex)
	{
		// ������� , �������� => �켱 ���� (�������� => �������) 
		// ���������� ��������� �������� ���� => this�� ���� 
		// ��� ����޼ҵ�(�ν��Ͻ��޼ҵ忡�� this�� ���ȴ�) => ������ ���� ���� this������ ���� 
		this.hakbun=hakbun;// this�� �����ߴ� 
		this.name=name;
		this.sex=sex;
	}
	public void print()
	{
		System.out.println("�й�:"+hakbun);
		System.out.println("�̸�:"+name);
		System.out.println("����:"+sex);
		System.out.println("this="+this);
		/*
		 *   �ν��Ͻ��� �����ø��� => ���� this��� �ڽ��� ��ü�� ������ �ִ� 
		 *   this => �����Ͻÿ� �ڵ� ���� 
		 *   
		 *   Student s=new Student()
		 *          ===�ּ� 
		 *   this=s;
		 *   
		 *   Student s1=new Student()
		 *   this=s1;
		 *   
		 *   this=> static���� ���� => ���ø��� �ּҰ��� ���� 
		 *   
		 */
		
		/*
		 *    �ν��Ͻ����� => �ʱ�ȭ 
		 *    ==================
		 *     1.����� �ʱ�ȭ   ======> int page=1; , totalpage=3768
		 *     class Recipe
		 *     {
		 *         int page=1;
		 *         int totalpage=150001/10;
		 *         //if(150001%15>0)
		 *           // totalpage++;
		 *         public Recipe()
		 *         {
		 *             totalpage=150001/10;
		 *             if(150001%15>0)
		 *             totalpage++;
		 *         }
		 *         
		 *         {
		 *             totalpage=150001/10;
		 *             if(150001%15>0)
		 *             totalpage++;
		 *         }
		 *     }
		 *     2.������ 
		 *     3.�ʱ�ȭ ��
		 *     4. setTotalPage() : ��������� ������ ��쿡 ���
		 *     5. �� �б� => getXxx() 
		 *     
		 *     ========= ���� (�޸𸮿� ����,�޸𸮿��� �б�)
		 *                    setter / getter
		 */
	}
}
public class MainClass /*extends Object*/{

	static  public void main(String[] args) {
		// TODO Auto-generated method stub
        Student s1=new Student(1,"ȫ�浿","����");
        System.out.println("s1="+s1);
        //s1.Student(1, "ȫ�浿", "����");// s1�� ������ �ִ� ����޼ҵ� 
        s1.print();
        Student s2=new Student(2,"��û��","����");
        System.out.println("s2="+s2);
        s2.print();
	}

}




