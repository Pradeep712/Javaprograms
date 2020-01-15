import java.net.*;
public class iadd
{
	public static void main(String[] args)throws Exception
	{
		System.out.println(InetAddress.getLocalHost());
		System.out.println(InetAddress.getByName("lab-15"));

		InetAddress i=InetAddress.getLocalHost();
		System.out.println(i.getHostName());
		System.out.println(i.getHostAddress());
	}
}