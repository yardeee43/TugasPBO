/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author bachtiar
 */
public class MainClass {
    public static void main(String[] args) {
        SmartPhone samsung = new SmartPhone("android", "samsung", "A55");
        samsung.putarMusic("dear god");
        Phone alcatel = (Phone)samsung;
        alcatel.layar();       
        alcatel.setBrand("alcatel");
        alcatel.setModel("2005D");
        System.out.printf("nama device ini adalah %s dengan model %s \n",alcatel.getBrand(),alcatel.getModel());
        Phone nokia = new Phone("nokia","103");
    }
}
