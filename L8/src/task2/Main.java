package task2;

import java.lang.reflect.*;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        String operation = scanner.next();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        try {
            Method method = calculator.getClass().getMethod(operation, double.class, double.class);
            if (method.isAnnotationPresent(MathAnnotation.class)) {
                MathAnnotation mathAnnotation = method.getAnnotation(MathAnnotation.class);


                double result = (double) method.invoke(calculator, num1, num2);
                System.out.println("Result: " + result);
            } else {
                System.out.println("Invalid operation");
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
