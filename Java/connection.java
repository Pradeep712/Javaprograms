import java.sql.*;  
public class connection
{  
	public static void main(String args[])
	{  
		try
		{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("http://localhost/phpmyadmin/employee","","");  

		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from employee");  
		while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
		con.close();  
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}  
	}  
}  