package Praktikum03;

public class MhsTest05 {
    public static String nma;
    public String nama;
    public String nim;
    public String kelas;
    public DosenTest05 dosen;
    public MatakulTest mk;

    public MhsTest05(String nama, String nim, String kelas, DosenTest05 dsn, MatakulTest mk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        dosen = dsn;
        this.mk = mk;
    }

    void cetak() {
        System.out.println();
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println();
        System.out.println("=== DATA DOSEN ===");
        System.out.println("Dosen: " + dosen.nama);
        System.out.println("NIP Dosen: " + dosen.nip);
        System.out.println();
        System.out.println("=== DATA MATAKUL ===");
        System.out.println("Matakul: " + mk.nama);
        System.out.println("Kode Matakul: " + mk.kode);

    } 

    String getNama() {
        return nama;
    }

    String getNim() {
        return nim;
    }

    String getKelas() {
        return kelas;
    }

    public DosenTest05 getDosen() {
        return dosen;
    }

    public MatakulTest getMk() {
        return mk;
    }
}
