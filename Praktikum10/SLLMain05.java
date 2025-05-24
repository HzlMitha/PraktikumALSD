package Praktikum10;
import java.util.Scanner;

public class SLLMain05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SingleLinkedList05 sll = new SingleLinkedList05();
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jml; i++) {
            System.out.println("=== Data Mahasiswa ke-" + (i+1) + " ===");
            System.out.print("NIM    : ");
            String nim = input.nextLine();
            System.out.print("Nama   : ");
            String nama = input.nextLine();
            System.out.print("Kelas  : ");
            String kelas = input.nextLine();
            System.out.print("IPK    : ");
            double ipk = input.nextDouble();
            input.nextLine();

            Mahasiswa05 mhs = new Mahasiswa05(nim, nama, kelas, ipk);
            if (i == 0) {
                sll.addFirst(mhs);
            } else {
                sll.addLast(mhs);
            }
        }
        System.out.println();
        System.out.println("=== List Mahasiswa ===");
        sll.print();
    }
}
