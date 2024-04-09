package drivers;

public class WebDriverTest2 {
    public static void main(String[] args) {
        WebDriver_ZD driver = getDriver ("chrome");
        driver.get();
        driver.findElement();
        driver.findElement();
        driver.findElement();
        driver.findElement();
        driver.findElement();

    }
    private static WebDriver_ZD getDriver (String name) {
        if (name.equals("chrome")){
            return new ChromeDriverZD();
        } else if (name.equals("firefox")) {
            return new FirefoxDriverZD();
        }
        return null;
    }
}
