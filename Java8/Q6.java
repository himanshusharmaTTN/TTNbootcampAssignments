//  Q6. Create and access default and static method of an interface.

interface MyInterface {

    void display();

    default void show() {
        System.out.println("default method ");
    }

    static void info() {
        System.out.println("static method");
    }
}
class MyClass implements MyInterface {

    public void display() {
        System.out.println("Display method implemented in class");
    }

    public void show() {
        System.out.println("Default method overridden in class");
    }
}

class InterfaceDemo {

    public static void main(String[] args) {

        MyInterface obj = new MyClass();

        // accessing abstract method
        obj.display();

        // accessing default method (through object)
        obj.show();

        // accessing static method (through interface name)
        MyInterface.info();
    }
}
