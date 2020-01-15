import java.io.*;
import java.net.*;
import java.util.*;
public class tcpc
{
	public static void main(String[] args)throws Exception
	{
		InetAddress i=new InetAddress.getByName("");

		Socket ss=new Socket(i,3787);
		
		BufferedReader br1,br2;
		br1=new BufferedReader(new InputStreamReader(System.in));
		br2=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String msg;
		PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
		while(true)
		{
			msg=br1.readLine();
			pw.println(msg);
			System.out.println("From Server: "+br2.readLine());
		}
	}
}