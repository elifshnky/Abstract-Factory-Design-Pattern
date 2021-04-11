/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arayüzz;

/**
 *
 * @author AYŞE
 */
public class Arayüzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Musteri musteri= new Musteri ("sefaaras@ktu.edu.tr","123456");
         Satici satici=new Satici("mhbozkurt@ktu.edu.tr","654321");

        musteri.getVeritabani().kullaniciEkle();
        
        if(musteri.girisYap("sefaaras@ktu.edu.tr","123456")){
            System.out.println("sisteme giriş yapıldı");
        }
        
        Urun urun=new Urun("bilgisayar", 7500);
    satici.urunEkle(urun);
    musteri.urunGoruntule(urun);
    } 
}
