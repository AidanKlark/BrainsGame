package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static String name() {

        Scanner cr = new Scanner(System.in);

        String name = cr.nextLine();

        return name;
    }
}
