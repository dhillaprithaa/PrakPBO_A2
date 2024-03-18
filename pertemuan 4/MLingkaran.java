import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan panjang jejari : ");
        double jejari = scanner.nextDouble();

        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + l.hitungLuas());

        scanner.close();
    }
}