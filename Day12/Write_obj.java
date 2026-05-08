package Day12;
	import java.io.*;
		class Student implements Serializable {

		    int id;
		    String name;

		    Student(int id, String name) {
		        this.id = id;
		        this.name = name;
		    }
		}
		public class Write_obj {

		    public static void main(String[] args) {

		        try {

		            Student s1 = new Student(101, "Prince");

		            ObjectOutputStream out =
		                    new ObjectOutputStream(
		                    new FileOutputStream("Prince.txt"));

		            out.writeObject(s1);

		            out.close();

		            System.out.println("Objevt saved");

		        }

		        catch(IOException e) {

		            System.out.println(e);

		        }
		    }
		}