package Praktikum01;

public class DosenMain05 {
    
    public static void main(String[] args) {
        Dosen05 dosen1 = new Dosen05();
        dosen1.idDosen = "1234567";
        dosen1.nama = "Evina, S.S.T, M.Eng";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2000;
        dosen1.bidangKeahlian = "Teknik informatika";

        dosen1.tampilkanInformasi();
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2025);
        dosen1.ubahKeahlian("Sistem informasi");
        System.out.println();
        dosen1.tampilkanInformasi();


        Dosen05 dosen2 = new Dosen05("242008", "Farid Angga Pribadi, S.Kom.,M.Kom", false, 2018, "Matematika");
        System.out.println();
        dosen2.tampilkanInformasi();
        dosen2.setStatusAktif(true);
        dosen2.hitungMasaKerja(2025);
        dosen2.ubahKeahlian("Sistem Informasi");
        System.out.println();
        dosen2.tampilkanInformasi();
    }
}
