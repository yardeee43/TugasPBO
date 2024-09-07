/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author bachtiar
 */
public class Revo extends Kendaraan{
    
    // Constructor
    public Revo(String nama) {
        super(nama);
        System.out.println("nama kendaraan ini adalah "+nama);
    }

    @Override
    public void dealer() {
        System.out.println(nama + " dari dealer honda");
    }
    
    @Override
    public void punyaRoda(){
        System.out.println("Roda saya ada 2");
    }
        public void gerak() {
        System.out.println(nama + " sedang bergerak ");
    }

    public void gerak(int Kecepatan) {
        System.out.println(nama + " sedang bergerak dengan Kecepatan "+Kecepatan+" km/h");
    }
    public void cek (){
        System.out.println("cek override");
        super.punyaRoda();
        this.punyaRoda();
    }
    
}
