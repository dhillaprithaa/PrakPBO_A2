public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka + "bukan angka sial");
    }

    public static void main (String[]args){
        AngkaSial as = new AngkaSial ();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(4);
        }catch(AngkaSialException ase){
            //method massage () telah ada pada kelas "EXception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati masukkan angka!!!");
        }
    }
}
    

