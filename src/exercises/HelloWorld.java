package exercises;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What shall I call you:");
        String name = input.nextLine();
        System.out.println("Greetings, " + name);

    }
}
