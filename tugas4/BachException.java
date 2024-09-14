/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author bachtiar
 */
public class BachException extends Exception{
    public BachException(String s){
        super(s);
    }
    public static void main(String[] args) {
        try {
            throw new BachException("gok gok");
        } catch (BachException e) {
            System.err.println("tertangkap");
            System.out.println(e.getMessage());
        }
    }
    
}
