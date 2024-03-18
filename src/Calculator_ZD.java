import java.util.Scanner;

public class Calculator_ZD {

    // napisz program któy poprosi o 2 liczby, a następnie wykona na nich podstawowe operacje matematyczne

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.println("Wprowadź pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Wprowadź drugą liczbę");
        int secondNumber = scanner.nextInt();
        int result = firstNumber + secondNumber;
        System.out.println("Suma tych liczb to: " + result);
        int result2 = firstNumber - secondNumber;
        System.out.println("Różnica tych liczb to: " + result2);
        int result3 = firstNumber * secondNumber;
        System.out.println("Iloczyn tych liczb to: " + result3);
        int result4 = firstNumber / secondNumber;
        System.out.println("Iloraz tych liczb to: " + result4);
        int result5 = firstNumber % secondNumber;
        System.out.println("Modulo tych liczb to: " + result5);


    }
}
