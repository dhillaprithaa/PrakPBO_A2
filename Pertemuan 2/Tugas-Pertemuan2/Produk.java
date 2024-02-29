public class Produk {
    // Atribut
    private String nama;
    private double harga;
    private int stok;
    private String deskripsi;
    private Penjual penjual; // Relasi dengan kelas Penjual

    // Konstruktor
    public Produk(String nama, double harga, int stok, String deskripsi, Penjual penjual) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.deskripsi = deskripsi;
        this.penjual = penjual;
    }

    // Getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    // Metode untuk mendapatkan objek Penjual terkait
    public Penjual getPenjual() {
        return penjual;
    }
}

    