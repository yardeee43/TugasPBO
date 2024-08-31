/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author bachtiar
 */
public class mainClass {
    public static void main(String[] args) {
        smartPhone samsung = new smartPhone("android", "samsung", "A55");
        System.out.print("device "+samsung.getBrand());
        samsung.telpon("081990880078");
        samsung.touchscreen();
        phone nokia = (phone)samsung;
        nokia.setBrand("nokia");
        nokia.setModel("3310");
        System.out.println("nama phone ini adalah "+nokia.getBrand()+" dengan brand "+nokia.getModel());
        System.out.print("device "+nokia.getBrand());
        nokia.sms("hi, how are you", "081990880078");  
        
    }
}
