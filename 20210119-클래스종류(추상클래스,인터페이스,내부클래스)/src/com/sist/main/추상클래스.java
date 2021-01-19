package com.sist.main;
// page 375
/*
 *    �߻� Ŭ���� 
 *    1. ����
 *       ����������  Ÿ��  class  className{}
 *       ======== ====(final|abstract)
 *       public|default
 *       
 *       public abstract class className
 *       {
 *           ==============
 *             ���� 
 *              = ������� (instance)
 *              = ���뺯�� (static)
 *           ==============
 *             �޼ҵ�
 *              =========== �Դ´� (��,��,����,���...)
 *              = ������ �޼ҵ� 
 *                 ��ǻ�� / ��Ʈ�� / �ڵ��� ==> �Ŀ��� Ŭ�� (�ʿ��ϸ� �������̵�)
 *                 public ������ �޼ҵ�(�Ű�����..) => �����
 *                 {
 *                    ������ 
 *                 }
 *              = ����� �޼ҵ� ==> ������ �ȵ� ���� 
 *                 ����� ���� => ������ �ٸ��� 
 *                 public (abstract) ������ �޼ҵ�(�Ű�����); => �ϼ��� �ȵ� => ����� �޾Ƽ� �ϼ� 
 *           ==============
 *           ==============
 *           
 *       }
 *       Ư¡ 
 *       ====
 *        1) �ڽ��� �޸��Ҵ��� �� �� ���� (�̿ϼ��� Ŭ����) => new�� ����� �� ����
 *           abstract class A
 *           A a=new A(); (X)
 *        2) ����� ���� Ŭ�������� �̿ϼ� �޼ҵ带 �����ؼ� ��� 
 *        3) �߻� Ŭ������ ����
 *           ========= ����,���� , ������ 
 *        4) ���������� ������ �Ǵ� ��ɸ� ���� 
 *           �Խ��� (�۾���,����,����,���뺸��,ã��)
 *             = �ϹݰԽ���
 *             = ����� �Խ���
 *             = �������Խ���
 *             = ������ϱ�
 *             = �ڷ�� 
 *    2. ���ó 
 *        = �䱸���� �м� (��ŷ) => ������ ���� 
 *          �Ƿ� => �䱸���� �м� => �ʿ��� ������ ���� => UI => ���� => �׽���
 *                 ==========    ==============    ===   ====   =====
 *                   ��Ű����          DBA          �ۺ���  �����α׷��� �׽���  
 *        = ����� ���� => �������°� �������� 
 *          ========= ���α׷��� �°� �����ؼ� ��� 
 *          ========= �������� ���� Ŭ������ ��Ƽ� ó�� (Ŭ������ ��Ƽ� �Ѱ��� �̸����� ����)
 *          ========= ǥ��ȭ�� �ȴ� (���̺귯��)
 */
// �߻�Ŭ������ ��� => ���� ��Ӹ� ���� 
abstract class Print{
	public abstract void list();
	public abstract void detail();
	//public abstract void menuClick();
	/////////////////////// ������ �����ؼ� ����Ѵ� 
	public void reserve() {
		System.out.println("������ �����մϴ�"); // �ʿ��� Ŭ���������� �����ؼ� ����� ���� 
	}
	public void end()
	{
		System.out.println("����Ʈ �̵�");
	}
	
}
class ��ȭ extends Print{

	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ ������ ���");
	}

	@Override
	public void detail() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ ���� ������ ���");
		
	}
	/*
	 *   public void reserve() {
		   System.out.println("������ �����մϴ�"); // �ʿ��� Ŭ���������� �����ؼ� ����� ���� 
	     }
	 */
	
}
class ���� extends Print{

	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("������ ���̺� �������� ���");
	}

	@Override
	public void detail() {
		// TODO Auto-generated method stub
		System.out.println("���� ������ �޴��� ���");
	}
	/*
	 *   public void reserve() {
		   System.out.println("������ �����մϴ�"); // �ʿ��� Ŭ���������� �����ؼ� ����� ���� 
	     }
	 */
}
class �װ��� extends Print{

	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("������ ���� ���̺����·� ���");
	}

	@Override
	public void detail() {
		// TODO Auto-generated method stub
		System.out.println("�ð��� ����Ѵ�");
		/*
		 *   class final System
		 *   {
		 *       static OutputStream out;
		 *       static InputStream in;
		 *   }
		 */
	}
	public void reserve() {
		   System.out.println("�װ� �ð� ������ �մϴ�"); // �ʿ��� Ŭ���������� �����ؼ� ����� ���� 
	}
	/*
	 *    �޼ҵ�� {} => ����
	 */
}
public class �߻�Ŭ���� {
    /*
     *    ���α׷� => ��Ƽ� �Ѱ��� ����
     *    �����Ͱ� ������ => �迭
     *    Ŭ������ ������ => �߻�Ŭ���� , �������̽� 
     *    
     *    ��ȭ int
     *    ���� double
     *    �װ��� String 
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �ٸ� Ŭ������ �����ؼ� ����� ���� 
        Print p=new ��ȭ();
        p.list();
        p.detail();
        p.reserve();
        
        p=new ����();
        p.list();
        p.detail();
        p.reserve();
        
        p=new �װ���();
        p.list();
        p.detail();
        p.reserve();
        
        
        
	}

}





