package org.main ;
import org.bangundatar.* ;

public class Mpoligon {
    public static void main (String[]args){
        Persegipanjang persegi = new PersegiPanjang (10,10,4);
        persegi.printInfo ();
        System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
    }
}