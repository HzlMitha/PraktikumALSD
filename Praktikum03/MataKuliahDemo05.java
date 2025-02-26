package Praktikum03;
import java.util.Scanner;

public class MataKuliahDemo05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        int jmlMatKul;
        System.out.print("Masukkan jumlah Mata Kuliah: ");
        jmlMatKul = sc05.nextInt();
        MataKuliah05[] arrayOfMataKuliah = new MataKuliah05[jmlMatKul];
        String kode, nama, dummy;
        int sks, jumlahJam;
        sc05.nextLine();

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan Data MataKuliah ke-" + (i+1));
            System.out.print("Kode       : ");
            kode = sc05.nextLine();
            System.out.print("Nama       : ");
            nama = sc05.nextLine();
            System.out.print("SKS        : ");
            dummy = sc05.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam : ");
            dummy = sc05.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------------------------");

            arrayOfMataKuliah[i] = new MataKuliah05(kode, nama, sks, jumlahJam);
            arrayOfMataKuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("-------------------------------------------");
        }

    }
}
