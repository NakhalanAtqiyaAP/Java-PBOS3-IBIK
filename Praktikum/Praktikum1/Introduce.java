import java.util.Scanner;
public class Introduce {
    public static void main(String[] args) {
        int umur = 10;

        System.out.println("Contoh Penggunaan variable: " + umur);

    //Operator Pembanding
    boolean cekCukupUmur = umur > 10;

    if (cekCukupUmur) {
        System.out.println("Kamu boleh masuk");
    } else {
        System.out.println("Kamu tidak boleh masuk");
    }

    }
}


// nama variable tidak boleh memakai angka di depan, ada striptnya, dan terpisah 