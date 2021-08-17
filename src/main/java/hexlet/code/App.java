package hexlet.code;

import hexlet.code.Game.Even;
import java.util.Scanner;


public class App {

  public static void main(String[] args) {

    System.out.println("Please enter the game number and press Enter. \n" + "1 - Greet \n" + "2 - Even \n" + "0 - Exit");

    Scanner input = new Scanner(System.in);
    int number = input.nextInt();

    switch (number)
    {
    case 1 -> Cli.name();
    case 2 -> Even.even();
    /*case 3 ->
    case 4 ->
    case 5 ->
    case 6 -> */
    default -> System.out.println("Exit");
    }
  }
}
