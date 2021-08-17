package hexlet.code.Game;

import hexlet.code.Cli;
import java.util.Random;
import java.util.Scanner;

public class Even {

    String right;

    Random random = new Random();
    int a = Integer.valueOf(random.nextInt(100 + 1));

    public static void even(String right, int a) {

        Cli.name();

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        System.out.println("Question: " + a);

        Scanner scanner = new Scanner(System.in);
        String ans = scanner.nextLine();
        System.out.println("Your answer: " + ans);

        Even.answer();

        if (right.equals(ans)) {
            System.out.print("Correct!");
            System.out.print("Congratulations, " + Cli.name() + "!");
        } else {
            System.out.printf("'%d' is wrong answer ;(. Correct answer was '%d'.", ans, right);
            System.out.println("Question: " + a);
        }
    }

    private static String answer(int a, String right) {

            if (a % 2 == 0) {
                right = "yes";
            }
            else
                right = "no";

            return right;
    }
}
