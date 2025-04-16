package Praktikum01;
import java.util.Scanner;
public class MataKuliahMain05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlMk;
        
        System.out.println("Masukkan jumlah mata kuliah: ");
        jmlMk = sc.nextInt();
        sc.nextLine();
        MataKuliah05[] matKul1 = new MataKuliah05[jmlMk];
        // matKul1.kodeMK = "SIB2420004";
        // matKul1.nama = "Algoritma dan Struktur Data";
        // matKul1.sks = 1;
        // matKul1.jumlahJam = 4;
        for (int i = 0; i < jmlMk; i++) {
            matKul1[i] = new MataKuliah05();
            System.out.println(" === INPUT MATA KULIAH === ");
            System.out.println("Kode      : " );
            matKul1[i].kodeMK = sc.nextLine();
            System.out.println("nama      : " );
            matKul1[i].nama = sc.nextLine();
            System.out.println("sks       : " );
            matKul1[i].sks = sc.nextInt();
            System.out.println("jumlah jam: " );
            matKul1[i].jumlahJam = sc.nextInt();
            System.out.println();
            

            matKul1[i] = new MataKuliah05();
            matKul1[i].tampilkanInformasi();
            matKul1[i].ubahSks(2);
            matKul1[i].tambahJam(1);
            matKul1[i].kurangiJam(5);
            matKul1[i].tampilkanInformasi();


        }

        // matKul1.tampilkanInformasi();
        // matKul1.ubahSks(2);
        // matKul1.tambahJam(1);
        // matKul1.kurangiJam(5);
        // matKul1.tampilkanInformasi();

        MataKuliah05 matkul2 = new MataKuliah05("SIB242007", "Praktikum Basis Data", 4, 4);
        matkul2.tampilkanInformasi();
        matkul2.ubahSks(2);
        matkul2.tambahJam(2);
        matkul2.kurangiJam(1);
        matkul2.tampilkanInformasi();
        sc.close();
    }
}
