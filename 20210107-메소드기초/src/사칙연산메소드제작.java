import java.util.Scanner;
/*
 *   ����ó���ϴ� �޼ҵ带 ����� ==> 1���� (�Ű�����(O),������(O))
 *   +
 *   -
 *   *
 *   /
 *   ===> ����ȭ 
 *   ȸ������ 
 *     ����,���̵��ߺ�üũ,�����ȣ 
 */
public class ��Ģ����޼ҵ����� {

	// +
	static int plus(int a,int b)
	{
		return a+b;
	}
	// -
	static int minus(int a,int b)
	{
		return a-b;
	}
	static int gop(int a,int b)
	{
		return a*b;
	}
	static double div(int a,int b)
	{
		return a/(double)b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �޼ҵ� ȣ�� 
		Scanner scan=new Scanner(System.in);
		System.out.print("ù��° ���� �Է�:");
		int a=scan.nextInt();
		System.out.print("�ι�° ���� �Է�:");
		int b=scan.nextInt();
		System.out.print("������ �Է�(+,-,*,/):");
		String op=scan.next();
		int c=0;
		switch(op)
		{
		case "+":
			c=plus(a,b);
			System.out.printf("%d+%d=%d\n",a,b,c);
			break;
		case "-":
			c=minus(a, b);
			System.out.printf("%d-%d=%d\n",a,b,c);
			break;
		case "*":
			c=gop(a, b);
			System.out.printf("%d*%d=%d\n",a,b,c);
			break;
		case "/":
			if(b==0)
				System.out.println("0���� ���� �� �����ϴ�");
			else
			{
				double d=div(a,b);
				System.out.printf("%d/%d=%.2f\n",a,b,d);
			}
			break;
		default:
			System.out.println("�߸��� �������Դϴ�!!");
		}
	}

}












