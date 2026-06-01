package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
public class DB_connection {
	

	    public static void main(String[] args) {

	        try {

	   
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            
	            String url = "jdbc:mysql://localhost:3306/company_db";

	            
	            String username = "root";
	            String password = "Prince@3050";

	            
	            Connection con = DriverManager.getConnection(
	                    url,
	                    username,
	                    password
	            );

	            System.out.println("Database Connected Successfully");

	            
	            con.close();

	        } catch (Exception e) {

	            System.out.println(e);

	        }
	    }
	}


