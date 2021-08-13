package hexlet.code;

public class App {
  public static void main(String[] args) {

    System.out.println("Please enter the game number and press Enter.");


    System.out.println("Welcome to the Brain Games!");

    System.out.print("May I have your name? ");

    String nm = Cli.name();
    System.out.println("Hello, " + nm + "!");
  }
}
