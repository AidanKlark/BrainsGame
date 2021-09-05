package hexlet.code.Game;

public class Calc implements IGame {
    private static final String INSTRUCTION = "What is the result of the expression?";

    private static String randOper;
    private static int num1;
    private static int num2;
    private static final String addition = "+";
    private static final String subtraction = "-";
    private static final String multiplication = "*";
    private static int numbers;
    private static String answer;

    @Override
    public String getAnswer() {
        return answer;
    }

    @Override
    public void initGame() {
        num1 = IGame.genRandom();
        num2 = IGame.genRandom();
        randOper = randCalculation();
        answer = Integer.toString(calculation());
    }

    @Override
    public void showQuestion() {
        System.out.printf("Question: %d %s %d\n", num1, randOper ,num2);
    }

    @Override
    public void showInstruction() {
        System.out.println(INSTRUCTION);
    }

    public static String randCalculation() {
        String[] operation = new String[] {"+","-","*"};

        randOper = operation[IGame.genRandom() % operation.length];
        return randOper;
    }

    public static int calculation() {

        if (randOper.equals(addition)) {
            numbers = num1 + num2;
        }

        if (randOper.equals(subtraction)) {
            numbers = num1 - num2;
        }

        if (randOper.equals(multiplication)) {
            numbers = num1 * num2;
        }

        return numbers;
    }
}
