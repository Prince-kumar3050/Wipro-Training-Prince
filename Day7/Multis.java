package Day7;
	class Order implements Runnable {
	    public void run() {
	        try {
	          // for(int i = 1; i <= 3; i++) {
	                System.out.println("Order is being processed.....");
	                Thread.sleep(4000);
	            //}
	        } catch (InterruptedException e) {
	            System.out.println("Thread interrupted");
	        }
	    }
	}

	class Payment implements Runnable {
	    public void run() {
	        System.out.println("Payment is being processed....");
	    }
	}

	class Notification implements Runnable {
	    public void run() {
	        System.out.println("Notification sent....");
	    }
	}
	public class Multis {
	    public static void main(String[] args) throws InterruptedException {

	        Order o = new Order();
	        Payment p = new Payment();
	        Notification n = new Notification();

	        Thread t1 = new Thread(o);
	        Thread t2 = new Thread(p);
	        Thread t3 = new Thread(n);

	        t1.start();
	        t1.join();
	        t2.start();
	        t3.start();
	    }
	}


