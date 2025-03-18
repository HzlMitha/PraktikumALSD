package Praktikum03;
import java.util.Scanner;

public class MataKuliah05 {
    public String kode, dummy;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah05 () {

    }

    public MataKuliah05 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData() {
        Scanner sc05 = new Scanner(System.in);
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
       
    }
    

    void cetakInfo() {
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah jam : " + jumlahJam);
    }
}
