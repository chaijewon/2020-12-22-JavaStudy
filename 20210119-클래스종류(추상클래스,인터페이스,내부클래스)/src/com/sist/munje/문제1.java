package com.sist.munje;
/*
 *   ���� �ڵ带 ��ü ���� ���α׷��� �������� �ٶ����� �ڵ�� �����϶�.
                ================== ĸ��ȭ,���,������
���� : private , �޼ҵ� : public (getter/setter) : ĸ��ȭ ���

class Power {   private int kick;   private int punch;
   public void setKick(int kick)
   {
        this.kick=kick;
   }
   public int getKick()
   {
         return kick;
   }}public class Example {public static void main (String args[]) { Power robot = new Power();    robot.setKick(10);     robot.setPunch(20); }}
 */
// page 349 ĸ��ȭ : �ܺηκ��� �����͸� ��ȣ 
/*
 *   ������ ���� �ʱ�ȭ 
 *   1) �޼ҵ带 �̿��ϴ� ��� => setXxx(), getXxx()
 *   2) �����ڸ� �̿��ϴ� ���
 *   3) �ʱ�ȭ�� : �ٸ� Ŭ�������� ���� �Է¹��� ���Ѵ� 
 */
class Power {   
	   private int kick;
	   private int punch;
	   public Power()
	   {
		   
	   }
	   public Power(int kick,int punch)
	   { 
		 this.kick=kick;
		 this.punch=punch;
	   }
		public int getKick() {
			return kick;
		}
		public void setKick(int kick) {
			this.kick = kick;
		}
		public int getPunch() {
			return punch;
		}
		public void setPunch(int punch) {
			this.punch = punch;
		}
     
}
/*
 *   ��ü ���� (������ ��ȣ)
 *   1. ���� => private
 *   2. ������ �̿��� �� => �޼ҵ�,������ (public)
 */
public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. ������ => ������ �ʱ�ȭ 
		Power p1=new Power(10,20);
		Power p2=new Power();
		p2.setKick(10);
		p2.setPunch(20);
	}

}








