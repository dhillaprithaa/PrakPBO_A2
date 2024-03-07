public class Main {
    public static void main(String[] args) {
        KeranjangObat keranjangObat = new KeranjangObat();
        keranjangObat.tambahObat("Paracetamol");
        keranjangObat.tambahObat("Vitamin C");
        keranjangObat.tambahObat("Antibiotik");
        keranjangObat.tambahObat("Obat Flu");
        keranjangObat.tambahObat("Obat Batuk");
        keranjangObat.tambahObat("Obat Sakit Kepala"); // Asersi: keranjang sudah penuh
        keranjangObat.tampilkanObat();
    }
}
