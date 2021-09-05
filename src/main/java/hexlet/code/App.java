package hexlet.code;

import hexlet.code.Game.Calc;
import hexlet.code.Game.Even;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    System.out.println("""
            Please enter the game number and press Enter.\s
            1 - Greet\s
            2 - Even\s
            3 - Calc\s
            0 - Exit""");

    Scanner input = new Scanner(System.in);
    System.out.print("Your choice: ");
    int number = input.nextInt();

    switch (number) {
    case 1 -> Cli.name();
    case 2 -> Engine.play(new Even());
    case 3 -> Engine.play(new Calc());
    /*case 4 ->
    case 5 ->
    case 6 -> */
    default -> System.out.println("Exit");
    }
  }
}
