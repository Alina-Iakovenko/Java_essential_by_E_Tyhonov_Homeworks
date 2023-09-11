package task1;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal(AnimalSpecies.MAMMAL, 10, "Ashe");

        File cat_Ashe_info = new File("D:\\StudyingIT\\ITVDN\\Java with Evgen Tihonov\\Java proffessional\\L9\\src\\task1\\cat_Ashe_info.txt");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(cat_Ashe_info));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(cat_Ashe_info))) {

            oos.writeObject(cat);

            Animal ashe = (Animal) ois.readObject();
            System.out.println(ashe);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
