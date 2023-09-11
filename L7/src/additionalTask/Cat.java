package additionalTask;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


public class Cat extends Animal{
    public static void main(String[] args) {
        try {
            Class<?> cl = Class.forName("additionalTask.Animal");

            // Display class information
            System.out.println("Class Name: " + cl.getName());

            // Display class access modifier
            int classModifiers = cl.getModifiers();

            Animal animalInstance = new Cat();

            Field[] fields = cl.getDeclaredFields();
            System.out.println("Fields:");
            for (Field field : fields) {
                field.setAccessible(true); // Enable access to private fields
                System.out.println("Field (" + field.getName() + "): " + field.get(animalInstance) + ", Modifiers: " + Modifier.toString(field.getModifiers()));

                // Modify the content of the field
                if (field.getType() == String.class) {
                    field.set(animalInstance, "Kitty"); // Change the value of the field
                } else if (field.getType() == int.class) {
                    field.setInt(animalInstance, 5); // Change the value of the field
                } else if (field.getType() == boolean.class) {
                    field.setBoolean(animalInstance, true); // Change the value of the field
                }

            }
                // Display modified field values
//                System.out.println("Modified Field Values:");
//                System.out.println("Name: " + animalInstance.getName());
//                System.out.println("Age: " + animalInstance.getAge());
//                System.out.println("Can Sing: " + animalInstance.canSing());

            // Display modified field values directly using reflection
            System.out.println();
            System.out.println("Modified Field Values:");
            System.out.println("Class Name: " + cl.getName());
            for (Field field : fields) {
                field.setAccessible(true);
                System.out.println(field.getName() + ": " + field.get(animalInstance));
            }

        } catch (ClassNotFoundException | IllegalAccessException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
