import java.io.*;
import java.net.*;
public class tcps
{
	public static void main(String[] args)throws Exception
	{
		ServerSocket ss=new ServerSocket(3787);
		System.out.println("Server is waiting for Client...");
		Socket s=ss.accept();
		BufferedReader br1,br2;
		br1=new BufferedReader(new InputStreamReader(System.in));
		br2=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String msg=new String();
		PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
		while(true)
		{
			System.out.println("From Client: "+br2.readLine());
			msg=br1.readLine();
			pw.println(msg);
		}
	}
}