package Praktikum01;

public class MataKuliah05 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah05() {

    }

    public MataKuliah05 (String kodeMK, String nmMK, int sks, int jmlJam) {
        this.kodeMK = kodeMK;
        nama = nmMK;
        this.sks = sks;
        jumlahJam = jmlJam;
    }

    void tampilkanInformasi() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Kode mata kuliah                 : " + kodeMK);
        System.out.println("Nama mata kuliah                 : " + nama);
        System.out.println("SKS                              : " + sks);
        System.out.println("Jumlah jam pertemuan Mata kuliah : " + jumlahJam);
        System.out.println("-----------------------------------------------------------------------------");
    }

    void ubahSks(int sksBaru) {
        if (sksBaru >= 0) {
            sks = sksBaru;
        } else {
            System.out.println("Jumlah sks tidak valid");
        }
    }

    void tambahJam (int jam) {
        if (jam >= 0) {
            jumlahJam += jam;
            System.out.println("Jumlah jam pada mata kuliah " + nama +  " bertambah menjadi " + jumlahJam + " jam");
        } else {
            System.out.println("Jumlah jam tidak boleh negatif");
        }
    }

    void kurangiJam (int jam) {
        if (jumlahJam > jam && jumlahJam != jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam pada mata kuliah " + nama + " berkurang menjadi " + jumlahJam + " jam");
        } else {
            System.out.println("Jumlah jam awal lebih kecil dari jam pengurang. Pengurangan tidak dapat dilakukan");
        }
    }
}
