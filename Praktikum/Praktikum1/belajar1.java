import java.util.Scanner;

public class belajar1 {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("=== Program Input Data Mahasiswa ===");
	
	System.out.print("Masukan Nama Lengkap:");
	String nama = scanner.nextLine();
	
	System.out.print("Masukan Umur:");
	int umur = scanner.nextInt();
	
	System.out.print("Masukan Nama IPK:");
	double ipk = scanner.nextDouble();
	
	System.out.println("\n---------------------------");
	System.out.println("=== Hasil Data ===");
	
	System.out.println("Nama Mahasiswa  : " + nama);
	System.out.println("Nama Umur       : " + umur);
	System.out.printf("IPK             : %.2f%n", ipk );
	
	scanner.close();
	
	}
}