package Praktikum10;

public class Mahasiswa05 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa05(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilkanInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}
