/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopapps.models;

/**
 *
 * @author Aldi
 */
public class Item {
    int idItem;
    String namaItem;
    double harga;

    public Item(int idItem, String namaItem, double harga) {
        this.idItem = idItem;
        this.namaItem = namaItem;
        this.harga = harga;
    }
    
    
    public Item(String namaItem, double harga){
        this.namaItem = namaItem;
        this.harga = harga;
    }
    
    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getNamaItem() {
        return namaItem;
    }

    public void setNamaItem(String namaItem) {
        this.namaItem = namaItem;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return namaItem;
    }
    
    
    
    
    
}
