package hexlet.code;

import hexlet.code.Game.IGame;

public class Engine {

    private static final String NAME = Cli.name();
    private static final int ATTEMPT = 3;

    public static void play(IGame game) {
        game.showInstruction();

        int count = 0;
        String playerAnswer;
        String answer;
        boolean allAnswersTrue = true;

        do {
            ++count;

            game.initGame();
            answer = game.getAnswer();
            game.showQuestion();
            playerAnswer = Cli.playerAnswer();

            if (answer.equals(playerAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!\n",
                        playerAnswer, answer, NAME);
                allAnswersTrue = false;
            }

        } while (count < ATTEMPT);

        if (allAnswersTrue) {
            System.out.printf("Congratulations, %s!\n", NAME);
        }
    }
}
