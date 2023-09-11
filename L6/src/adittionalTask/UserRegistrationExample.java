package adittionalTask;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your login (only Latin alphabet characters): ");
        String login = scanner.nextLine();

        if (isValidLogin(login)) {
            System.out.print("Enter your password (digits and symbols only): ");
            String password = scanner.nextLine();

            if (isValidPassword(password)) {
                System.out.println("Registration successful!");
            } else {
                System.out.println("Invalid password format.");
            }
        } else {
            System.out.println("Invalid login format.");
        }
    }

    // Validate login (Latin alphabet characters)
    private static boolean isValidLogin(String login) {
        String regex = "^[a-zA-Z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(login);
        return matcher.matches();
    }

    // Validate password (digits and symbols)
    private static boolean isValidPassword(String password) {
        String regex = "^[0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>?]+$"; //??????? ChatGPT wrote, but I can`t understand
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}

