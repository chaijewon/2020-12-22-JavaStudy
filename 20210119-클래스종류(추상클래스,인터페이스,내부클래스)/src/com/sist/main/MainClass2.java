package com.sist.main;
abstract class Common
{
	protected int x,y;
	public abstract void movie(int x,int y);
	public void stop() {}
}
class ������ extends Common{
	//private int x,y;
	public void movie(int x,int y) {}
	//public void stop() {}
	public void use() {} // ������ 
}
class ��ũ extends Common{
	//private int x,y;
	public void movie(int x,int y) {}
	//public void stop() {}
	void changeMode() {} // ��ũ
}
class ���ۼ� extends Common
{
	//private int x,y;
	public void movie(int x,int y) {}
	//public void stop() {}
	public void load() {} //���ۼ�
	public void unload() {}//���ۼ�
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
