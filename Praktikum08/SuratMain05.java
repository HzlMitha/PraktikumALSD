package Praktikum08;
import java.util.Scanner;

public class SuratMain05 {
    public static void main(String[] args) {
        StackSuratMahasiswa05 stack = new StackSuratMahasiswa05(20);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do{
            System.out.println("\nMenu:");
            System.out.println("1. Menerima Surat Izin");
            System.out.println("2. Memproses Surat Izin");
            System.out.println("3. Melihat Surat Izin Terakhir");
            System.out.println("4. Mencari Surat Izin");
            System.out.println("0. Keluar Program");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("=== DATA SURAT ===");
                    System.out.print("ID Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jnsIzin = scan.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
                    Surat05 suratMhs = new Surat05(idSurat, nama, kelas, jnsIzin, durasi);
                    stack.terimaSurat(suratMhs);
                    System.out.printf("Surat %s berhasil dikumpulkan\n", suratMhs.namaMahasiswa);
                    break;
                case 2:
                    System.out.println("=== PROSES SURAT ===");
                    stack.prosesSurat();
                    break;
                case 3:
                    Surat05 lihat = stack.liatSuratTerakhir();
                    if (lihat != null) {
                        System.out.println("Surat izin terakhir dikumpulkan oleh " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.println("==== Pencarian Surat Izin berdasarkan Nama ===");
                    System.out.print("Masukkan nama yang dicari: ");
                    String cariNama = scan.nextLine();
                    stack.cariSurat(cariNama);
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilih != 0);
    }
}
