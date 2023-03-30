public class Calculator {
    private double num1;
    private double num2;

    Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    double add() {
        return num1 + num2;
    }

     double subtract() {
        return num1 - num2;
    }

     double multiply() {
        return num1 * num2;
    }

    double divide() {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
return num1/num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator (1,5);

        System.out.println("Addition: " + calculator.add());
        System.out.println("Subtraction: " + calculator.subtract());
        System.out.println("Multiplication: " + calculator.multiply());
        System.out.println("Division: " + calculator.divide());
    }
}

