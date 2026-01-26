//Q9: Create a custom exception that do not have any stack trace.

public class Q9 {

    // Custom exception without stack trace
    static class NoStackTraceException extends Exception {

        public NoStackTraceException(String message) {
            // last 'false' = writableStackTrace disabled
            super(message, null, false, false);
        }
    }

    public static void main(String[] args) {

        try {
            throw new NoStackTraceException("This is a custom exception without stack trace.");
        }
        catch (NoStackTraceException e) {
            System.out.println("Custom Exception Caught:");
            System.out.println(e.getMessage());

            System.out.println("\nPrinting exception:");
            e.printStackTrace();   // stack trace will NOT appear
        }
    }
}
