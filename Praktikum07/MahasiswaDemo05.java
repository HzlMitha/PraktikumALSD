package Praktikum07;
import java.util.Scanner;

public class MahasiswaDemo05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = input.nextInt();
        input.nextLine();

        MahasiswaBerprestasi05 list = new MahasiswaBerprestasi05(jmlMhs);

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = input.nextLine();
            System.out.print("Nama  : ");
            String nama = input.nextLine();
            System.out.print("Kelas : ");
            String kelas = input.nextLine();
            System.out.print("IPK   : ");
            double ipk = input.nextDouble();
            input.nextLine();
            System.out.println("-----------------------------------");

            Mahasiswa05 m =  new Mahasiswa05(nim, nama, kelas, ipk);
            list.tambah(m);
        }
            list.tampil();
            //melakukan pencarian data sequential
            System.out.println("-------------------------------------------");
            System.out.println("Pencarian data");
            System.out.println("-------------------------------------------");
            System.out.println("Masukkan ipk mahasiswa yang dicari: ");
            System.out.print("IPK: ");
            double cari = input.nextDouble();

            System.out.println("menggunakan sequential searching");
            double posisi = list.sequentialSearching(cari);
            int pss = (int) posisi;
            list.tampilPosisi(cari, pss);
            list.tampilDataSearch(cari, pss);

            //melakukan pencarian data Binary
            System.out.println("--------------------------------------");
            System.out.println("menggunakan binary search");
            System.out.println("--------------------------------------");
            double posisi2 = list.findBinarySearch(cari, 0, jmlMhs-1);
            int pss2 = (int) posisi2;
            list.tampilPosisi(cari, pss2);
            list.tampilDataSearch(cari, pss2);

        // System.out.println("Data mahasiswa sebelum sorting: ");
        // list.tampil();

        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        // list.insertionSort();
        // list.tampil();
    }
}
