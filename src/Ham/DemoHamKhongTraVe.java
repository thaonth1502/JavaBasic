package Ham;

public class DemoHamKhongTraVe {

    String name = "Thao";
    int age = 35;
    String address = "HN";

    //Khai bao ham khong tra ve
    public void showInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }

    public void setEmail(String email){
        System.out.println("Email: " + email);
    }

    public void setPassword(String password){
        System.out.println("Password: " + password);
    }

    public void clickLoginButton(String elementName){
        System.out.println("Click on element: " + elementName);
    }

    public boolean verifyMenu(String menuName){
        System.out.println("Verify menu: " + menuName);
        return true;

    }

    public static void main(String[] args) {
        DemoHamKhongTraVe object = new DemoHamKhongTraVe();
        object.showInfo();
        object.setEmail("admin@example.com");
        object.setPassword("abcde12345@");
        object.clickLoginButton("Login");
        object.verifyMenu("Dashboard");

    }
}
