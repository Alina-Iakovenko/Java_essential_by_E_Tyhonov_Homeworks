package task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String country = null;
        String family = null;

        Scanner sc = new Scanner(System.in);

        Map<String, String> familiesInCountries = new HashMap<String, String>();
        while (true) {
            System.out.print("Enter the country: ");
            country = sc.nextLine();

            if (country.isEmpty()) {
                System.out.println("You finished adding info.");
                break;
            }

            System.out.print("Enter the family: ");
            family = sc.nextLine();

            familiesInCountries.put(country, family);
        }

        System.out.println("Enter the country to search family there: ");
        country = sc.nextLine();

        if (familiesInCountries.containsKey(country)) {
            family = familiesInCountries.get(country);
            System.out.println("Family in " + country + ": " + family);
        } else {
            System.out.println("No family found in " + country);
        }
    }

}