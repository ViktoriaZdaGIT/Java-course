public class AutoTest_ZD {
    public static void main(String[] args) {

        Auto_ZD mercedes = new Auto_ZD("Mercedes", "Klasa S", 2021, 1000 );
        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto_ZD audi = new Auto_ZD("Audi","A5",2020,0);
        audi.jedz();
        audi.hamuj();
        audi.info();

        /*Auto mercedes = new Auto ();
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rok = 2021;
        mercedes.przebieg = 1000;

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto audi =new Auto();
        audi.marka="Audi";
        audi.model="A5";
        audi.rok=2020;
        audi.przebieg=0;

        audi.jedz();
        audi.hamuj();
        audi.info();

        Auto noName = new Auto();

        noName.jedz();
        noName.hamuj();
        noName.info();
*/
    }
}
