package jdbc;
import java.sql.*;

 class Insert_Data {	
	    public static void main(String args[])
	    {
	        try
	        {
	          

	            
	            String url = "jdbc:mysql://localhost:3306/company_db";
	            String username = "root";
	            String password = "Prince@3050";

	          
	            Connection con = DriverManager.getConnection(url, username, password);

	          
	            Statement st = con.createStatement();

	         
	            String query =
	                "insert into employees values(9,'Manish','IT',70000)";

	          
	            int rows = st.executeUpdate(query);

	            
	            System.out.println(rows + " row inserted successfully");

	            con.close();
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	    }
	}