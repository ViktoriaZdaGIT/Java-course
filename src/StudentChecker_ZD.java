// Stworz 3 obiekty klasy student. Przypisz wartosci do pol. Stworz tablice i dodaj studentow do tablicy.
// Przejdz przez studentow w tablicy i wywolaj wszystkie 4 metody

public class StudentChecker_ZD {
    public static void main(String[] args) {

       String uczelnia = Student.nazwaUczelni;
       Student.infoUczelnia();

       Student student1 = new Student ();
       student1.imie = "Katarzyna";
       student1.nazwisko ="Komarowska";
       student1.nick = "Kasia";
       student1.email = "kasiakomar@gmail.com";
       student1.numerIndeksu = 123456;
       String uczelniaKasia = student1.nazwaUczelni;
       student1.infoUczelnia();

       Student student2  = new Student ();
       student2.imie = "Bartosz";
       student2.nazwisko ="Komar";
       student2.nick = "Bartek";
       student2.email = "bartekkomar@gmail.com";
       student2.numerIndeksu = 654321;

       Student student3  = new Student ();
       student3.imie = "Alicja";
       student3.nazwisko ="Koper";
       student3.nick = "Ala";
       student3.email = "alakoper@gmail.com";
       student3.numerIndeksu = 78906;


       Student [] students = new Student[3];
       students [0] = student1;
       students [1] = student2;
       students [2] = student3;

       for (int i=0; i<students.length; i++) {
          students[i].przedstawSie();
          students[i].podajEmail();
          students[i].podajNrIndeksu();
          students[i].zalogujSie();
       }

    }

}
