package hexlet.code.Game;

public class Prime implements IGame {

    private static final String INSTRUCTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static String answer;
    private Integer numbers;

    @Override
    public final String getAnswer() {
        return answer;
    }

    @Override
    public final void initGame() {
        numbers = IGame.genRandom();
        answer = prime() ? YES : NO;
    }

    @Override
    public final void showQuestion() {
        System.out.printf("Question: %d\n", numbers);
    }

    @Override
    public final void showInstruction() {
        System.out.println(INSTRUCTION);
    }

    private boolean prime() {
        if (numbers < 2) {
            return false;
        }

        for (int i = 2; i < numbers; i++) {
            if (numbers % i == 0) {
                return false;
            }
        }

        return true;
    }
}
