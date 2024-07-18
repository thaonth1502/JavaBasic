package Ham;

public class DemoHamCoThamSo {

    String name = "Thao";
    int age = 35;
    String address = "HN";

    int a = 10;
    int b = 20;

    //Khai bao ham co tra ve
    public String getName(){
        return name;
    }

    //Truyền tham số cho hàm
    public int cong2So(int a, int b){
        return a + b;
    }

    public double nhan3So(int a, int b, double c){
        return a * b * c;
    }

    public int getTotalCustomers(){
        int total = 501;
        return total;
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
        DemoHamCoThamSo object = new DemoHamCoThamSo();

        System.out.println("Cong 2 so: " + object.cong2So(8, 12)) ;
        System.out.println("Nhan 3 so: " + object.nhan3So(3, 5, 2.));

        object.setEmail("admin@example.com");
        object.setPassword("abcde12345@");
        object.clickLoginButton("Login");
        object.verifyMenu("Dashboard");

    }
}
