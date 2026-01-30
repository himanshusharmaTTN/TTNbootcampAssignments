// Q1.Create and Run a Thread using Runnable Interface and Thread class and show usage of sleep and join methods in the created threads.
class MThread extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " - Value: " + i);
                Thread.sleep(1000); // sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " - Value: " + i);
                Thread.sleep(1000); // sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

 class MultithreadingDemo {

    public static void main(String[] args) {

        MyRunnable runnableObj = new MyRunnable();
        Thread thread1 = new Thread(runnableObj, "Runnable-Thread");

        MThread thread2 = new MThread();
        thread2.setName("Thread-Class-Thread");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main thread execution completed");
    }
}

