package hexlet.code.Game;

public class Calc implements IGame {
    private static final String INSTRUCTION = "What is the result of the expression?";
    private static final String ADDITION = "+";
    private static final String SUBTRACTION = "-";
    private static final String MULTIPLICATION = "*";

    private static String randOper;
    private static int num1;
    private static int num2;
    private static int numbers;
    private static String answer;

    @Override
    public final String getAnswer() {
        return answer;
    }

    @Override
    public final void initGame() {
        num1 = IGame.genRandom();
        num2 = IGame.genRandom();
        randOper = randCalculation();
        answer = Integer.toString(calculation());
    }

    @Override
    public final void showQuestion() {
        System.out.printf("Question: %d %s %d\n", num1, randOper, num2);
    }

    @Override
    public final void showInstruction() {
        System.out.println(INSTRUCTION);
    }

    private static String randCalculation() {
        String[] operation = new String[] {"+", "-", "*"};

        randOper = operation[IGame.genRandom() % operation.length];
        return randOper;
    }

    private static int calculation() {

        if (randOper.equals(ADDITION)) {
            numbers = num1 + num2;
        }

        if (randOper.equals(SUBTRACTION)) {
            numbers = num1 - num2;
        }

        if (randOper.equals(MULTIPLICATION)) {
            numbers = num1 * num2;
        }

        return numbers;
    }
}
