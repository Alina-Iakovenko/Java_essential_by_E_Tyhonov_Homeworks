package task2;

import java.io.*;

public class Bird implements Serializable, Cloneable {
    private static String species = "Unknown";
    private final String name;
    private transient int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void fly() {
        System.out.println(name + " is flying!");
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            // Serialize the object
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            // Deserialize the object
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Bird{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

