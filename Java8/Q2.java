// Q2. Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference create
//     and apply multiplication method for the functional interface created

@FunctionalInterface
interface Operation {
    int operate(int a, int b);
}

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}

 class MethodReference {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        Operation addFunc = calc::add;

        Operation subFunc = calc::subtract;

        Operation mulFunc = Calculator::multiply;

        System.out.println("Add = " + addFunc.operate(10, 5));
        System.out.println("Subtract = " + subFunc.operate(10, 5));
        System.out.println("Multiply = " + mulFunc.operate(10, 5));
    }
}
