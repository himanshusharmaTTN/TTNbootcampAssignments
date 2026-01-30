// Q5.WAP to show usage of Callable and demonstrate how it is different from Runnable

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class RunnableTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable task is running");
    }
}

class CallableTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("Callable task is running");
        return 10 + 20; // returning result
    }
}

 class CallableVsRunnable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        RunnableTask runnableTask = new RunnableTask();
        executor.execute(runnableTask);

        CallableTask callableTask = new CallableTask();
        Future<Integer> future = executor.submit(callableTask);

        Integer result = future.get();
        System.out.println("Result returned by Callable: " + result);

        executor.shutdown();
    }
}
