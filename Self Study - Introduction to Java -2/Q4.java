

import java.util.Scanner;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class ShapeFactory {

    public static Shape getShape(String type) {

        if (type == null) return null;

        if (type.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        else if (type.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        else if (type.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }
}


 class FactoryDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter shape name (CIRCLE / RECTANGLE / SQUARE): ");
        String input = sc.nextLine();

        Shape shape = ShapeFactory.getShape(input);

        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Invalid shape type");
        }

        sc.close();
    }
}
