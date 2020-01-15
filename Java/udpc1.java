import java.net.*;
import java.io.*;
public class udpc1
{
	public static void main(String[] args) throws Exception
	{
		DatagramSocket ds=new DatagramSocket(3000);
		DatagramPacket dp;
		String s;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		byte b[];
		InetAddress i=InetAddress.getByName("theory-4");
		while(true)
		{
			s=br.readLine();
			b=s.getBytes();
			dp=new DatagramPacket(b,b.length,i,2500);
			ds.send(dp);
		}
	}
}