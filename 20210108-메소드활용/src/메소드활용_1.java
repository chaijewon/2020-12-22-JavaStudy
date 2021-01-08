
public class 메소드활용_1 {
    static void star(int a)
    {
    	for(int i=0;i<a;i++)
    	{
    		System.out.println("***** *****");
    	}
    }
    static void star()
    {
    	System.out.println("***** *****");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("***** *****");
        System.out.println("***** *****");
        System.out.println("***** *****");
        System.out.println("***** *****");
        System.out.println("***** *****");
        System.out.println("***** *****");
        System.out.println("***** *****");
        System.out.println("***** *****");
        System.out.println("***** *****");
        System.out.println("***** *****");
        System.out.println("====== for =====");
        for(int i=0;i<10;i++)
        {
        	System.out.println("***** *****");
        }
        System.out.println("===== method =====");
        star(10);
        System.out.println("===== method =====");
        star();star();star();star();star();
        star();star();star();star();star();
	}

}






