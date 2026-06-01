package jdbc;
import java.sql.*;
public class FetchSalary {

	    public static void main(String[] args) {

	        try {

	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/employee_rc_db",
	                    "root",
	                    "Prince@3050"
	            );

	            String query =
	                    "SELECT * FROM employees WHERE salary > 50000";

	            Statement st = con.createStatement();

	            ResultSet rs = st.executeQuery(query);

	            while(rs.next()) {

	                System.out.println(
	                        rs.getInt("emp_id") + " "
	                        + rs.getString("emp_name") + " "
	                        + rs.getString("department") + " "
	                        + rs.getInt("salary")
	                );
	            }

	            con.close();

	        } catch(Exception e) {

	            System.out.println(e);
	        }
	    }
	}


