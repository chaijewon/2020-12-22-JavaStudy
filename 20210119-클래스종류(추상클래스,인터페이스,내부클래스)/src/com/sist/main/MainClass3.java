package com.sist.main;
/*
 *   �߻� Ŭ���� ===> Board
 *     = ������ ������ �޼ҵ�
 *     = ���� �ϴ� �޼ҵ�
 */
abstract class Board
{
	public abstract void write();// �۾���  
	public abstract  void list();// ���
	public abstract  void detail();// �󼼺���
	public void update(){}// ����
	public abstract void delete(); // ����
	public void find() {}
}
class �Խ��� extends Board
{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	/*public void write() {} // �۾���  
	public void list() {} // ���
	public void detail() {} // �󼼺���
	public void update() {} // ����
	public void delete() {} // ����
	public void find() {}*/
}
class �ڷ�� extends Board
{
	/*public void write() {} // �۾��� , ���Ͽø���
	public void list() {} // ���
	public void detail() {} // �󼼺��� , ���� �ٿ�ε�
	public void update() {}  // ����
	public void delete() {} // ���� => ����
	public void find() {} // ã��*/
	public void upload() {}
	public void download() {}
	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void detail() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
}
class �亯�Խ��� extends Board
{
	/*public void write() {} // �۾���
	public void list() {} // ��� , �亯�� ��� 
	public void detail() {} // �󼼺��� 
	public void update() {} //����
	public void delete() {} // ���� => �亯
	public void find() {} //ã��*/
	public void reply() {}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
}
class ��۰Խ��� extends Board
{
	/*public void write() {} // �۾���
	public void list() {} // ���
	public void detail() {} // �󼼺��� , ��� 
	public void update() {} //���� 
	public void delete() {} // ���� => ��� 
	public void find() {} //ã��*/
	public void replyWrite() {}
	public void replyDelete() {}
	public void replyUpdate() {}
	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void detail() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
