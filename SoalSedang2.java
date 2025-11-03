import java.util.Scanner;

public class SoalMudah2 {

    // Fungsi untuk menghitung volume tabung
    // Parameter: r (jari-jari), t (tinggi)
    public static double hitungVolumeTabung(double r, double t) {
        // Rumus: π × r² × t
        double volume = Math.PI * r * r * t;
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

        System.out.printf("Volume tabung = %.2f cm³%n", volume);

        input.close();
    }
}