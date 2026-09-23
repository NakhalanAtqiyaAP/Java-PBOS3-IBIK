import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int harga = 0;

        System.out.println("=== Kasir Cafe Kopi Kenangan ===");
        System.out.println(" ");
        System.out.println("Menu:");
        System.out.println("1. Kopi Latte ------------------ Rp. 12.000");
        System.out.println("2. Kopi hitam ------------------ Rp. 10.000");
        System.out.println("3. Chocolatte ------------------ Rp. 14.000");

        System.out.print("Masukan Nama Barang : ");
        String nama = scanner.nextLine();

        System.out.print("Masukan Jumlah Uang : ");
        int uang = scanner.nextInt();

          
        switch(nama.toLowerCase()){
            case "kopi latte" -> harga = 120000;
            case "kopi hitam" -> harga = 100000;
            case "chocolatte" -> harga = 140000;
            default -> {
                System.out.println("Menu tidak tersedia");
                return;
            }
        }

        if(uang < harga){
           System.out.println("Uang kamu kurang");
        }else{
            int totalKembalian = uang - harga;
        System.out.println("=== Struct ===");
        System.out.println("Nama barang     :" + nama);
        System.out.println("Harga barang    :" + harga);
        System.out.println("Kembalian       :" + totalKembalian);
        }

        scanner.close();

    }
}