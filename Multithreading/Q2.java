// Q2. Use Synchronize method and synchronize block to enable synchronization between multiple threads trying to access method at same time.

class SharedResource {

    private int balance = 1000;

    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " trying to withdraw " + amount);

        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Balance left: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void printDocument(String docName) {

        System.out.println(Thread.currentThread().getName() + " preparing document");

        synchronized (this) { // synchronized block
            System.out.println(Thread.currentThread().getName() + " printing " + docName);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished printing");
    }
}

class MyThread extends Thread {

    SharedResource resource;

    MyThread(SharedResource resource, String name) {
        super(name);
        this.resource = resource;
    }

    @Override
    public void run() {

        // calling synchronized method
        resource.withdraw(700);

        // calling method having synchronized block
        resource.printDocument("Assignment.pdf");
    }
}

class SynchronizationDemo {

    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        MyThread t1 = new MyThread(resource, "Thread-1");
        MyThread t2 = new MyThread(resource, "Thread-2");

        t1.start();
        t2.start();
    }
}
