package jdbc;
import java.sql.*;
public class Delete_Employee {


	    public static void main(String[] args) {

	        try {

	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/employee_rc_db",
	                    "root",
	                    "Prince@3050"
	            );

	            String query =
	                    "DELETE FROM employees WHERE emp_id=?";

	            PreparedStatement ps = con.prepareStatement(query);

	            ps.setInt(1, 2);

	            int rows = ps.executeUpdate();

	            System.out.println(rows + " Record Deleted");

	            con.close();

	        } catch(Exception e) {

	            System.out.println(e);
	        }
	    }
	}


