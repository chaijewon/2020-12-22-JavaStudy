package com.sist.main;
class Box implements Cloneable
{
	private int width=100;
	private int height=100;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	protected Object clone() {
		// TODO Auto-generated method stub
		Object obj=null;
		try
		{
			obj=super.clone();
		}catch(Exception ex){}
		return obj;
	}
	
	
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          Box box=new Box();
          box.setWidth(300);
          box.setHeight(300);
          Box box2=box;
          Box box3=(Box)box.clone();
          System.out.println(box3.getWidth());
          System.out.println(box3.getHeight());
	}

}
