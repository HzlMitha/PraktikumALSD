package Praktikum03;
import java.util.Scanner;

public class MataKuliahDemo05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        int jmlMatKul;
        System.out.print("Masukkan jumlah Mata Kuliah: ");
        jmlMatKul = sc05.nextInt();
        MataKuliah05[] arrayOfMataKuliah = new MataKuliah05[jmlMatKul];
        // String kode, nama, dummy;
        // int sks, jumlahJam;
        sc05.nextLine();

        System.out.println("==== INPUT DATA MATA KULIAH ====");
        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            arrayOfMataKuliah[i] = new MataKuliah05();
            arrayOfMataKuliah[i].tambahData();
        }

        System.out.println("==== INFORMASI MATA KULIAH ====");
        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("-------------------------------------------");
        }

    }
}
