package jdbc;
import java.sql.*;
public class Update_Salary {
	

	    public static void main(String[] args) {

	        try {

	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/employee_rc_db",
	                    "root",
	                    "Prince@3050"
	            );

	            String query =
	                    "UPDATE employees SET salary=? WHERE emp_id=?";

	            PreparedStatement ps = con.prepareStatement(query);

	            ps.setInt(1, 90000);
	            ps.setInt(2, 1);

	            int rows = ps.executeUpdate();

	            System.out.println(rows + " Record Updated");

	            con.close();

	        } catch(Exception e) {

	            System.out.println(e);
	        }
	    }
	}


