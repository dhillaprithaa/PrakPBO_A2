/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihantutorial;

/**
 *
 * @author dhilapritha09
 */
public class TestSenjata {
    
    public static void main (String[]args){
        Senjata ak47 = new Senjata ("TAR");
        Senjata m16 = new Senjata ("dOr");
        
        System.out.print(" AK 47 Menembak 3x "); ak47.menembak(3);
        System.out.print(" M 16 Menembak 1x "); m16.menembak(1);
        
        System.out.println("AK 47 menusuk :" + ak47.menusuk ());
        ak47.pasangBayonet();
        System.out.println("AK47 menusuk : " + ak47.menusuk ());
        
        
    }
}
