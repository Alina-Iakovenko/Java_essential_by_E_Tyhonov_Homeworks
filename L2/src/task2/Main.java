package task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listOfStrings= new ArrayList<String>() {
        };
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your word:");
            listOfStrings.add(sc.nextLine());
        }

        doubleValues(listOfStrings);

        for (String string : listOfStrings) {
            System.out.println(string);
        }
    }

    public static void doubleValues(ArrayList<String> arrList) {
        ArrayList<String> doubledList = new ArrayList<>();
        for (String originalString : arrList) {
            doubledList.add(originalString);
            doubledList.add(originalString);
        }
        arrList.clear();
        arrList.addAll(doubledList);
    }
}