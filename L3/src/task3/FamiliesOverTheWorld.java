package task3;

import java.util.*;

public class FamiliesOverTheWorld {
    private String country = null;
    private String family = null;

    Map<String, List<String>> familiesOverTheWorld = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public void fillTheMapFamilyOverTheWorld() {
        while (true) {
            System.out.print("Enter the country: ");
            country = sc.nextLine();

            if (country.isEmpty()) {
                System.out.println("You finished adding info.");
                break;
            }

            System.out.print("Enter the family: ");
            family = sc.nextLine();

            // Convert country name to lowercase for comparison
            String lowercaseCountry = country.toLowerCase();
            familiesOverTheWorld.computeIfAbsent(lowercaseCountry, k -> new ArrayList<>()).add(family);

        }
    }

    public void searchFamily() {
        System.out.print("Enter country to search the family there: ");
        String searchCountry = sc.nextLine();
        boolean familyFound = false;

        // Convert all keys to lowercase and search
        for (String country : familiesOverTheWorld.keySet()) {
            if (country.equalsIgnoreCase(searchCountry)) {
                List<String> familiesInTheCountry = familiesOverTheWorld.get(country);
                System.out.println("Families in " + searchCountry + ": " + familiesInTheCountry);
                familyFound = true;
                break;
            }
            if (!familyFound) {
                System.out.println("The family wasn`t found in " + searchCountry+ ".");
            }
        }
    }


    public boolean removeFamily(){
        System.out.print("Enter family to remove from the list: ");
        String searchedFamily = sc.nextLine();
        boolean removed = false;

        for (List<String> familiesInCountry : familiesOverTheWorld.values()) {
            if (familiesInCountry.contains(searchedFamily)) {
                familiesInCountry.remove(searchedFamily);
                removed = true;
                System.out.println("Family " +searchedFamily + " removed from the list.");

                    if (familiesInCountry.isEmpty()) {
                        familiesOverTheWorld.remove(country);
                        System.out.println("Empty country: " + country + " was removed.");}
                break;
            } else {
                System.out.println("Family " + searchedFamily + " not found in the list.");
            }
        }
            return removed;

    }

    public void replaceFamily() {
        System.out.print("Enter the family to replace: ");
        String familyToReplace = sc.nextLine();

        System.out.print("Enter the new country: ");
        String newCountry = sc.nextLine();

        String lowercaseNewCountry = newCountry.toLowerCase();
        String lowercaseOriginalCountry = null;

        // Iterate through countries to find and move the family
        for (String country : familiesOverTheWorld.keySet()) {
            List<String> familiesInCountry = familiesOverTheWorld.get(country);

            if (familiesInCountry.contains(familyToReplace)) {
                lowercaseOriginalCountry = country;
                familiesInCountry.remove(familyToReplace);
                    if (familiesInCountry.isEmpty()) {
                        familiesOverTheWorld.remove(country);
                        System.out.println("Empty country: " + country + " was removed.");}
                break;
            }
        }

        // If the family was found and removed, add it to the new country
        if (lowercaseOriginalCountry != null) {
            familiesOverTheWorld.computeIfAbsent(lowercaseNewCountry, k -> new ArrayList<>()).add(familyToReplace);
            System.out.println("Family " + familyToReplace + " replaced from " + lowercaseOriginalCountry + " to " + lowercaseNewCountry);
        } else {
            System.out.println("Family " + familyToReplace + "  not found.");
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry<String, List<String>> entry : familiesOverTheWorld.entrySet()) {
            String country = entry.getKey();
            List<String> families = entry.getValue();
            stringBuilder.append("Country: ").append(country).append("\n");
            stringBuilder.append("Families: ").append(families).append("\n\n");
        }

        return stringBuilder.toString();
    }
}


