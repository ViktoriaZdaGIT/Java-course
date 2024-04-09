package drivers;

import drivers.ChromeDriverZD;
import drivers.FirefoxDriverZD;

public class InterfaceChecker_ZD {
    public static void main(String[] args) {
        FirefoxDriverZD driver = new FirefoxDriverZD();
        ChromeDriverZD driver2 = new ChromeDriverZD();

/*        System.out.println(driver.get());
        System.out.println(driver.findElement());
        System.out.println(driver2.get());
        System.out.println(driver2.findElement());*/


        driver.get();
        driver.findElement();
        driver2.get();
        driver2.findElement();



    }
}
