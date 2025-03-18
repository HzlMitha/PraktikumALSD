package Praktikum03;
import java.util.Scanner;

public class MahasiswaTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlMhs, jmlDsn, jmlMk;
        System.out.print("Masukkan jumlah mahasiswa  : ");
        jmlMhs = input.nextInt();
        System.out.print("Masukkan jumlah Dosen      : ");
        jmlDsn = input.nextInt();
        System.out.print("Masukkan jumlah Mata Kuliah: ");
        jmlMk = input.nextInt();
        input.nextLine();
        
        String namaDsn, npDsn;
        String namaMK, kodeMK;

        DosenTest05[] dsn = new DosenTest05[jmlDsn];
        for (int i = 0; i < dsn.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Nama Dosen  : ");
            namaDsn = input.nextLine();
            System.out.print("NIP Dosen   : ");
            npDsn = input.nextLine();
            System.out.println();

            dsn[i] = new DosenTest05(namaDsn, npDsn);
        }

        MatakulTest[] mk = new MatakulTest[jmlMk];
        for (int i = 0; i < mk.length; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i+1));
            System.out.print("Nama Mata Kuliah : ");
            namaMK = input.nextLine();
            System.out.print("Kode Mata Kuliah : ");
            kodeMK = input.nextLine();
            System.out.println();

            mk[i] = new MatakulTest(namaMK, kodeMK);
        } 

        MhsTest05[] mhs = new MhsTest05[jmlMhs];
        String nma, nim, kelas;
        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan Data mahasiswa ke-" + (i + 1));
            System.out.print("Nama    : ");
            nma = input.nextLine();
            System.out.print("NIM     : ");
            nim = input.nextLine();
            System.out.print("Kelas   : ");
            kelas = input.nextLine();

            mhs[i] = new MhsTest05(nma, nim, kelas, dsn[i], mk[i]);
            mhs[i].cetak();
        }


    }
}
