package Day7;
	class FoodDelivery {
	    public synchronized void process(String task) {
	        try {
	            System.out.println(task + " started by " 
	                               + Thread.currentThread().getName());

	            Thread.sleep(3000);

	            System.out.println(task + " completed by " 
	                               + Thread.currentThread().getName());

	        } catch (InterruptedException e) {
	            System.out.println("Thread interrupted");
	        }
	    }
	}

	class Task implements Runnable {
	    FoodDelivery fd;
	    String work;

	    Task(FoodDelivery fd, String work) {
	        this.fd = fd;
	        this.work = work;
	    }

	    public void run() {
	        fd.process(work);
	    }
	}
	public class Multi_1 {
	    public static void main(String[] args) throws InterruptedException {

	        FoodDelivery fd = new FoodDelivery(); 

	        Thread t1 = new Thread(new Task(fd, "Order"), "Order-Thread");
	        Thread t2 = new Thread(new Task(fd, "Kitchen"), "Kitchen-Thread");
	        Thread t3 = new Thread(new Task(fd, "Delivery"), "Delivery-Thread");

	        t1.start();
	        t1.join();
	        t2.start();
	        t2.join();
	        t3.start();
	        t3.join();

	        System.out.println("All tasks completed.");
	    }
	}
	