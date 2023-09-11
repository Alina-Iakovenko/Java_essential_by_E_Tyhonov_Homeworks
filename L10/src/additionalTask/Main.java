package additionalTask;

import java.io.*;

class Engine implements Serializable {
    private int horsepower;

    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsepower=" + horsepower +
                '}';
    }
}

class Car implements Serializable, Cloneable {
    private String make;
    private int year;
    private Engine engine;

    public Car(String make, int year, int engineHorsepower) {
        this.make = make;
        this.year = year;
        this.engine = new Engine(engineHorsepower);
    }

    public void start() {
        System.out.println("The car is starting...");
    }

    public void accelerate() {
        System.out.println("The car is accelerating...");
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
        return "Car{" +
                "make='" + make + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Car originalCar = new Car("Toyota", 2022, 200);
        Car shallowClone = null;
        Car deepClone = null;

        try {
            shallowClone = (Car) originalCar.clone();
            deepClone = (Car) originalCar.clone();
            deepClone.engine = (Engine) originalCar.engine.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Original Car: " + originalCar);
        System.out.println("Shallow Clone: " + shallowClone);
        System.out.println("Deep Clone: " + deepClone);
    }
}

