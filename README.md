# Latihan-UKL-part-2

import java.util.Scanner;

public class SoalSedang1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = scanner.nextInt();
        
        // Validasi input (opsional, tapi baik untuk ditambahkan)
        if (n < 0) {
            System.out.println("Bilangan harus positif.");
            scanner.close();
            return;
        }
        
        long faktorial = 1;
        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }
        
        System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
        
        scanner.close();
    }
}
import java.util.Scanner;

public class SoalMudah2 {

    // Fungsi untuk menghitung volume tabung
    // Parameter: r (jari-jari), t (tinggi)
    public static double hitungVolumeTabung(double r, double t) {
        double volume = Math.PI * r * r * t; // rumus: phi × r² × t
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menghitung Volume Tabung ===");
        System.out.print("Masukkan jari-jari tabung (cm): ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double t = input.nextDouble();

        // Memanggil fungsi dan menampilkan hasil
        double volume = hitungVolumeTabung(r, t);

        System.out.printf("Volume tabung = %.2f cm³\n", volume);

        input.close();
    }
}

