package org.bangundatar ;

import org.poligon.poligon;

public class PersegiPanjang extends Poligon {
    private double panjang,lebar ;

    public PersegiPanjang (double panjang, double lebar, int jumlahSisi){
        this.panjang = panjang ;
        this.lebar = lebar ;
        this.jumlahSisi = jumlahSisi;

    }
    public double hitungLuas (){
        return panjang * lebar ;
    }
    public void printInfo (){
        System.out.println("bangun Persegi panjang berisi  " +this.getJumlahSisi());
    
    }
}