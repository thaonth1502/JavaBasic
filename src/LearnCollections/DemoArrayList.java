package LearnCollections;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("C++");
        arrayList.add("PHP");

        System.out.println("So phan tu: " + arrayList.size());

        //arrayList.remove(1); //Xoa phan tu thu 2 ( bat dau la 0)
        System.out.println("Kiemm tra chua: " + arrayList.contains("Java"));

        System.out.println("Cac phan tu cua ArrayList");
        System.out.println("\t" + arrayList);


//        ArrayList<String> menuList = new ArrayList<String>();
//        menuList.contains("PHP");
//        menuList.size();
//        menuList.remove(1);

        //Duyet theo FOR co ban
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        //Duyet theo for cai tien
        for (String obj : arrayList){
            System.out.println(obj);
        }
    }

}
