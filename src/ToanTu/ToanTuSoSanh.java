package ToanTu;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ToanTuSoSanh {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;

        System.out.println(a == b); //so sanh a có BANG b hay ko
        System.out.println(a != b); // So sanh a co KHAC b hay ko
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a >= c); //So sanh a co lon hon hoac bang c hay khong
        System.out.println(a > b);
        System.out.println(a < b);

    }
}
