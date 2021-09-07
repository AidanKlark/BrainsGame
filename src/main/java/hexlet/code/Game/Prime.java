package hexlet.code.Game;

import java.math.BigInteger;

public class Prime implements IGame{

    private static final String INSTRUCTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static String answer;
    Integer numbers;

    @Override
    public String getAnswer() {
        return answer;
    }

    @Override
    public void initGame() {
        numbers = IGame.genRandom();
        if (prime(numbers)) {
            answer = YES;
        } else {
            answer = NO;
        }
    }

    @Override
    public void showQuestion() {
        System.out.printf("Question: %d\n", numbers);
    }

    @Override
    public void showInstruction() {
        System.out.println(INSTRUCTION);
    }

    private static boolean prime(int a) {
        BigInteger bigInteger = BigInteger.valueOf(a);
        return bigInteger.isProbablePrime((int) Math.log(a));
    }
}
