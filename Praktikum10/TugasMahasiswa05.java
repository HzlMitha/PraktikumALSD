package Praktikum10;

public class TugasMahasiswa05 {
    String nim;
    String nama;
    String prodi;
    String kelas;
    String keperluan;

    public TugasMahasiswa05(String nim, String nama, String prodi, String kelas, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
        this.keperluan = keperluan;
    }

    public void tampilkanData() {
        System.out.println(nim + "\t" + nama + "\t" + prodi + "\t" + kelas);
        System.out.println("Keperluan : " + keperluan);
        System.out.println();
    }
}

