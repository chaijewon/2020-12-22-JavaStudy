package com.sist.munje;
/*
 *   �ڹ� Ŭ������ �ۼ��ϴ� ������ �غ���. ���� main() �޼ҵ带 �����Ͽ��� �� ���ÿ� ���� ��µǵ��� TV Ŭ������ �ۼ��϶�.
	Class TV{
	     private String pro;
	     private int year;
	     private int inch;
	     public TV(String pro,int year,int inch) // �����ڸ� �̿��ؼ� ���� �ʱ�ȭ
	     {
	          this.pro=pro;
	          this.year=year;
	          this.inch=inch
	     }
	    public void show()
	    {
	       System.out.println(pro+������ ���� ��+year+������ ��+inch+����ġ TV��);
	    } 
	}
	public static void main(String[] args) {    TV myTV = new TV("LG", 2017, 32); //LG���� ���� 2017�� 32��ġ    myTV.show(); }
	
	��� ����
	LG���� ���� 2017���� 32��ġ TV

 */
// ������ : ������ (�����ε��� ����) , �����ڿ��� ����ϴ� �Ű������� ��������
class TV{
    private String pro;
    private int year;
    private int inch;
    // �����ڸ� ���� �ʱ�ȭ �۾� 
    public TV(String pro,int year,int inch) // �����ڸ� �̿��ؼ� ���� �ʱ�ȭ
    {
         this.pro=pro;
         this.year=year;
         this.inch=inch;
    }
   public void show()
   {
      System.out.println(pro+"���� ���� "+year+"���� "+inch+"��ġ TV");
   } 
}
public class ����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TV t=new TV("LG",2017,32);
        t.show();
	}

}
