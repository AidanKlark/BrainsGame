package hexlet.code.Game;

import hexlet.code.Cli;
import java.util.Random;
import java.util.Scanner;

public class Even {

    static String NAME = Cli.name();
    static String INSTRUCTION = "Answer 'yes' if number even otherwise answer 'no'.";
    static String playerAnswer;
    static String answer;
    static String YES = "yes";
    static String NO = "no";
    static int n = 3;                                                                       //Количество верных ответов
    static int number;

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

            if(answer.equals(playerAnswer)) {
                System.out.println("Correct!");
            }
            else {
                System.out.printf("%s is wrong answer ;(. Correct answer was %s.\n Let's try again, %s!", playerAnswer, answer, NAME);
                allAnswersTrue = false;
            }
        } while (count < n) ;

        if (allAnswersTrue) {
            System.out.printf("Congratulations, %s!", NAME);
        }
    }

    public static String correctAnswer() {

        answer = isEven() ? YES : NO;
        return answer;
    }

    static int genRandom() {

        Random random = new Random();
        return random.nextInt(100 + 1);
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
