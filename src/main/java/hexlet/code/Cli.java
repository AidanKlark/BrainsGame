package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static String name() {

        System.out.print("Welcome to the Brain Games!" + "\n" + "May I have your name? ");

        Scanner cr = new Scanner(System.in);
        String name = cr.nextLine();

        System.out.println("Hello, " + name + "!");

        return name;
    }

    public static String playerAnswer() {
        System.out.print("Your answer: ");
        return new Scanner(System.in).nextLine();
    }
}
