class MyThread extends Thread {
    
    // Overriding the run method to define the task below
    @Override
    public void run() {
        try {
          
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - Value " + i);
                Thread.sleep(500); // Sleep for 500 ms
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ExtendingThread{
    public static void main(String[] args) {
        // Creating thread instances here 
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Starting threads
        t1.start();  // Calls run() method
        t2.start();  // Calls run() method
    }
}
