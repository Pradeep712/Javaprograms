import java.util.*;
import java.util.*;
public class date
{
	Thread t;
	public static void main(String[] args)throws Exception
	{
		Date d;
		int k=0;
		while(true)
		{

			d=new Date();
			System.out.println(d.getMinutes()+" "+d.getSeconds());
			k++;
			Thread.sleep(1000);
			if(k==10)
			{
				System.out.println("Time Up.....");
				System.exit(0);
			}
		}
	}
}