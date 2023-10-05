package input;

import java.util.Scanner;

public class Input {
    private static Scanner input = new Scanner(System.in);

    public static String inputString(){
        return input.nextLine();
    }
}
