import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       
    String username = "Admin";
    String password = "Admin123";
    int percobaan = 3;
  
    while (percobaan > 0) {
    System.out.print("Masukan username : ");
    String usernameInput = scanner.nextLine();
    
    System.out.print("Masukan password : ");
    String passwordInput = scanner.nextLine();

     boolean isBerhasil = usernameInput.equals(username) && passwordInput.equals(password);

        if (isBerhasil) {
          System.out.println("login berhasil!");
          break;
        }else{
        percobaan--;
         System.out.println("Percobaan gagal, tersisa "+ percobaan + "lagi");
        }
         
    }
    if (percobaan <= 0) {
        System.out.println("Percobaan sudah gagal, akun anda terblokir!");
        scanner.close();
        return;
    }

    System.out.println("=== Menu ===");
    System.out.println("1. Hitung angka genap");
    System.out.println("2. Cek kelulusan");
    System.out.print("Silakan pilih(1/2) : ");
    int menu = scanner.nextInt();

    switch(menu){
        case 1 ->{
            System.out.print("Masukan sebuah angka : ");
            int ganjil = scanner.nextInt();

            for(int i = 1; i <= ganjil; i++){
                if (i % 2 != 0) {
                    System.out.println(i + " ");
                }
            }
        }

        case 2 ->{
            System.out.println("Masukan nilai mahasiswa");
            int nilai = scanner.nextInt();

            if (nilai >= 85) {
                System.out.println("Grade : A");
            }else if(nilai < 85){
                System.out.println("Grade : B");
            }
        }
    }
    }
}