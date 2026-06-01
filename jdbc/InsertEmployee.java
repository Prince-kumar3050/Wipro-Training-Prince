package jdbc;
import java.sql.*;
public class InsertEmployee {
	    public static void main(String[] args) {

	        try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	        	 
	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/employee_rc_db",
	                    "root",
	                    "Prince@3050"
	            );

	            String query =
	                    "INSERT INTO employees VALUES(?,?,?,?)";

	            PreparedStatement ps = con.prepareStatement(query);

	            
	            ps.setInt(1, 1);
	            ps.setString(2, "Prince");
	            ps.setString(3, "IT");
	            ps.setInt(4, 60000);
	            ps.executeUpdate();

	        
	            ps.setInt(1, 2);
	            ps.setString(2, "Gautam");
	            ps.setString(3, "HR");
	            ps.setInt(4, 45000);
	            ps.executeUpdate();
 
	            ps.setInt(1, 3);
	            ps.setString(2, "Rohit");
	            ps.setString(3, "Sales");
	            ps.setInt(4, 70000);
	            ps.executeUpdate();
	            
	            ps.setInt(1, 4);
	            ps.setString(2, "Aryan");
	            ps.setString(3, "IT");
	            ps.setInt(4, 55000);
	            ps.executeUpdate();

	         
	            ps.setInt(1, 5);
	            ps.setString(2, "raushan");
	            ps.setString(3, "Finance");
	            ps.setInt(4, 80000);
	            ps.executeUpdate();

	            System.out.println("5 Employees Inserted");

	            con.close();

	        } catch(Exception e) {

	           e.printStackTrace();
	        }
	    }
	}
