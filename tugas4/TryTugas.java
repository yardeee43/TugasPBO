/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

import java.util.Scanner;

/**
 *
 * @author bachtiar
 */
public class TryTugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("masukan angka");
            int angka = sc.nextInt();
            String []nama = {"Hasnan","Cahyo","Bachtiar"};
             System.out.println("list nama");
            for (int i = 0; i <= angka; i++) {
                String string = nama[i];
                System.out.println(string);
            }
        }catch(Exception e){
            System.err.println("Error");
        }
    }
    
}
