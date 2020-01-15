import java.io.*;
import java.net.*;
public class udpb2
{
	public static void main(String[] args)throws Exception
	{
		DatagramSocket ds;
		DatagramPacket senddp,recdp;
		String sen,rec;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		byte b[]=new byte[1000];
		byte b1[];
		InetAddress ip=new InetAddress.getByName("Theory-4");
		ds=new DatagramSocket(2500);
		while(true)
		{
			recdp=new DatagramPacket(b,b.length);
			ds.receive(recdp);
			rec=new String(recdp.getData(),0,recdp.getLength());
			System.out.println("From Client1: "+rec);
			sen=br.readLine();
			b1=sen.getBytes();
			senddp=new DatagramSocket(b1,b1.length,ip,2500);
			ds.send(senddp);			
		}
	}
}