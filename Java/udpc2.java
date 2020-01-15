import java.io.*;
import java.net.*;
public class udpc2
{
	public static void main(String[] args)throws Exception
	{
		DatagramSocket ds=new DatagramSocket(2500);
		DatagramPacket dp;
		String s;
		byte b[]=new byte[1000];
		while(true)
		{
			dp=new DatagramPacket(b,b.length);
			ds.receive(dp);
			b=dp.getData();
			s=new String(dp.getData(),0,dp.getLength());
			System.out.println("From client1: "+s);
		}
	}
}