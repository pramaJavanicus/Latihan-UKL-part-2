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
