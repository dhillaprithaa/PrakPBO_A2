public class KeranjangObat {
    private String[] keranjang;
    private int jumlahObat; // Menyimpan jumlah obat yang sudah dimasukkan ke dalam keranjang

    public KeranjangObat() {
        keranjang = new String[5];
        jumlahObat = 0; // Set jumlah obat awalnya ke 0
    }

    public void tambahObat(String obat) {
        if (jumlahObat < keranjang.length) { // Cek apakah masih ada ruang kosong di keranjang
            keranjang[jumlahObat] = obat; // Tambahkan obat ke dalam keranjang
            jumlahObat++; // Tambahkan jumlah obat yang sudah dimasukkan
        } else {
            // Jika keranjang sudah penuh, lempar AssertionError
            throw new AssertionError("Keranjang sudah penuh");
        }
    }

    public void tampilkanObat() {
        for (int i = 0; i < jumlahObat; i++) {
            System.out.println(keranjang[i]); // Hanya tampilkan obat yang sudah dimasukkan
        }
    }
}
