/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author bachtiar
 */
public class ThrowTugas {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        String []nama = {"Hasnan","Cahyo","Bachtiar"};
        System.out.println("list nama");
            for (int i = 0; i <= 3; i++) {
                String string = nama[i];
                System.out.println(string);
            }
    }
    
}
