// Q8. WAP to return a random integer value from a thread execution using Future.

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class RandomNumberTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        int number = random.nextInt(100); // random number between 0-99
        System.out.println("Generated number in thread: " + number);
        return number;
    }
}

 class FutureDemo {

    public static void main(String[] args)
            throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> future = executor.submit(new RandomNumberTask());

        Integer result = future.get(); // waits if result not ready
        System.out.println("Random number received in main thread: " + result);

        executor.shutdown();
    }
}

