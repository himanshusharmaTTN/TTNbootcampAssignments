// Q8. Write a program to showcase the use of optional class

import java.util.Optional;

class Userr {
    private String name;

    public Userr(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

 class OptionalDemo {

    public static String getUserName(Userr user) {
        if (user == null) return null;
        return user.getName();
    }

    public static void main(String[] args) {

        Userr u1 = new Userr("Himanshu");
        Userr u2 = new Userr(null);
        Userr u3 = null;

        Optional<String> op1 = Optional.ofNullable(getUserName(u1));
        Optional<String> op2 = Optional.ofNullable(getUserName(u2));

        op1.ifPresent(n -> System.out.println("Name: " + n));

        System.out.println("User2 name: " + op2.orElse("Default Name"));

        Optional<Integer> len = op1.map(String::length);
        System.out.println("Length of name: " + len.orElse(0));
        Optional<Integer> len2 = op2.map(String::length);
        System.out.println("Length of name: " + len2.orElse(0));

    }
}
