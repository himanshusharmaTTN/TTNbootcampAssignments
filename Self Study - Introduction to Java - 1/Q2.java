//Write a program to read user input until user writes XDONE and then show the entered text by the user on command line

import java.util.*;

class Q2
{
    public static void main() {
        Scanner sc= new Scanner(System.in);
        StringBuilder totalText= new StringBuilder();
        boolean flag=true;
        while(flag == true)
        {
            System.out.print("Enter Text: ");
            String i = sc.nextLine();
            if(i.equals("XDONE")) flag=false;
            totalText.append( "\n" +i);
        }
        System.out.println("Entered Text : "+ totalText);
    }
}