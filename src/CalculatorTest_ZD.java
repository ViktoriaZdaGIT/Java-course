import java.util.Scanner;

public class CalculatorTest_ZD {

    // napisz program któy poprosi o 2 liczby, a następnie wykona na nich podstawowe operacje matematyczne

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.println("Wprowadź pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Wprowadź drugą liczbę");
        int secondNumber = scanner.nextInt();

        Calculator_Metody_ZD2 calculator = new Calculator_Metody_ZD2();

        int addition = calculator.add (firstNumber,secondNumber);
        int substraction = calculator.sub (firstNumber,secondNumber);
        int multiplication = calculator.mult (firstNumber,secondNumber);
        int division = calculator.div (firstNumber,secondNumber);
        int mod = calculator.mod (firstNumber,secondNumber);

        System.out.println("Suma tych liczb to: " + addition);
        System.out.println("Różnica tych liczb to: " + substraction);
        System.out.println("Iloczyn tych liczb to: " + multiplication);
        System.out.println("Iloraz tych liczb to: " + division);
        System.out.println("Modulo tych liczb to: " + mod);


    }
}
