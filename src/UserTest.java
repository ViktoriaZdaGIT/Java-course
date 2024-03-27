public class UserTest {
    public static void main(String[] args) {
       // User user = new User();
        User user =new User("Viktoria", "hello");

/*        user.username = "Bartek";
        user.password = "HNKK";*/
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();


    }
}
