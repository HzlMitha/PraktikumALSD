package Praktikum_B;
import java.util.Scanner;

public class LaguDemo {
    public static void main(String[] args) {
        StackTambahPlaylist stack = new StackTambahPlaylist(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Tambahkan Lagu");
            System.out.println("2. Rating Lagu");
            System.out.println("3. Melihat lagu Teratas di Playlist");
            System.out.println("4. Melihat Daftar Lagu Playlist");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Judul: ");
                    String judul = scan.nextLine();
                    System.out.print("Penyanyi: ");
                    String penyanyi = scan.nextLine();
                    System.out.print("Durasi: ");
                    double durasi = scan.nextDouble();
                    Lagu lg = new Lagu(judul, penyanyi, durasi);
                    stack.push(lg);
                    System.out.printf("Lagu %s berhasil di tambahkan\n", lg.judul);
                    break;
                case 2:
                    Lagu dirating = stack.pop();
                    if (dirating != null) 
                    break;
                case 3:
                    Lagu lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Lagu terakhir yang ditambahkan ke playlist " + lihat.judul);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua lagu playlist");
                    System.out.println("Judul\tPenyanyi\tDurasi");
                    stack.print();
                    break;
                default:
                System.out.println("Pilihan tidak ada");
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
