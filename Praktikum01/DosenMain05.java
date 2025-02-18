package Praktikum01;

public class DosenMain05 {
    
    public static void main(String[] args) {
        Dosen05 dosen2 = new Dosen05("242008", "Adevian Fairuz Pratama, S.S.T, M.Eng.", true, 2018, "Matematika");
        dosen2.tampilkanInformasi();
        dosen2.setStatusAktif(false);
        dosen2.hitungMasaKerja(2025);
        dosen2.ubahKeahlian("Sistem Informasi");
        System.out.println();
        dosen2.tampilkanInformasi();
    }
}
