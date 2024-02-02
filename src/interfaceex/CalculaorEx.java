package interfaceex;

import java.util.ArrayList;

//Functional interface for calculator
//@FunctionalInterface
//interface Calculator {
// double calculate(double x, double y);
//}
//
//public class CalculaorEx {
// public static void main(String[] args) {
//   
//	 ArrayList<Calculator> calculatorList = new ArrayList<>();
//     //lambda expressions 
//     Calculator addition = (x, y) -> x + y;
//     Calculator subtraction = (x, y) -> x - y;
//     Calculator multiplication = (x, y) -> x * y;
//     Calculator division = (x, y) -> {
//         if (y == 0) {
//             throw new ArithmeticException("Division by zero");
//         }
//         return x / y;
//     };
//
//     // Use runtime polymorphism to call different implementations
//     performOperation(addition, 10, 5);
//     performOperation(subtraction, 10, 5);
//     performOperation(multiplication, 10, 5);
//     performOperation(division, 10, 5);
// }
//
// // Method to perform operation using the calculator
// public static void performOperation(Calculator calculator, double x, double y) {
//	 
//     double result = calculator.calculate(x, y);
//     System.out.println("Result: " + result);
//     
// }
//}


// Functional interface for calculator
@FunctionalInterface
interface Calculator {
    double calculate(double x, double y);
}

// Addition operation
class Adder implements Calculator {
    @Override
    public double calculate(double x, double y) {
        return x + y;
    }
}

// Subtraction operation
class Subtractor implements Calculator {
    @Override
    public double calculate(double x, double y) {
        return x - y;
    }
}

// Multiplication operation
class Multiplier implements Calculator {
    @Override
    public double calculate(double x, double y) {
        return x * y;
    }
}

// Division operation
class Divider implements Calculator {
    @Override
    public double calculate(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return x / y;
    }
}

public class CalculaorEx {
    public static void main(String[] args) {
        // Create an ArrayList to hold interface references
        ArrayList<Calculator> calculatorList = new ArrayList<>();

        // Add instances of different implementations of Calculator
        calculatorList.add(new Adder());       // Addition
        calculatorList.add(new Subtractor());  // Subtraction
        calculatorList.add(new Multiplier());  // Multiplication
        calculatorList.add(new Divider());     // Division

        // Use runtime polymorphism to call different implementations
        for (Calculator calculator : calculatorList) {
            double result = calculator.calculate(10, 5);
            System.out.println("Result: " + result);

            // Use instanceof to identify the type of each calculator
            if (calculator instanceof Adder) {
                System.out.println("This is an Adder calculator.");
            } else if (calculator instanceof Subtractor) {
                System.out.println("This is a Subtractor calculator.");
            } else if (calculator instanceof Multiplier) {
                System.out.println("This is a Multiplier calculator.");
            } else if (calculator instanceof Divider) {
                System.out.println("This is a Divider calculator.");
            }
        }
    }
}











