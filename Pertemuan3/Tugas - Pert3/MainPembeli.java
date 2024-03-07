public class MainPembeli {
    public static void main(String[] args) {
        Obat obat1 = new Obat("Paracetamol");   
        Obat obat2 = new Obat("Vitamin A");   
        Obat obat3 = new Obat("Vitamin C");   
        Obat obat4 = new Obat("Antibiotik");   
        Obat obat5 = new Obat("Panadol");   
        Obat obat6 = new Obat("Promag");
        
        Pembeli pembeli1 = new Pembeli("Mulyo");
        Pembeli pembeli2 = new Pembeli("Budi");

        obat3.setTersedia(false);
        try {
            pembeli1.beliObat(obat1);
            pembeli1.beliObat(obat2);
            pembeli1.beliObat(obat3);
            pembeli1.beliObat(obat4);
        }
        catch (BatasObatPenuhException bp) {
            System.out.println(bp.getMessage());
        }
        catch (ObatTidakTersediaException bt) {
            System.out.println(bt.getMessage());
        }
        System.out.println("\n");
        try {
            pembeli2.beliObat(obat1);
            pembeli2.beliObat(obat2);
            pembeli2.beliObat(obat1);
            pembeli2.beliObat(obat4);
            pembeli2.beliObat(obat5);
            pembeli2.beliObat(obat6);
            pembeli2.beliObat(obat4);
            pembeli2.beliObat(obat5);
        }
        catch (BatasObatPenuhException bp) {
            System.out.println(bp.getMessage());
        }
        catch (ObatTidakTersediaException bt) {
            System.out.println(bt.getMessage());
        }
    }
}













// public class MainPembeli {
//     public static void main(String[] args) {
//         // Instansiasi kelas Pembeli dan Obat
//         Pembeli pembeli = new Pembeli("John Doe");
//         Obat obat1 = new Obat("Paracetamol");
//         Obat obat2 = new Obat("Amoxicillin");

//         try {
//             // Percobaan pembelian obat
//             pembeli.beliObat(obat1);
//             pembeli.beliObat(obat2);
//             // Pembelian ketiga akan melemparkan BatasObatPenuhException karena keranjang sudah penuh
//             pembeli.beliObat(new Obat("Ibuprofen"));
//             // Pembelian obat2 kembali akan melemparkan ObatTidakTersediaException karena obat sudah dibeli sebelumnya
//             pembeli.beliObat(obat2);
//         } catch (BatasObatPenuhException e) {
//             System.out.println("Gagal membeli obat: " + e.getMessage());
//         } catch (ObatTidakTersediaException e) {
//             System.out.println("Gagal membeli obat: " + e.getMessage());
//         }
//     }
// }
