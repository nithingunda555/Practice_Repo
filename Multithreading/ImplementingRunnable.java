// Implementing Runnable Interface
class MyRunnable implements Runnable {

    // Implementing the run method to define the task below
    @Override
    public void run() {
        try {
           
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - Value " + i);
                Thread.sleep(500); 
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ImplementingRunnable {
    public static void main(String[] args) {
        // Creating Runnable instance
        MyRunnable myRunnable = new MyRunnable();

        // Creating thread objects with the Runnable instance
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);

        // Starting the threads
        t1.start();  // Calls run() method from Runnable
        t2.start();  // Calls run() method from Runnable
    }
}
