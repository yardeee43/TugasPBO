package tugas4;

import java.util.Scanner;

public class BachException extends ArrayIndexOutOfBoundsException {

    public BachException(String s) {
        super(s);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nama = {"Hasnan", "Cahyo", "Bachtiar"};

        System.out.println("List Nama:");
        for (int i = 0; i < nama.length; i++) {
            System.out.println(i + ": " + nama[i]); // Display index with names
        }

        System.out.print("masukan Angka: ");
        int index = sc.nextInt();

        try {
            if (index < 0 || index >= nama.length) { // Check for valid index
                throw new BachException("Diluar Batas Array" + index);
            }
            System.out.println("Nama: " + nama[index]); // Access the name if index is valid
        } catch (BachException e) {
            System.out.println(e.getMessage());
        }
    }
}
