package Static;

public class Company {

    //Khai bao bien static
    public static String companyName = "FPT";
    public static String companyAddress = "Hanoi";

    //Dung trong test Automation
    public static String URL = "https://crm.anhtester.com";
    public static String EMAIL = "admin@example.com";
    public static String PASSWORD = "abcde12345@";

    public static void showInfo(){
        System.out.println(URL);
        System.out.println(EMAIL);
        System.out.println(PASSWORD);
    }



}
