package Praktikum06;
import java.util.Scanner;

public class DosenDemo05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        DataDosen05 list = new DataDosen05(5);

        int pilihan;
        do {
            System.out.println(" ====== MENU ======");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Termuda - Tertua)");
            System.out.println("4. Sorting DESC (Tertua - Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc05.nextInt();
            sc05.nextLine();

            switch (pilihan) {
                case 1:
                    if (list.idx < 5) {
                        System.out.println("Masukkan Data Dosen ke-" + (list.idx + 1));
                        System.out.print("Kode Dosen          : ");
                        String kode = sc05.nextLine();
                        System.out.print("Nama Dosen          : ");
                        String nama = sc05.nextLine();
                        System.out.print("Jenis Kelamin (L/W) : ");
                        String jenisKelamin = sc05.nextLine();
                        System.out.print("Umur Dosen          : ");
                        int umur = sc05.nextInt();
                        sc05.nextLine();

                        Dosen05 d = new Dosen05(kode, nama, jenisKelamin, umur);
                        list.tambah(d);
                        System.out.println("Data berhasil ditambahkan");
                        System.out.println();
                    } else {
                        System.out.println("Kapasitas Data Dosen penuh maksimal 5 data");
                    } 
                    break;

                case 2:
                    System.out.println(" ====== DATA DOSEN ======");
                    list.tampil();
                    break;
                
                case 3:
                    System.out.println(" ====== Sorting ASC ======");
                    list.sortingASC();
                    list.tampil();
                    break;

                case 4:
                    System.out.println(" ====== Sorting DESC ======");
                    list.sortingDSC();
                    list.tampil();
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini");
                    break;
                    
                default:
                    System.out.println("Pilihan menu tidak ada");
                    break;
            }
        } while (pilihan != 5);

        sc05.close();
    }
}