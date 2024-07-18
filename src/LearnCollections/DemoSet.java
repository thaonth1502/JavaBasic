package LearnCollections;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("PHP");
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("C++");
        hashSet.add("PHP");

        System.out.println("So phan tu: " + hashSet.size());
        hashSet.remove("Python"); //xoa phan tu theo ten
        System.out.println("Kiem tra chua: " + hashSet.contains("Java"));

        System.out.println("Cac phan tu cua Set");
        System.out.println("\t" + hashSet);
        //Duyet theo for cai tien
        for (String obj : hashSet){
            System.out.println(obj);
        }

    }
}
