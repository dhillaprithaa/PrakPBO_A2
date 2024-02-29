
public class Main{
public static void main(String[] args) {
    // Membuat objek Penjual
    Penjual penjual1 = new Penjual("John Doe", "Jl. Jendral Sudirman No. 123", "081234567890");

    // Membuat objek Produk dengan Penjual terkait
    Produk produk1 = new Produk("Laptop", 5000000, 10, "Laptop merk X", penjual1);

    // Mendapatkan informasi produk dan penjual terkait
    System.out.println("Informasi Produk:");
    System.out.println("Nama: " + produk1.getNama());
    System.out.println("Harga: " + produk1.getHarga());
    System.out.println("Stok: " + produk1.getStok());
    System.out.println("Deskripsi: " + produk1.getDeskripsi());
    System.out.println("Penjual: " + produk1.getPenjual().getNama());
}
}

