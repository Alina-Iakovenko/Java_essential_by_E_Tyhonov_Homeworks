package task2;

public class Main {
    public static void main(String[] args) {
        Bird originalBird = new Bird("Robin", 2);
        Bird clonedBird = null;

        try {
            clonedBird = (Bird) originalBird.clone();
            clonedBird.setAge(3); // Modify age in the cloned object
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Original Bird: " + originalBird);
        System.out.println("Cloned Bird: " + clonedBird);
    }
}