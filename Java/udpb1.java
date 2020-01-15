import java.io.*;
import java.net.*;
public class udpb1
{
	public static void main(String[] args)
	{
		DatagramSocket ds;
		DatagramPacket senddp,recdp;
		String sen,rec;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		byte b[];
		byte b1[]=new byte[1000];
		InetAddress ip=new InetAddress.getByName("Theory-4");
		ds=new DatagramSocket(3000);
		while(true)
		{
			sen=br.readLine();
			b=sen.getBytes();
			senddp=new DatagramSocket(b,b.length,ip,2500);
			ds.send(senddp);
			recdp=new DatagramPacket(b1,b1.length);
			ds.receive(recdp);
			rec=new String(recdp.getData(),0,recdp.getLength());
			System.out.println("From Client2: "+rec);
		}
	}
}