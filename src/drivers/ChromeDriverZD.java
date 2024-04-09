package drivers;

public class ChromeDriverZD implements WebDriver_ZD {
    @Override
    public void get() {
        System.out.println("Otwieramy przeglądarkę za pomocą Chrome");
    }

    @Override
    public void findElement() {
        System.out.println("Znajdujemy element za pomocą Chrome");

    }
/*    @Override
    public String get() {

        return "Otwieramy przeglądarkę za pomocą Chrome";
    }

    @Override
    public String findElement() {

        return "Znajdujemy element za pomocą Chrome";
    }*/
}
