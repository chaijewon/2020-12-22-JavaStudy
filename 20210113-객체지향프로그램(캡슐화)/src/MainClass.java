import java.util.*;
import java.io.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	FileReader fr=new FileReader(new File("c:\\javaDev\\recipe.json"));
        	StringBuffer data=new StringBuffer();
        	int i=0;
        	while((i=fr.read())!=-1)
        	{
        		data.append(String.valueOf((char)i));
        	}
        	fr.close();
        	System.out.println(new String(data.toString()));
        }catch(Exception ex) {}
	}

}
