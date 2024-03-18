import java.util.Scanner ;

class MBujurSangkar {
    public static void main (String [] args){
        Scanner scan = new Scanner(system.in);
        BujurSangkar bs = new BujurSangkar();
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi "+sisi+ "satuan adalah "+bs.hitungLuas(sisi));
    }
}


//Soal : Apa yang terjadi jika kelas bujur sangkar tidak membuat implementasi metode abstrak yang ada pada kelas bangun datar ?//
// Jika kelas BujurSangkar tidak mengimplementasikan metode abstrak 
// hitungLuas(double sisi) yang dideklarasikan dalam kelas abstrak BangunDatar, 
// maka akan terjadi kesalahan kompilasi. Dalam Java, sebuah kelas konkret (non-abstrak) 
// yang mewarisi dari kelas abstrak harus mengimplementasikan semua metode abstrak dari kelas induknya. 
// Jika tidak, kelas tersebut juga harus dideklarasikan sebagai abstrak.