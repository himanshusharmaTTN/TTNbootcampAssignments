// Q3. WAP to showcase the usage of volatile in java.

class VolatileDemo extends Thread {

    // volatile variable
    private volatile boolean running = true;

    @Override
    public void run() {
        System.out.println("Thread started...");

        while (running) {
            // loop keeps running until running becomes false
        }

        System.out.println("Thread stopped.");
    }

    public void stopThread() {
        running = false; // update visible to all threads immediately
    }

    public static void main(String[] args) throws InterruptedException {

        VolatileDemo t = new VolatileDemo();
        t.start();

        Thread.sleep(2000); // main thread sleeps for 2 seconds

        System.out.println("Main thread changing running to false");
        t.stopThread();
    }
}
