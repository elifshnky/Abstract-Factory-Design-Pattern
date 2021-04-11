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
public class Satici extends Kullanici implements SatisYapabilen {
   private Veritabani veritabani;
    
   public Satici(String mail, String sifre){
        veritabani=new Veritabani();
        setMail(mail);
        setSifre(sifre);
    }

    @Override
    boolean girisYap(String mail, String sifre) {
return veritabani.getSifreFromMail(mail).equals(sifre);    }

    @Override
    void urunGoruntule(Urun urun) {
        System.out.println(getMail()+","+urun.getIsim()+", ");
    }

   @Override
    public void urunEkle(Urun urun) {
veritabani.urunEkle(urun); 
    }
    
}
