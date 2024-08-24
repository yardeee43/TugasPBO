/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author bachtiar
 */
public class pisces extends hewan {
    String sisik;
    public void airAsin(){
        System.out.println("hidup di air asin");
    }
    public void airTawar(){
        System.out.println("hidup di air tawar");
    }
    public void bersirip(){
        System.out.println("memiliki sirip dan sisik");
    }
    public String getSisik(){
        return sisik;
    }
    public void setSisik(String sisik){
        this.sisik = sisik;
    }
}
