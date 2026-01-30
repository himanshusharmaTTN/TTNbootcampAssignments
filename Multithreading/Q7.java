// Q7. Use a singleThreadExecutor, newCachedThreadPool() and newFixedThreadPool() to submit a list of tasks and wait for completion of all tasks.

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

 class Executor {

    static Callable<String> createTask(int taskId) {
        return () -> {
            System.out.println(Thread.currentThread().getName()
                    + " executing Task-" + taskId);
            Thread.sleep(1000);
            return "Task-" + taskId + " completed";
        };
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        List<Callable<String>> tasks = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            tasks.add(createTask(i));
        }

        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        System.out.println("\n--- SingleThreadExecutor ---");
        List<Future<String>> singleResults = singleThreadExecutor.invokeAll(tasks);

        for (Future<String> f : singleResults) {
            System.out.println(f.get());
        }
        singleThreadExecutor.shutdown();

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        System.out.println("\n--- CachedThreadPool ---");
        List<Future<String>> cachedResults = cachedThreadPool.invokeAll(tasks);

        for (Future<String> f : cachedResults) {
            System.out.println(f.get());
        }
        cachedThreadPool.shutdown();

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        System.out.println("\n--- FixedThreadPool ---");
        List<Future<String>> fixedResults = fixedThreadPool.invokeAll(tasks);

        for (Future<String> f : fixedResults) {
            System.out.println(f.get());
        }
        fixedThreadPool.shutdown();
    }
}
