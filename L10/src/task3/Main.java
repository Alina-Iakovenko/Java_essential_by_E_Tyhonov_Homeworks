package task3;

public class Main {
    public static void main(String[] args) {

        Eagle firstEagle = new Eagle("Golden Eagle", 5, "name");

        try {
            Eagle cloneEagle = (Eagle) firstEagle.clone();
            System.out.println(firstEagle);
            System.out.println(cloneEagle);

            cloneEagle.setName("Robert");

            System.out.println("After cloning");

            System.out.println(firstEagle);
            System.out.println(cloneEagle);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
