package task3;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ClassInfoViewer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the fully qualified class name: ");
        String className = scanner.nextLine();

        try {
            Class<?> cl = Class.forName(className);

            // Display class information
            System.out.println("Class Name: " + cl.getName());

            // Display class access modifier
            int classModifiers = cl.getModifiers();
            System.out.println("Class Modifiers: " + Modifier.toString(classModifiers));

            // Display constructor information
            Constructor<?>[] constructors = cl.getConstructors();
            System.out.println("Constructors:");
            for (Constructor<?> constructor : constructors) {
                System.out.println("Constructor: " + constructor.getName() + ", Modifiers: " + Modifier.toString(constructor.getModifiers()));
            }

            // Display method information
            Method[] methods = cl.getMethods();
            System.out.println("Methods:");
            for (Method method : methods) {
                System.out.println("Method: " + method.getName() + ", Modifiers: " + Modifier.toString(method.getModifiers()));
            }

            // Display field information
            Field[] fields = cl.getFields();
            System.out.println("Fields:");
            for (Field field : fields) {
                System.out.println("Field: " + field.getName() + ", Modifiers: " + Modifier.toString(field.getModifiers()));
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        }
    }
}

