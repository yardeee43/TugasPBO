/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bachtiar
 */
public class Crud {

    public static void main(String[] args) {
        Konek kon = new Konek();
        Connection conn = kon.koneksi("Pbo", "postgres", "yarde");
        System.out.println("Selamat datang di databaseku\n");
        System.out.println("silahkan pilih sesuatu yang akan dipilih\n1.melihat data\n2.menginputkan data ke dalam tabel\n3.Update data\n4.Delete data");
        System.out.print("pilihan anda : ");
        Scanner sc = new Scanner(System.in);
        int pilihan = sc.nextInt();
        switch (pilihan) {
            
            
            case 1 -> {
                findTable(conn);
                System.out.println("\napakah anda ingin melanjutkan\n1.iya\n2.tidak");
                System.out.print("pilihan anda : ");
                int s = sc.nextInt();
                System.out.println("");
                if (s == 1) {
                    main(args);
                } else {
                    System.out.println("semoga harimu menyenangkan");
                    return;
                }
            }
            case 2 -> {
                System.out.println("masukan nama");
                String nama = sc.next();
                System.out.println("masukan nim");
                String nim = sc.next();
                System.out.println("masukan nama prodi");
                String prodi = sc.next();
                insertData(conn, nama, nim, prodi);
                System.out.println("\napakah anda ingin melanjutkan\n1.iya\n2.tidak");
                System.out.print("pilihan anda : ");
                int s = sc.nextInt();
                System.out.println("");
                if (s == 1) {
                    main(args);
                } else {
                    System.out.println("semoga harimu menyenangkan");
                    return;
                }
            }
            case 3 -> {
                System.out.println("masukan nama baru");
                String nama = sc.next();
                System.out.println("msaukan prodi baru");
                String prodi = sc.next();
                System.out.println("masukan nim");
                String nim = sc.next();
                updateData(conn,  nama, prodi,nim);
                System.out.println("\napakah ingin  melanjutkan\n1.iya\n2.tidak");
                System.out.print("pilihan anda : ");
                int s = sc.nextInt();
                System.out.println("");
                if (s == 1) {
                    main(args);
                } else {
                    System.out.println("semoga harimu menyenangkan");
                    return;
                }

            }
            case 4 -> {
                System.out.println("masukan nim");
                String nim = sc.next();
                deleteData(conn,  nim);
                System.out.println("\napakah ingin  melanjutkan\n1.iya\n2.tidak");
                System.out.print("pilihan anda : ");
                int s = sc.nextInt();
                System.out.println("");
                if (s == 1) {
                    main(args);
                } else {
                    System.out.println("semoga harimu menyenangkan");
                    return;
                }
            }
            default -> {
                System.err.println("\ntolong inputkan nomor dengan benar");
            }
        }

    }

    

    public static void deleteData(Connection conn,  String nim) {
        Statement statement;
        try {
            String query = String.format("Delete from sembarang where nim ='%s'",  nim);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("data berhasil diubah\n");
        } catch (SQLException e) {
            System.out.println("gagal");
        }

    }


    public static void findTable(Connection conn) {
        Statement statement;
        ResultSet rs;
        try {
            String sql = "SELECT * FROM sembarang";
            statement = conn.createStatement();
            statement.execute(sql);
            rs = statement.getResultSet();
            while (rs.next()) {
                System.out.println("");
                System.out.println("Nama: " + rs.getString("nama"));
                System.out.println("NIM: " + rs.getString("nim"));
                System.out.println("Prodi: " + rs.getString("prodi"));
                System.out.println();
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }


    public static void insertData(Connection conn,String nama, String nim, String prodi) {
        PreparedStatement preparedStatement;
        try {
            String sql = "INSERT INTO sembarang (nama, nim, prodi) VALUES (?, ?, ?)";

            preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setString(1, nama);
            preparedStatement.setString(2, nim);
            preparedStatement.setString(3, prodi);

            preparedStatement.executeUpdate();
            System.out.println("Data berhasil ditambahkan\n");

        } catch (SQLException e) {
            System.out.println(e.getMessage() + "\n");
        }
    }

    public static void updateData(Connection conn, String namaBaru,String prodi, String nim) {
        Statement statement;
        try {
            String sql = String.format("Update sembarang set nama = '%s',prodi = '%s' where nim = '%s'", namaBaru,prodi, nim);
            statement = conn.createStatement();
            statement.executeUpdate(sql);
            System.out.println("data berhasil diubah\n");

        } catch (SQLException e) {
            System.out.println("data gagal diubah\n");
        }

    }

}
