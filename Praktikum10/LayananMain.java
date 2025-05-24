package Praktikum10;
import java.util.Scanner;

public class LayananMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListLayananMhs05 antrianMhs = new ListLayananMhs05();

        int pilihan;
        do {
            System.out.println("\n=== Menu Antrian Layanan Unit Kemahasiswaan ===");
            System.out.println("1. Daftar Mahasiswa ke Antrian");
            System.out.println("2. Panggil Mahasiswa untuk Proses Layanan");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Lihat Antrian Terdepan");
            System.out.println("5. Lihat Antrian Terakhir");
            System.out.println("6. Cek Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    System.out.println("=== Daftar Mahasiswa ke Antrian ===");
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    System.out.print("Keperluan : ");
                    String keperluan = sc.nextLine();

                    TugasMahasiswa05 m = new TugasMahasiswa05(nim, nama, prodi, kelas, keperluan);
                    antrianMhs.Enqueue(m);
                    break;

                case 2:
                    antrianMhs.Dequeue();
                    break;

                case 3:
                    antrianMhs.print();
                    break;

                case 4:
                    antrianMhs.lihatTerdepan();
                    break;

                case 5:
                    antrianMhs.lihatAkhir();
                    break;

                case 6:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrianMhs.getJumlahAntrian());
                    break;

                case 7:
                    antrianMhs.antrianDikosongkan();
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
