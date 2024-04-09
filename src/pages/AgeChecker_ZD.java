package pages;//Zapytaj użytkownika o wiek.
//W przypadku gdy ma mniej niż 18 lat wypisz na ekranie informację że nie możesz kupić alkoholu.
//Gdy ma więcej niż 18 lat to podziękuj za zakupy

import java.util.Scanner;

public class AgeChecker_ZD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz ile masz lat");
        int age = scanner.nextInt();

        if (age < 18 && age >=0) {
            System.out.println("Nie możesz kupić alkoholu");
        } else if (age < 0) {
            System.out.println("Wprowadź poprawną wartość");
        } else {
            System.out.println("Dziękuję za zakupy zapraszam ponownie");
        }
    }
}
