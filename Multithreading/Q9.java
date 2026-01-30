// Q9. WAP to showcase the difference between shutdown() and shutdownNow().

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {

    private final int taskId;

    Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        try {
            System.out.println("Task " + taskId + " started by "
                    + Thread.currentThread().getName());
            Thread.sleep(2000);
            System.out.println("Task " + taskId + " completed");
        } catch (InterruptedException e) {
            System.out.println("Task " + taskId + " interrupted");
        }
    }
}

 class ShutdownDemo {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 1; i <= 5; i++) {
            executor.submit(new Task(i));
        }

        Thread.sleep(1000);

        // executor.shutdown();
        executor.shutdownNow();
    }
}
