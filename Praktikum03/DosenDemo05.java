package Praktikum03;
import java.util.Scanner;

public class DosenDemo05 {
    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        int jmlDosen;
        System.out.print("Masukkan jumlah dosen : ");
        jmlDosen = sc05.nextInt();
        sc05.nextLine();
        Dosen05[] arrayOfDosen = new Dosen05[jmlDosen];
        String kode, nama, dummy;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode                        : ");
            kode = sc05.nextLine();
            System.out.print("Nama                        : ");
            nama = sc05.nextLine();
            System.out.print("Jenis kelamin (Pria/Wanita) : ");
            dummy = sc05.nextLine();
            jenisKelamin = dummy.equalsIgnoreCase("Pria");
            System.out.print("Usia                        : ");
            dummy = sc05.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("------------------------------------------");

            arrayOfDosen[i] = new Dosen05(kode, nama, jenisKelamin, usia);

        }

        DataDosen05 dataDsn = new DataDosen05();
        dataDsn.dataSemuaDosen(arrayOfDosen);
        dataDsn.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDsn.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDsn.infoDosenPalingTua(arrayOfDosen);
        dataDsn.infoDosenPalingMuda(arrayOfDosen);
    }
}
