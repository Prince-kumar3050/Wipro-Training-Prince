package utils;
import java.io.BufferedReader;
import java.io.FileReader;

public class CsvUtils {
	
	 public static String[] getLoginData() {

	        try {

	            BufferedReader br = new BufferedReader(
	                    new FileReader("src/test/resources/TestData.csv"));

	            // Header skip
	            br.readLine();

	            // Data row read
	            String line = br.readLine();
                 
	            System.out.println("CSV Line = [" + line + "]");
	           // System.out.println("CSV Line = " + line);

	         //   String[] data = line.split(",");

	            String[] data = line.split("\\s+");
	            System.out.println("Length = " + data.length);

	            br.close();

	            return data;

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return null;
	    }
	}

	    

