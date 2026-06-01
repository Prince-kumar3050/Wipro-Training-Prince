package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
public class Test_Connection {
	

	    public static void main(String[] args) {

	        try {

	            

	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/company_db",
	                    "root",
	                    "Prince@3050"
	            );

	            System.out.println("Database Connected");

	            con.close();

	        } catch (Exception e) {

	            e.printStackTrace();
	        }
	    }
	}

