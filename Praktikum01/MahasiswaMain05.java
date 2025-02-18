package Praktikum01;

public class MahasiswaMain05 {
    
    public static void main(String[] args) {
        Mahasiswa05 mhs1 = new Mahasiswa05();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.6);
        mhs1.tampilkanInformasi();

        Mahasiswa05 mhs2 = new Mahasiswa05("Annisa Nabila", "21417220160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa05 mhsMitha = new Mahasiswa05("Dian Paramitha", "244107060049", 3.4, "TI 1A");
        mhsMitha.updateIpk(3.9);
        mhsMitha.ubahKelas("SIB 1D");
        mhsMitha.tampilkanInformasi();
    }
}
