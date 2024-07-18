package Bien;

public class BienToanCuc {

    //Biên toàn cục

    String address = "Hà Hội";
    //Khai báo hàm
    public String getName(){
        String name = "Vinh"; //Bien local
        System.out.println(address);
        return name;
    }

    public void showInfor(){
        String phone = "89075734";
        System.out.println(phone);
        System.out.println(address);
    }

    public void loginCRM(){
        String email = "";
        String password = "";
        System.out.println(address);
    }
    public static void main(String[] args) {
        int number = 10;
        System.out.println(number);
        BienToanCuc bienToanCuc = new BienToanCuc();
        System.out.println(bienToanCuc.address);
    }
}
