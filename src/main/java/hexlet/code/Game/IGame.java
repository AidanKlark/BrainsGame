package hexlet.code.Game;

import java.util.Random;

public interface IGame {

    int MAX_NUMBER = 100;
    String YES = "yes";
    String NO = "no";

    String getAnswer();
    void initGame();
    void showQuestion();
    void showInstruction();

    static int genRandom() {
        Random random = new Random();
        return random.nextInt(MAX_NUMBER + 1);
    }
}
