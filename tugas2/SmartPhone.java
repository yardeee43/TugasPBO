/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author bachtiar
 */
public class SmartPhone extends Phone implements FungsiInterface, AdvanceFungsiInterface {

    private String os;

    public SmartPhone(String os, String brand, String model) {
        super(brand, model); 
        this.os = os;
        System.out.printf("Nama smartphone ini adalah %s dengan model %s dari OS %s\n", brand, model, os);
        this.layar();
        System.out.print("device ini tidak ");
        super.layar();
    }

    public void layar() {
        System.out.println("device ini sudah menggunakan fitur touchScreen");
    }

    /**
     * @return the os
     */
    public String getOs() {
        return os;
    }

    /**
     * @param os the os to set
     */
    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public void browsing() {
        System.out.println("Device ini sudah bisa browsing " + super.getBrand());
    }

    @Override
    public void ambilFoto() {
        System.out.println("sedang mengambil foto");
    }

    @Override
    public void putarMusic(String music) {
        System.out.println("sedang memainkan music  " + music);
    }

}
