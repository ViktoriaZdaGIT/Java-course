public class AppTest_ZD {
    public static void main(String[] args) {
        AndroidApp_ZD android = new AndroidApp_ZD("Android");
        android.runAndroidAA();
        android.appInfo();

        IphoneApp_ZD iphone = new IphoneApp_ZD("Iphone");
        iphone.runIphoneApp();
        iphone.appInfo();

    }
}
