package hexlet.code.Game;

public class Even implements IGame {

    private static final String INSTRUCTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static int number;
    private static String answer;

    public static boolean isEven() {
        return number % 2 == 0;
    }

    @Override
    public final String getAnswer() {
        return answer;
    }

    @Override
    public final void initGame() {
        number = IGame.genRandom();
        answer = isEven() ? YES : NO;
    }

    @Override
    public final void showInstruction() {
        System.out.println(INSTRUCTION);
    }

    @Override
    public final void showQuestion() {
        System.out.printf("Question: %d\n", number);
    }
}
