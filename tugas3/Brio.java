/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author bachtiar
 */
public class Brio extends Kendaraan {
    
    // Constructor
    public Brio(String nama) {
        super(nama);
        System.out.println("nama kendaraan ini adalah "+nama);
    }

    @Override
    public void dealer() {
        System.out.println(nama + " dari dealer honda");
    }
    
    @Override
    public void punyaRoda(){
        System.out.println("Roda saya 4");
    }
        public void gerak() {
        System.out.println(nama + " sedang bergerak ");
    }

    public void gerak(int kecepatan) {
        System.out.println(nama + " bergerak dengan kecepatan "+kecepatan+" km/h");
    }
    
    public void cek (){
        System.out.println("cek override");
        super.punyaRoda();
        this.punyaRoda();
    }
}