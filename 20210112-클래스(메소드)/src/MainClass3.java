// 매개변수 전송 
// 값만 전송하는 방식 (기본데이터형)
// 주소를 전송하는 방식 (배열,클래스=> 넘겨준 주소의 데이터를 변경) : String은 예외 (String은 기본데이터형과 유사)
/*
 *    데이터형 (자료형)
 *      = 기본데이터형 (자바에서 지원하는 데이터타입)
 *      = 사용자 데이터형 (배열,클래스) : 상속
 */
class Data
{
	int x=10;
	int y=20;
}
class DataSend
{
	void swap(int x,int y)
	{
		int temp=x;
		x=y;
		y=temp;
		System.out.println("x="+x+",y="+y);
	}
	void swap(int[] arr)
	{
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		System.out.println("arr[0]="+arr[0]+",arr[1]="+arr[1]);
	}
	void swap(Data d)
	{
		int temp=d.x;
		d.x=d.y;
		d.y=temp;
		System.out.println("d.x="+d.x+",d.y="+d.y);
	}
	void swap(String s1,String s2)
	{
		String temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("s1="+s1+",s2="+s2);
	}
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataSend ds=new DataSend();
		
		String s1="Hello";
		String s2="Java";
		System.out.println("s1="+s1+",s2="+s2);
		ds.swap(s1,s2);
		System.out.println("변경후:s1="+s1+",s2="+s2);
		
        int x=10,y=20;
        System.out.println("x="+x+",y="+y);
        
        ds.swap(x, y);
        System.out.println("변경후:x="+x+",y="+y);
        
        int[] arr={10,20};
        System.out.println("arr[0]="+arr[0]+",arr[1]="+arr[1]);
        ds.swap(arr);
        System.out.println("변경후:arr[0]="+arr[0]+",arr[1]="+arr[1]);
        
        Data d=new Data();
        System.out.println("d.x="+d.x+",d.y="+d.y);
        
        ds.swap(d);
        System.out.println("변경후:d.x="+d.x+",d.y="+d.y);
        
	}

}








