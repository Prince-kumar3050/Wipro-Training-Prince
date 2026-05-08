package Day3;

public class Employee {
	
	    private double salary;

	    public void setSalary(double salary) {
	        if (salary > 0) {
	            this.salary = salary;
	        }
	    }

	    public double getSalary() {
	        return salary;
	    }
	}


