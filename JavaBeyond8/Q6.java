// Q6. Use a Sealed class Class concept to create a class hierarchy.
//     Mark Child classes as final, sealed, and non sealed and observe their behavior

sealed class Calculatrr permits Addition, Subtraction, Multiplication {

    public void calculate() {
        System.out.println("Calculating...");
    }
}
final class Addition extends Calculatrr {
    public void add(int a, int b) {
        System.out.println(a + b);
    }
}
sealed class Subtraction extends Calculatrr permits AdvancedSubtraction {
    public void sub(int a, int b) {
        System.out.println(a - b);
    }
}
non-sealed class Multiplication extends Calculatrr {
    public void multiply(int a, int b) {
        System.out.println(a * b);
    }
}

final class AdvancedSubtraction extends Subtraction {
    public void sub(int a, int b, int c) {
        System.out.println(a - b - c);
    }
}

 class Ques6 {
    public static void main(String[] args) {
        Calculatrr c1 = new Addition();
        Calculatrr c2 = new Subtraction();
        Calculatrr c3 = new Multiplication();

        ((Addition) c1).add(11, 6);
        ((Subtraction) c2).sub(12, 6);
        ((Multiplication) c3).multiply(8, 5);

    }
}