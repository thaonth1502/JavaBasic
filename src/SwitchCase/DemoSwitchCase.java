package SwitchCase;

public class DemoSwitchCase {

    public static void main(String[] args) {

        String browser = "CHROME";

        switch (browser){
            case "CHROME":
                System.out.println("Chay test với trình duyệt CHROME");
                break;
            case "EDGE":
                System.out.println("Chay test với trình duyệt EDGE");
                break;
            case "FIREFOX":
                System.out.println("Chay test với trình duyệt FIREFOX");
                break;
            default:
                System.out.println("Chạy test với trình duyệt mặc định CHROME");
        }
    }
}
