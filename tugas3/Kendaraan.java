/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author bachtiar
 */
public abstract class Kendaraan {
      String nama;
    
    public Kendaraan(String nama) {
        this.nama = nama;
    }
    
    // Method abstrak (harus diimplementasikan oleh subclass)
    public abstract void dealer();
    
    public void punyaRoda(){
        System.out.println("Kendaraan ini punya roda");
    }
    
    public void deskripsi() {
        System.out.println("nama kendaraan ini adalah " + nama);
    }
    


}
