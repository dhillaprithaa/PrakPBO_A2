public class MGaris {
    public static void main (String[]args){
        Titik titik1 = new Titik (1,3);
        Titik titik2 = new Titik (5,9);

        Garis garis1 = new Garis (titik1,titik2);

        //objek garis 
        System.out.println ("Titik Awal : (" +garis1.getTitikAwal ().getAbsis() + "," +garis1.getTitikAwal ().getOrdinat()+ ")");
        System.out.println ("Titik Akhir : (" +garis1.getTitikAkhir ().getAbsis() + "," +garis1.getTitikAkhir ().getOrdinat()+ ")");

        //panjang garis 
        System.out.println ("Panjang Garis : " + garis1.getPanjang ());

        //gradien garis 
        System.out.println ("Gradies Garis : " + garis1.getPanjang ());

        //refleksi degan sumbu x 
        Garis garisRefleksiY = garis1.getRefleksiY();
        System.out.println ("Titik Awal Refleksi Y : ("+ garisRefleksiY.getTitikAwal().getAbsis()+ " , " +garisRefleksiY.getTitikAwal().getOrdinat()+")");
        System.out.println ("Titik Awal Refleksi Y : ("+ garisRefleksiY.getTitikAkhir().getAbsis()+ " , " +garisRefleksiY.getTitikAkhir().getOrdinat()+")");

        //coba garis lain 
        Titik titik3 = new Titik (3,1);
        Titik titik4 = new Titik (5,6);
        Garis garis2 = new Garis (titik3,titik4);

        //cek apakah garis tegak lurus dengan garis lain 
        boolean isTegakLurus = garis1.isTegakLurus(garis2);
        System.out.println ("Garis 1 tegak lurus garis 2 : "+ isTegakLurus);
        
    }
}
