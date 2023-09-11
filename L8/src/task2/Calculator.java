package task2;

import task2.anotattions.Documentation;

public class Calculator {

    private double result;

    @Documentation(value = "Adds two numbers")
    @MathAnnotation()
    public double add(double a, double b) {
        result = a + b;
        return result;
    }

    @Documentation(value = "Subtracts one number from another")
    @MathAnnotation()
    public double subtract(double a, double b) {
        result = a - b;
        return result;
    }

    @Documentation(value = "Multiplies two numbers")
    @MathAnnotation()
    public double multiply(double a, double b) {
        result = a * b;
        return result;
    }

    @Documentation(value = "Divides one number by another")
    @MathAnnotation()
    public double divide(double a, double b) {
        if (b != 0) {
            result = a / b;
        } else {
            throw new IllegalArgumentException("Division by zero");
        }
        return result;
    }
}
