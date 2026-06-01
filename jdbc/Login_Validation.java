package jdbc;
import java.sql.*;
public class Login_Validation {
	
	    public static void main(String[] args) {

	        try {

	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/employee_rc_db",
	                    "root",
	                    "Prince@3050"
	            );

	            String username = "Prince";
	            String password = "1234";

	            String query =
	                    "SELECT * FROM users WHERE username=? AND password=?";

	            PreparedStatement ps = con.prepareStatement(query);

	            ps.setString(1, username);
	            ps.setString(2, password);

	            ResultSet rs = ps.executeQuery();

	            if(rs.next()) {

	                System.out.println("Login Successful");
	            }
	            else {

	                System.out.println("Invalid Username or Password");
	            }

	            con.close();

	        } catch(Exception e) {

	            System.out.println(e);
	        }
	    }
	}


