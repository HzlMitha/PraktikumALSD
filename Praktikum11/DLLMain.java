package Praktikum11;
import java.util.Scanner;

public class DLLMain {
    public static void main(String[] args) {
        DoubleLinkedList05 list = new DoubleLinkedList05();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Tambah di tengah");
            System.out.println("4. Hapus di awal");
            System.out.println("5. Hapus di akhir");
            System.out.println("6. Hapus di tengah");
            System.out.println("7. Hapus berdasarkan indeks");
            System.out.println("8. Tampilkan data");
            System.out.println("9. Cari Mahasiswa berdasarkan NIM");
            System.out.println("10. Tampilkan Jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa05 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa05 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3 -> {
                    System.out.print("Masukkan key NIM yang ingin ditambahkan: ");
                    String keyNim = scan.nextLine();
                    Mahasiswa05 mhs = inputMahasiswa(scan);
                    list.insertAfter(keyNim, mhs);
                }
                case 4 -> list.removeFirst();
                case 5 -> list.removeLast();
                case 6 -> {
                    System.out.print("Masukkan key NIM yang ingin dihapus: ");
                    String keyNim = scan.nextLine();
                    list.removeAfter(keyNim);
                }
                case 7 -> {
                    System.out.print("Masukkan index yang ingin dihapus: ");
                    int index = scan.nextInt();
                    list.remove(index);
                }
                case 8 -> list.print();
                case 9 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node05 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan: ");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 10 -> System.out.println("Jumlah Data : " + list.size());
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
            }
                  
        } while (pilihan != 0);
        scan.close();
    }

        public static Mahasiswa05 inputMahasiswa (Scanner scan) {
        System.out.print("NIM   : ");
        String nim = scan.nextLine();
        System.out.print("Nama  : ");
        String nama = scan.nextLine();
        System.out.print("Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine();

        return new Mahasiswa05 (nim, nama, kelas, ipk);
    }
}
