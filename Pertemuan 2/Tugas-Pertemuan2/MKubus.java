public class MKubus{

public static void main(String[] args) {
        // Membuat objek kubus dengan panjang sisi tertentu (misalnya 5)
        Kubus kubus1 = new Kubus(5);

        // a. Hitung dan cetak volume dari kubus1
        System.out.println("Volume dari Kubus 1: " + kubus1.hitungVolume());

        // b. Hitung dan cetak luas permukaan dari kubus1
        System.out.println("Luas Permukaan dari Kubus 1: " + kubus1.hitungLuasPermukaan());
    }
}