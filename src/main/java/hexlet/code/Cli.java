package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static String Name() {

        Scanner cr = new Scanner(System.in);

        String name = cr.nextLine();
        return name;

    }
}
