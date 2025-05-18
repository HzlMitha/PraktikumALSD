package Praktikum08;

public class Surat05 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // S: sakit, I: izin keperluan lain
    int durasi;

    public Surat05 () {

    }
    
    public Surat05 (String idSurat, String namaMhs, String kls, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        namaMahasiswa = namaMhs;
        kelas = kls;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    void tampilkan() {
        System.out.println("ID Surat       : " + idSurat);
        System.out.println("Nama Mahasiswa : " + namaMahasiswa);
        System.out.println("Kelas          : " + kelas);
        System.out.println("Jenis izin     : " + (jenisIzin == 'S' ? "Sakit" : "Izin lain"));
        System.out.println("Durasi         : " + durasi);
    }
}
