/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author bachtiar
 */
public class reptil extends hewan {
    void bersisik(){
        System.out.println("saya memiliki sisik");
    }
    public reptil (String nama){
        System.out.println("nama saya "+nama);
    }
    public reptil (int kaki){
        kaki = 2;
        System.out.println("kaki saya "+kaki);
        this.setJumlahKaki(kaki);
        super.setJumlahKaki(kaki);
    }
    public reptil (double tangan){
        System.out.println("");
    }
}
