package task3;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int n = sc.nextInt();

        LinkedList<Integer> integerList = getIntegerList(n);

        System.out.println(integerList);
        System.out.println(getMinimum(integerList));
    }
    public static LinkedList<Integer> getIntegerList(int n) {
        LinkedList<Integer> creatingIntegerList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            creatingIntegerList.add(i);
        }
        return creatingIntegerList;
    }
    public static int getMinimum(LinkedList<Integer> someIntegerList){
//        int minValue = someIntegerList.get(0);
//        for (int i = 1; i < someIntegerList.size(); i++) {
//            if (someIntegerList.get(i) < minValue) {
//                minValue = someIntegerList.get(i);
//            }
//        }
//        return minValue;
        return someIntegerList.get(0); /* because of the way of creating this list ;) */

    }

}

