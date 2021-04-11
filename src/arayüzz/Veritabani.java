/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arayüzz;

import java.util.ArrayList;

/**
 *
 * @author AYŞE
 */
public class Veritabani {
   private  ArrayList<Kullanici> kullanicilar;
   private ArrayList<Urun>urunler;
    public Veritabani(){
        kullanicilar =new ArrayList<Kullanici>();
        urunler=new ArrayList<Urun>();
        
       

    }
    public String getSifreFromMail(String mail) {
        for(Kullanici kullanici :kullanicilar){
            if(kullanici.getMail().equals(mail)) return kullanici.getSifre();
        }
        return "";
    }
    public void kullaniciEkle() {
         Kullanici musteri=new Musteri("sefaaras@ktu.edu.tr","123456");
        Kullanici satici=new Satici("mhbozkurt@ktu.edu.tr","654321");
        kullanicilar.add(musteri);
        kullanicilar.add(satici);
    }
    public void urunEkle(Urun urun){
        urunler.add(urun);
    }
    
}
