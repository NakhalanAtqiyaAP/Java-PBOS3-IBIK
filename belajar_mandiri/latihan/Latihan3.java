import java.util.Scanner;
public class Latihan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldo = 5000000;
        int input;

        do{
            System.out.println("=== ATM ===");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu(1-4) : ");
            input = scanner.nextInt();

            switch (input) {
              case 1 ->{
                System.out.println("Saldo Anda adalah Rp. "+ saldo);
              }
              case 2 ->{
                System.out.println("Mau tarik tunai berapa?");
                int tarikTunai = scanner.nextInt();

                if (tarikTunai > saldo) {
                    System.out.println("Saldo Anda tidak mencukupi untuk menarik tunai senilai Rp. "+ tarikTunai);
                }else{
                    saldo -= tarikTunai;
                    System.out.println("Penarikan berhasil!");
                    System.out.println("Sisa saldo Anda sebesar Rp. "+ saldo);
                }
              }
              case 3 ->{
                System.out.println("Mau setor tunai berapa?");
                int setorTunai = scanner.nextInt();

                saldo += setorTunai + saldo;

                System.out.println("Setor tunai berhasil!");
                System.out.println("Saldo Anda Rp. "+ saldo);


              }
            }

        }while(input != 4);

        System.out.println("Terimakasih telah menggunakan ATM Kami");
    }
}