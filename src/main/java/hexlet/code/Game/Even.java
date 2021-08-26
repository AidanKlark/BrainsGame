package hexlet.code.Game;

import hexlet.code.Cli;
import java.util.Random;
import java.util.Scanner;

public class Even {

    private static final String NAME = Cli.name();
    private static final String INSTRUCTION = "Answer 'yes' if number even otherwise answer 'no'.";
    private static String playerAnswer;
    private static String answer;
    private static String yes = "yes";
    private static String no = "no";
    private static final int ATTEMPT = 3;
    private static int number;
    private static final int MAX_NUMBER = 100;

    public static void even() {

        System.out.println(INSTRUCTION);
        conclusion();

    }

    public static void conclusion() {

        int count = 0;
        boolean allAnswersTrue = true;

        do {
            ++count;

            number = genRandom();
            showQuestion();
            answer = correctAnswer();
            playerAnswer = task();

            if (answer.equals(playerAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("%s is wrong answer ;(. Correct answer was %s.\n Let's try again, %s!",
                        playerAnswer, answer, NAME);
                allAnswersTrue = false;
            }
        } while (count < ATTEMPT);

        if (allAnswersTrue) {
            System.out.printf("Congratulations, %s!", NAME);
        }
    }

    public static String correctAnswer() {

        answer = isEven() ? yes : no;
        return answer;
    }

    static int genRandom() {

        Random random = new Random();
        return random.nextInt(MAX_NUMBER + 1);
    }

    public static String task() {

        System.out.print("Your answer: ");
        return new Scanner(System.in).nextLine();
    }

    public static boolean isEven() {

        return number % 2 == 0;
    }

    public static void showQuestion() {

        System.out.printf("Question: %s\n", number);
    }
}
