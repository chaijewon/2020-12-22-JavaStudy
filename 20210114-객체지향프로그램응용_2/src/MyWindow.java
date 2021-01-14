import javax.swing.*;
// is-a
// long(8) < float(4)
//  (MyWindow)JFrame
public class MyWindow extends JFrame{
    JButton b=new JButton("Click");
    JButton b1=new JButton("Click");
    JButton b2=new JButton("Click");
    JButton b3=new JButton("Click");
    JButton b4=new JButton("Click");
	public MyWindow()
    {
    	add("North",b);
    	add("Center",b1);
    	add("South",b2);
    	add("East",b3);
    	add("West",b4);
    	setSize(640, 480);
    	setVisible(true);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyWindow m=(MyWindow)new JFrame();
        // int a=(int)10L;
	}

}
