package task3;

public class Main {
    public static void main(String[] args) {
        FamiliesOverTheWorld yakovenkosFriends = new FamiliesOverTheWorld();
        yakovenkosFriends.fillTheMapFamilyOverTheWorld();
        System.out.println(yakovenkosFriends.toString());

        yakovenkosFriends.searchFamily();
        yakovenkosFriends.removeFamily();
        System.out.println(yakovenkosFriends.toString());

        yakovenkosFriends.replaceFamily();
        System.out.println(yakovenkosFriends.toString());

    }

}