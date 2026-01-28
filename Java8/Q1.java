// Q1. Write the following a functional interface and implement it using lambda:
//
//1. To check whether the first number is greater than second number or not, Parameter (int ,int ) Return type boolean
//2. Increment the number by 1 and return incremented value Parameter (int) Return int
//3. Concatination of 2 string Parameter (String , String ) Return (String)
//4. Convert a string to uppercase and return . Parameter (String) Return (String)

@FunctionalInterface
interface GreaterCheck {
    boolean isGreater(int a, int b);
}

@FunctionalInterface
interface Increment {
    int inc(int a);
}

@FunctionalInterface
interface Concat {
    String join(String s1, String s2);
}

@FunctionalInterface
interface ToUpper {
    String convert(String s);
}

 class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        GreaterCheck gc = (a,b)-> a>b;
        System.out.println(gc.isGreater(5,6));

        Increment i= x->x+1;
        System.out.println(i.inc(5));

        Concat c= (s1,s2)->s1+s2;
        System.out.println(c.join("Himanshu","Sharma"));

        ToUpper t= s->s.toUpperCase();
        System.out.println(t.convert("hii"));
    }
}