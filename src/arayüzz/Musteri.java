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
public class Musteri extends Kullanici{
    Veritabani veritabani;
    public Musteri(String mail, String sifre){
        veritabani=new Veritabani();
        setMail(mail);
        setSifre(sifre);
        
    }

    public Veritabani getVeritabani() {
        return veritabani;
    }

    public void setVeritabani(Veritabani veritabani) {
        this.veritabani = veritabani;
    }

    @Override
    public boolean girisYap(String mail, String sifre) {
return veritabani.getSifreFromMail(mail).equals(sifre);    }

    @Override
    public void urunGoruntule(Urun urun) {
        System.out.println(getMail()+","+urun.getIsim()+"inceliyoor ");
    }

    public void urunEkle(Urun urun) {
System.out.println("müşteri ürün ekleyemez");    }

  
}
