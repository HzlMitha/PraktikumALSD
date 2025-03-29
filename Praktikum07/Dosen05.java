package Praktikum07;

public class Dosen05 {
    String kode;
    String nama;
    String jenisKelamin;
    int usia;

    Dosen05(String kd, String nm, String jk, int usia) {
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        this.usia = usia;
    }

    void tampil() {
        System.out.println("Kode                : " + kode);
        System.out.println("Nama                : " + nama);
        System.out.println("Jenis Kelamin (L/W) : " + (jenisKelamin.equalsIgnoreCase("L") ? "Laki-laki" : "Wanita"));
        System.out.println("Usia                : " + usia);
        System.out.println("--------------------------------");
    }
}
