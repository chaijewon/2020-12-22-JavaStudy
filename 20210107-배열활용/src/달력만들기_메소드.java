import java.util.*;
public class �޷¸����_�޼ҵ� {
    // �Է�
	static int input(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" �Է�:");
		return scan.nextInt();
	}
	// �������
	static void weekPrint()
	{
		String[] week={"��","��","ȭ","��","��","��","��"};
		for(String s:week)
		{
			System.out.print(s+"\t");
		}
		System.out.println();
	}
	// ���� ���ϱ� 
	static int weekData(int year,int month)
	{
		// 1. ���⵵������ �� 
				int total=(year-1)*365+(year-1)/4
						              -(year-1)/100
						              +(year-1)/400;
				// 2. ���ޱ����� ��
				/*
				 *    case 2:
				 *       total+=31 
				 *         3
				 *        total+=31+28
				 *          4
				 *          total+=31+28+31
				 */
				int[] lastday={31,28,31,30,31,30,
						       31,31,30,31,30,31};
				if((year%4==0 && year%100!=0)||(year%400==0))// ���� 2�� => 29
					lastday[1]=29;
				else
					lastday[1]=28;
				
				for(int i=0;i<month-1;i++)
				{
					total+=lastday[i];
				}
				
				// 3. +1 
				total++; // ������ 1���� Ȯ�� 
				int week=total%7;// ����
				return week;
	}
	// �޷�����ϱ�
	static void datePrint(int month,int week)
	{
		int[] lastday={31,28,31,30,31,30,
			           31,31,30,31,30,31};
		for(int i=1;i<=lastday[month-1];i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");  // ����
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}
	}
	static void process()
	{
		int year=input("�⵵");
		int month=input("��");
		int week=weekData(year, month);
		weekPrint();
		datePrint(month, week);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
