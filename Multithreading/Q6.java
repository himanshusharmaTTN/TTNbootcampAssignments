// Q6. Improve the code written in Basics of Multi Threading Part 1 exercise question 4 to handle the deadlock using reentract lock.

import java.util.concurrent.locks.ReentrantLock;

class DeadlockHandled {

    static ReentrantLock lock1 = new ReentrantLock();
    static ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            try {
                if (lock1.tryLock()) {
                    System.out.println("Thread-1 acquired lock1");

                    Thread.sleep(100);

                    if (lock2.tryLock()) {
                        try {
                            System.out.println("Thread-1 acquired lock2");
                            System.out.println("Thread-1 completed work");
                        } finally {
                            lock2.unlock();
                        }
                    }
                    lock1.unlock();
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                // try acquiring both locks
                if (lock2.tryLock()) {
                    System.out.println("Thread-2 acquired lock2");

                    Thread.sleep(100);

                    if (lock1.tryLock()) {
                        try {
                            System.out.println("Thread-2 acquired lock1");
                            System.out.println("Thread-2 completed work");
                        } finally {
                            lock1.unlock();
                        }
                    }
                    lock2.unlock();
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        t1.start();
        t2.start();
    }
}
