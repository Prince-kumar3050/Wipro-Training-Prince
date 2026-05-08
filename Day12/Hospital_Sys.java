package Day12;
import java.io.*;
import java.util.Scanner;

public class Hospital_Sys {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
            System.out.print("Enter ID: ");
             int id = sc.nextInt();
             sc.nextLine();
	        System.out.print("Enter Patient Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Age: ");
	        int age = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Disease: ");
	        String disease = sc.nextLine();

	        try {

	            DataOutputStream dos =
	                    new DataOutputStream(
	                            new FileOutputStream("Patient.txt"));
                dos.writeInt( id );
	            dos.writeUTF(name);
	            dos.writeInt(age);
	            dos.writeUTF(disease);

	            dos.close();

	            System.out.println("\nPatient record saved.");

	        } catch (IOException e) {
	            System.out.println(e);
	        }

	        try {

	            DataInputStream dis =
	                    new DataInputStream(
	                            new FileInputStream("Patient.txt"));

	            System.out.println("\nPatient Report:");
                System.out.println("ID:" + dis.readInt());
	            System.out.println("Patient Name: " + dis.readUTF());
	            System.out.println("Age: " + dis.readInt());
	            System.out.println("Disease: " + dis.readUTF());

	            dis.close();

	        } catch (IOException e) {
	            System.out.println(e);
	        }

	        sc.close();
	    }
	}


