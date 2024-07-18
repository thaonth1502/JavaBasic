package DieuKienIfElse;

public class DemoIf_Eles_If {

    public static void main(String[] args) {

        double dtb = 1.5;

        if(dtb >= 8){
            System.out.println("Gioi");
        } else if (dtb >= 7 && dtb < 8){
            System.out.println("Trung Binh");
        } else if (dtb < 5 && dtb >=2) {
            System.out.println("Yeu");
        }else {
            System.out.println("O lai lop");
        }
    }
}
