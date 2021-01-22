class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int i=0; int j=10; do { System.out.print(i); if(i++>--j){ break; } }
		 * while(true);
		 */
		try
		{
			int a=10;
			int aa=10/0;
			if(a==10)
			{
				throw new MyException("Â¦¼ö´Ù");
			}
		}catch(ArithmeticException | MyException m)
		{
			System.out.println(m.getMessage());
		}
		
     }

}
