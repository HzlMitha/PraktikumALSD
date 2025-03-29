package Praktikum07;
import java.util.ArrayList;
import java.util.Scanner;

public class DosenDemo05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        int jmlDsn;
        System.out.print("Masukkan jumlah data dosen: ");
        jmlDsn = sc05.nextInt();
        DataDosen05 list = new DataDosen05(jmlDsn);

        int pilihan;
        do {
            System.out.println(" ====== MENU ======");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Pencarian Data Dosen berdasarkan nama");
            System.out.println("4. Pencarian Data Dosen berdasarkan usia");
            System.out.println("5. Sorting ASC (Termuda - Tertua)");
            System.out.println("6. Sorting DESC (Tertua - Termuda)");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu (1-7): ");
            pilihan = sc05.nextInt();
            sc05.nextLine();

            switch (pilihan) {
                case 1:
                    if (list.idx < jmlDsn) {
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
                    //melakukan pencarian data sequential
                    System.out.println("-------------------------------------------");
                    System.out.println("Pencarian data berdasarkan Nama");
                    System.out.println("-------------------------------------------");
                    System.out.print("Masukkan nama Dosen yang dicari: ");
                    String cari = sc05.nextLine();

                    System.out.println("Menggunakan Sequential Searching");
                    list.sequentialSearching(cari);
                    break;

                    // System.out.println("menggunakan sequential searching");
                    // int posisi = list.sequentialSearching(cari);
                    // int pss = posisi;
                    // list.tampilDataSearchNama(cari, pss);
                    // break;
                
                case 4:
                    //melakukan pencarian data Binary
                    System.out.println("-------------------------------------------");
                    System.out.println("Pencarian data berdasarkan Usia");
                    System.out.println("-------------------------------------------");
                    System.out.print("Masukkan usia dosen yang dicari: ");
                    int cari2 = sc05.nextInt();
                    System.out.println("Menggunakan Binary Search");

                    list.sortingASC();
                    list.findAndWarnBinarySearch(cari2, 0, jmlDsn - 1);
                    break;
                    // int posisi2 = list.findBinarySearch(cari2, 0, jmlDsn-1);
                    // int pss2 = posisi2;
                    // list.tampilPosisi(cari2, pss2);
                    // list.tampilDataSearch(cari2, pss2);
                    // break;

                case 5:
                    System.out.println(" ====== Sorting ASC ======");
                    list.sortingASC();
                    list.tampil();
                    break;

                case 6:
                    System.out.println(" ====== Sorting DESC ======");
                    list.sortingDSC();
                    list.tampil();
                    break;

                case 7:
                    System.out.println("Terima kasih telah menggunakan program ini");
                default:
                    System.out.println("Pilihan menu tidak ada");
                    break;
            }
        } while (pilihan != 5);

        sc05.close();
    }
}