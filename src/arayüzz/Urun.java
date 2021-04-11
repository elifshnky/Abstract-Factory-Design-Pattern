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
public class Urun {
   private String isim;
   private double fiyat;
   
    public Urun(String isim, double fiyat){
        this.isim=isim;
        this.fiyat=fiyat;
        
    }

    Urun(String bilgisayar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
    
    
}
