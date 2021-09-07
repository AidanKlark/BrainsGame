package hexlet.code;

import hexlet.code.Game.*;
import java.util.Scanner;

public class App {

  public static final int GREET = 1;
  public static final int EVEN = 2;
  public static final int CALC = 3;
  public static final int GCD = 4;
  public static final int PROGRESSION = 5;
  public static final int PRIME = 6;

  public static void main(String[] args) {

    System.out.println("""
            Please enter the game number and press Enter.\s
            1 - Greet\s
            2 - Even\s
            3 - Calc\s
            4 - GCD\s
            5 - PROGRESSION\s
            6 - PRIME\s
            0 - Exit""");

    Scanner input = new Scanner(System.in);
    System.out.print("Your choice: ");
    int number = input.nextInt();

    switch (number) {
      case GREET -> Cli.name();
      case EVEN -> Engine.play(new Even());
      case CALC -> Engine.play(new Calc());
      case GCD -> Engine.play(new GCD());
      case PROGRESSION -> Engine.play(new Progression());
      case PRIME -> Engine.play(new Prime());
      default -> System.out.println("Exit");
    }
  }
}
