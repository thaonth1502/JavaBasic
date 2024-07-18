package LearnCollections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Windows", "2000");
        hashMap.put("Windows", "XP");
        hashMap.put("Language2", "Java");
        hashMap.put("Language", ".Net");
        hashMap.put("Windows", "2000");

        hashMap.remove("Language");
        System.out.println(hashMap.containsKey("Language"));
        System.out.println( hashMap.containsValue("Java"));

        System.out.println("Cac phan tu cua Set");
        System.out.println("\t" + hashMap);

        //2 truong hop dung nhieu là doc data trong excel va JSON
        //Thiet lap config cho driver trong Selenium

        //Truy xuat gia tri theo tung key
        System.out.println(hashMap.get("Windows"));

        //Get het gia tri cuar key va value
        for (Map.Entry<String, String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
