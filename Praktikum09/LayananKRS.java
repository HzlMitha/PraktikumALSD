package Praktikum09;
import java.util.Scanner;

public class LayananKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS05 antrian = new AntrianKRS05(10);

        int pilihan;
        do {
            System.out.println("\n=== Menu Antrian KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil 2 Mahasiswa untuk Proses KRS");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Lihat 2 Mahasiswa Terdepan");
            System.out.println("5. Lihat Mahasiswa Terakhir");
            System.out.println("6. Cek Jumlah Antrian");
            System.out.println("7. Cek Jumlah Mahasiswa Sudah Proses KRS");
            System.out.println("8. Cek Jumlah Mahasiswa Belum Proses KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    System.out.println("=== Tambah Mahasiswa ke Antrian ===");
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mahasiswa m = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(m);
                    break;

                case 2:
                    antrian.memanggilMahasiswa();
                    break;

                case 3:
                    antrian.tampilkanSemua();
                    break;

                case 4:
                    antrian.lihatDuaTerdepan();
                    break;

                case 5:
                    antrian.lihatAkhir();
                    break;

                case 6:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;

                case 7:
                    antrian.jumlahDiproses();
                    break;

                case 8:
                    antrian.jumlahBelumDiproses();
                    break;

                case 9:
                    antrian.mengosongkanAntrian();
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
