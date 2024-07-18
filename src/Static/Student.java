package Static;

public class Student {

    public String phone = "012345678";

    public static String name = "Anh";

    public static void showInfo(){
        System.out.println(name);
        Student student = new Student();
        System.out.println(student.phone);
    }

    public void testLoginCRM(){
        System.out.println(Company.URL);
        System.out.println(Company.EMAIL);
        System.out.println(Company.PASSWORD);
    }

    public static void main(String[] args) {

        showInfo();

        Student student = new Student();
        System.out.println(student.phone);
        student.testLoginCRM();

        System.out.println(Company.companyName);
        System.out.printf(Company.companyAddress);
        Company.showInfo();

    }
}
