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
public abstract class Kullanici { //hem müşteri hem satıcı olacak o yüxden interface
    String mail,sifre;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
   
    
   abstract boolean girisYap(String mail, String sifre);
   abstract void urunGoruntule(Urun urun);
   
}
