// Q5. Write a program to show application of Singleton Design Pattern.

class DatabaseConnection {

    private static DatabaseConnection instance;
    private DatabaseConnection() {              // private Constructor so that default contructor call hi na ho
        System.out.println("DatabaseConnection object created");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    public void connect() {
        System.out.println("Connected to database using object: " + this.hashCode());
    }
}

 class SingletonDemo {

    public static void main(String[] args) {

        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.connect();

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.connect();

        DatabaseConnection db3 = DatabaseConnection.getInstance();
        db3.connect();

        if (db1 == db2 && db2 == db3) {
            System.out.println("All references point to SAME object (Singleton confirmed)");
        } else {
            System.out.println("Different objects created");
        }
    }
}
