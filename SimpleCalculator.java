import java.util.Scanner;

public class Calculator {
    private int number1;
    private int number2;

    // Constructor to initialize numbers
    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // Method to calculate the sum
    public int findSum() {
        return number1 + number2;
    }

    // Method to calculate the difference
    public int findDifference() {
        return number1 - number2;
    }

    // Static method to display the result
    public static void displayResult(String operation, int result) {
        System.out.println("The " + operation + " is: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Creating an object of Calculator
        Calculator calculator = new Calculator(num1, num2);

        // Calculating sum and difference
        int sum = calculator.findSum();
        int difference = calculator.findDifference();

        // Displaying results using the static method
        displayResult("sum", sum);
        displayResult("difference", difference);
    }
}

