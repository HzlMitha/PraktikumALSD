package Praktikum01;

public class Dosen05 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    int masaKerja;
    String bidangKeahlian;

    public Dosen05 () {

    }

    public Dosen05 (String idDsn, String nma, boolean statusAktif, int thnGabung, String bidangAhli) {
        idDosen = idDsn;
        nama = nma;
        this.statusAktif = statusAktif;
        tahunBergabung = thnGabung;
        bidangKeahlian = bidangAhli;
        this.masaKerja = 0;
    }

    void tampilkanInformasi() {
        System.out.println("-------------------------------------------------");
        System.out.println("ID Dosen             : " + idDosen);
        System.out.println("Nama                 : " + nama);
        System.out.println("Status dosen         : " + (statusAktif ? "Aktif" : "Tidak aktif"));
        System.out.println("Tahun bergabung      : " + tahunBergabung);
        System.out.println("Masa kerja dosen     : " + masaKerja + " tahun");
        System.out.println("Bidang keahlian dosen: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        this.statusAktif = status;
        
    }

    int hitungMasaKerja(int thnSkrng) {
        masaKerja = thnSkrng - tahunBergabung;
        return masaKerja;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
