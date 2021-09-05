package hexlet.code.Game;

public class Even implements IGame{

    private static final String INSTRUCTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static int number;
    private static String answer;

    public static boolean isEven() {
        return number % 2 == 0;
    }

    @Override
    public String getAnswer() {
        return answer;
    }

    @Override
    public void initGame() {
        number = IGame.genRandom();
        answer = isEven() ? YES : NO;
    }

    @Override
    public void showInstruction() {
        System.out.println(INSTRUCTION);
    }

    @Override
    public void showQuestion() {
        System.out.printf("Question: %d\n", number);
    }
}
