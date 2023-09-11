package task1;

import java.io.Serializable;
import java.util.Scanner;

public class Animal implements Serializable {
    private AnimalSpecies type;
    private int age;
    private String name;


    public Animal() {
    }
    public Animal(AnimalSpecies type, int age, String name) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    private int costOfMaintenance(){
        return this.age * 12 * type.getAverageCostPerMonth();
    }

    @Override
    public String toString(){
        return  "It`s a " + type + ". \n" +
                "It's name is " + name + ". \n" +
                name + " is " + age + " years old. \n" +
                "Typicaly " + type + " eat " + type.getTypicalFood() +
                ", and  we spend nearly $" + costOfMaintenance() + " for it`s meal.";
    }


}
