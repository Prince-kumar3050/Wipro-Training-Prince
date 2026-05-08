package Day11;
import java.io.*;
public class Input_output {


	    public static void main(String[] args) {

	        try {
	            BufferedWriter bw = new BufferedWriter(new FileWriter("Prince.txt"));

	            bw.write("Hello Java IO");
	            bw.newLine();   
	            bw.write("This file is created by BufferedWriter");

	            bw.close();

	            System.out.println("File written successfully");

	        } catch (IOException e) {
	            System.out.println("Error occurred: " + e.getMessage());
	        }
	    }
	}


