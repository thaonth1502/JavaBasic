package Array;

public class DemoArray {
    public static void main(String[] args) {
        String[] arrayName = new String[5];
        arrayName[0] = "Nhung";
        arrayName[1] = "Linh";
        arrayName[2] = "Nhi";
        arrayName[3] = "Thao";
        arrayName[4] = "Phuong";

        //Duyet gia tri trong mang
        //Dung vong lap FOR
        for (int i = 0; i < arrayName.length; i++) {
            System.out.println(arrayName[i]);
        }
        for (String name : arrayName){
            System.out.println(name);
        }

    }
}
