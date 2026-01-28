// Q1: Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)

enum House {

    HUT(5_00_000),
    APARTMENT(25_00_000),
    VILLA(80_00_000),
    BUNGALOW(1_50_00_000);

    private int price;

    // Constructor (automatically called)
    House(int price) {
        this.price = price;
    }

    // Getter method
    public int getPrice() {
        return price;
    }
}

public class Assignment2Q1 {
    public static void main(String[] args) {

        System.out.println("House Types and Their Prices:\n");

        for (House h : House.values()) {
            System.out.println(h + " costs Rs. " + h.getPrice());
        }
    }
}
