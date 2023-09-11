package additionalTask;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listOfStrings = new ArrayList<String>() {
        };
        Scanner sc = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter your string (or 'end' to stop) :");
            input = sc.nextLine();
            listOfStrings.add(input);
        }
        while (!input.equalsIgnoreCase("end"));

        System.out.println("Strings entered:");
        for (String string : listOfStrings) {
            if (!string.equalsIgnoreCase("end")) {
                System.out.println(string);
            }
        }
    }
}
