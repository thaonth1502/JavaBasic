package Ham;

public class DemoHamCoTraVe {

    String name = "Thao";
    int age = 35;
    String address = "HN";

    int a = 10;
    int b = 20;

    //Khai bao ham co tra ve
    public String getName(){
        return name;
    }

    public int cong2So(){
        return a + b;
    }

    public double nhan2So(){
        return a * b * 2;
    }

    public int getTotalCustomers(){
        int total = 501;
        return total;
    }

    public static void main(String[] args) {
        DemoHamCoTraVe object = new DemoHamCoTraVe();

        System.out.println(object.cong2So() + object.nhan2So());

    }
}
