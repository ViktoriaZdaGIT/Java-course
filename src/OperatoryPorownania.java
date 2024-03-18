import java.util.Scanner;

public class OperatoryPorownania {

    public static void main(String[] args) {
/*        int firstNumber = 4;
        int secondNumber = 6;

        boolean result = secondNumber > firstNumber; //true

        System.out.println(result);
        System.out.println(firstNumber > secondNumber); // false
        System.out.println(firstNumber < secondNumber); // true
        System.out.println(firstNumber >= secondNumber); // false
        System.out.println(firstNumber <= secondNumber); // true
        System.out.println(firstNumber == secondNumber); // false, prównywanie dwóch elemetów czy te liczby są sobie równe?
        //jedno = przypisanie wartości lub nadpisanie wartości
        System.out.println(firstNumber != secondNumber); // true czy te liczby różnią się od siebie?*/


         //Zadanie domowe

        Scanner scanner = new Scanner( System.in);
        System.out.println("Wprowadź pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Wprowadź drugą liczbę");
        int secondNumber = scanner.nextInt();

        String result = ("b > a : " + (secondNumber > firstNumber)); //true

        System.out.println(result);
        System.out.println("a > b : " + (firstNumber > secondNumber)); // false
        System.out.println("a < b : " + (firstNumber < secondNumber)); // true
        System.out.println("a >= b : " + (firstNumber >= secondNumber)); // false
        System.out.println("a <= b : " + (firstNumber <= secondNumber)); // true
        System.out.println("a == b : " + (firstNumber == secondNumber)); // false
        System.out.println("a != b : " + (firstNumber != secondNumber)); // true






    }
}
