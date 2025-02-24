package Praktikum01;

public class MataKuliahMain05 {
    
    public static void main(String[] args) {
        MataKuliah05 matKul1 = new MataKuliah05();
        matKul1.kodeMK = "SIB2420004";
        matKul1.nama = "Algoritma dan Struktur Data";
        matKul1.sks = 1;
        matKul1.jumlahJam = 4;

        matKul1.tampilkanInformasi();
        matKul1.ubahSks(2);
        matKul1.tambahJam(1);
        matKul1.kurangiJam(5);
        matKul1.tampilkanInformasi();

        MataKuliah05 matkul2 = new MataKuliah05("SIB242007", "Praktikum Basis Data", 4, 4);
        matkul2.tampilkanInformasi();
        matkul2.ubahSks(2);
        matkul2.tambahJam(2);
        matkul2.kurangiJam(1);
        matkul2.tampilkanInformasi();
    }
}
