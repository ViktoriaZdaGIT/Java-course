package Robert;

public class ZwykłaKlasa {
    String jakiesPole = "dupa";

    String jakasMetoda(String wartosc) {
        this.jakiesPole = wartosc;

        String zmiennaDoReturna = this.jakiesPole + " DUPA";

        return zmiennaDoReturna;
    }


    public void innaMetoda() {
        System.out.println(this.jakiesPole);
        String zmienna = this.jakasMetoda("test");
        System.out.println(zmienna);
    }

    public int wynik;

    public void dodaj (int a, int b) {
        this.wynik = a+b;
    }
}
