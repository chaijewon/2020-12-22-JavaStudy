import java.util.Scanner;
/*
 *    ����
 *      = ������� 
 *      = �������� : static 
 *      = �������� 
 *    �޼ҵ� 
 *      = ����޼ҵ�
 *      = �����޼ҵ�(Ŭ�����޼ҵ�) : static
 *      = �߻�޼ҵ� 
 *    =================================
 *    1. �����͸� ��� ó��
 *    2. ��ɹ��� ��� ó��
 *    ==================== + Ŭ����(����+�޼ҵ�)
 */
public class �޼ҵ�Ȱ��_5 {
    // 1. �޴� 
	//  int m=menu()
	//  m=>return���� �޴� ���� 
	static int menu()
	{
		Scanner scan=new Scanner(System.in);// �޴�����
		// �޴��� �����ش� 
		System.out.println("================= �޴� ================");
		System.out.println("1. ���� Top50 ��ü ����");
		System.out.println("2. �뷡 �˻�");
		System.out.println("3. ������ �˻�");
		System.out.println("4. �� ����");
		System.out.println("5. ���α׷� ����");
		System.out.println("======================================");
		int m=0;
		while(true)
		{
			System.out.print("�޴��� �����ϼ���(1~5)?");
			m=scan.nextInt();
			if(m<1 || m>5)
			{
				System.out.println("���� �޴��Դϴ�!!");
				continue; // while ó������ �̵�
			}
			break; // while�� ����
		}
		return m;
	}
	// 2. ��ü ���
	static void musicAllData()
	{
		String[] title=�޼ҵ�Ȱ��_4.title;
		String[] singer=�޼ҵ�Ȱ��_4.singer;
		String[] album=�޼ҵ�Ȱ��_4.album;
		System.out.println("************************ ���� ��ü ��� ****************************");
		for(int i=0;i<50;i++)
		{
			System.out.println("�뷡��:"+title[i]);
			System.out.println("������:"+singer[i]);
			System.out.println("�ٹ�:"+album[i]);
			System.out.println("*****************************************************************");
		}
		
	}
	// 3. �뷡 ã��
	// 4. ���������� �뷡ã�� 
	// 5. �󼼺��� 
	// 6. ����
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        while(true)
        {
        	int m=menu();
        	switch(m)
        	{
        	case 1:
        		musicAllData();
        		break;
        	case 5:
        		System.out.println("���α׷� ����");
        		System.exit(0);// ���α׷� ����
        		//break;
        	}
        }
	}

}







