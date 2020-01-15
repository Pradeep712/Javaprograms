import java.sql.*;
import java.io.*;
public class select
{
	select()
	{
		Connection con;
		Statement stmt;
		ResultSet rs;
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://http://localhost/phpmyadmin/sql.php?server=1&db=test&table=employee&pos=0&token=88cd1593fce629fc97b1a98ba3b1c74e","","");
			stmt=con.createStatement();
			String str="select eno,ename from customer";
			System.out.println("The SQL query is "+str);
			System.out.println();

			rs=stmt.executeQuery(str);
			int rowCount=0;
			while (rs.next())
			{
				int empno=rs.getInt("eno");
				String empname=rs.getString("ename");
				System.out.println("Eno "+" Ename");
				++rowCount;
			}
			System.out.println("Total Number of records= "+rowCount);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		select se=new select();
	}
}