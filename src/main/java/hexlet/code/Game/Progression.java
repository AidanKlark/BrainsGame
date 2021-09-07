package hexlet.code.Game;

public class Progression implements IGame {

    private static final String INSTRUCTION = "What number is missing in the progression?";
    private static final int LENGTH = 10;
    private static final int[] PROGRESSION = new int[LENGTH];

    private int element;
    private static String answer;

    @Override
    public final String getAnswer() {
        return answer;
    }

    @Override
    public final void initGame() {
        PROGRESSION[0] = IGame.genRandom();
        PROGRESSION[1] = PROGRESSION[1] + IGame.genRandom();
        int a = PROGRESSION[1] - PROGRESSION[0];
        for (int i = 2; i < LENGTH; i++) {
            PROGRESSION[i] = PROGRESSION[i - 1] + a;
        }

        element = PROGRESSION[IGame.genRandom() % LENGTH];
        answer = Integer.toString(element);
    }

    @Override
    public final void showQuestion() {
        System.out.print("Question: ");

        for (int i = 0; i < LENGTH; i++) {
            if (PROGRESSION[i] == element) {
                System.out.print(".. ");
            } else {
                System.out.printf("%d ", PROGRESSION[i]);
            }
        }
        System.out.println();
    }

    @Override
    public final void showInstruction() {
        System.out.println(INSTRUCTION);
    }
}
