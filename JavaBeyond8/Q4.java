// Q4. Demonstrate the use of repeat(), strip(),trim(), isBlank(), indent(), transform(), stripIndent(), translateEscapes(),tripleQuotes and formatted() methods.

 class Ques4 {
    public static void main(String[] args) {

        // repeat(), strip(), trim()
        String str = "   Hello \" Rohit Rawat   ";
        System.out.println("Original: [" + str + "]");

        System.out.println("repeat(): " + str.repeat(2));
        System.out.println("strip(): [" + str.strip() + "]");
        System.out.println("trim(): [" + str.trim() + "]");

        String spaceString = " \t \n ";
        System.out.println("isBlank(): " + spaceString.isBlank());

        String indentStr = "Hello Indent";
        System.out.println("indent():\n" + indentStr.indent(10));

        String number = "1234";
        int converted = number.transform(Integer::parseInt);
        System.out.println("transform(): " + converted);

        String textBlock = """
                Hello
                    Java
                StripIndent
                """;
        System.out.println("Before stripIndent():\n" + textBlock);
        System.out.println("After stripIndent():\n" + textBlock.stripIndent());

        String escapeStr = "Hello\\nJava\\tWorld\\\"";
        System.out.println("Before translateEscapes(): " + escapeStr);
        System.out.println("After translateEscapes():");
        System.out.println(escapeStr.translateEscapes());

        String name = "Himanshu Sharma";
        int age = 25;
        String formattedStr =
                "Name = %s and Age = %d".formatted(name, age);
        System.out.println("formatted(): " + formattedStr);
    }
}
