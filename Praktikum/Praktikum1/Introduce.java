import java.util.Scanner;
public class Introduce {
    public static void main(String[] args) {
        int umur = 10;
        int umurMasaDepan = umur + 12;
        String nama = "Nakhalan";

        System.out.println("Contoh Penggunaan variable: " + umur);

    //Operator Pembanding
    boolean cekCukupUmur = umurMasaDepan > 10;
    boolean cekNama = nama == "Nakhalan";

    if (cekCukupUmur && cekNama ) {
        System.out.println("Kamu boleh masuk");
    } else {
        System.out.println("Kamu tidak boleh masuk");
    }

    //contoh membuat sebuah objek
    Dog dog1 = new Dog();
    dog1.barking();

    }
}


// nama variable tidak boleh memakai angka di depan, ada striptnya, dan terpisah 