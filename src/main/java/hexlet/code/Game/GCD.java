package hexlet.code.Game;

public class GCD implements IGame {
    private static final String INSTRUCTION = "Find the greatest common divisor of given numbers.";
    private static int num1;
    private static int num2;
    private static String answer;

    @Override
    public final String getAnswer() {
        return answer;
    }

    @Override
    public final void initGame() {
        num1 = IGame.genRandom();
        num2 = IGame.genRandom();
        answer = Integer.toString(findGCD(num1, num2));
    }

    @Override
    public final void showQuestion() {
        System.out.printf("Question: %d %d\n", num1, num2);
    }

    @Override
    public final void showInstruction() {
        System.out.println(INSTRUCTION);
    }

    private int findGCD(int a, int b) {

        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
