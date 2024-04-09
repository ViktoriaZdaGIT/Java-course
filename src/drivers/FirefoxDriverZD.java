package drivers;

public class FirefoxDriverZD implements WebDriver_ZD {
    @Override
    public void get() {
        System.out.println("Otwieramy przeglądarkę za pomocą Firefox");
//        return "Otwieramy przeglądarkę za pomocą Firefox";
    }

    @Override
    public void findElement() {
        System.out.println("Znajdujemy element za pomocą Firefox");

    }
/*    @Override
    public String get() {
        return "Otwieramy przeglądarkę za pomocą Firefox";
    }

    @Override
    public String findElement() {
        return "Znajdujemy element za pomocą Firefox";
    }*/



}
