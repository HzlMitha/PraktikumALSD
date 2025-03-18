package Praktikum03;

public class DataDosen05 {
 
    void dataSemuaDosen (Dosen05[] arrayOfDosen) {
        System.out.println("=====================");
        System.out.println("      DATA DOSEN    ");
        System.out.println("=====================");
        int i = 0;
        for (Dosen05 dsn : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + (i+1));
            System.out.println("Kode          : " + dsn.kode);
            System.out.println("Nama          : " + dsn.nama);
            System.out.println("Jenis Kelamin : " + (dsn.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dsn.usia);
            System.out.println("------------------------------------------");
            i++;
        }
    }

    void jumlahDosenPerJenisKelamin (Dosen05[] arrayOfDosen) {
        int jmlPria = 0;
        int jmlWanita = 0;

        for (Dosen05 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jmlPria++;
            } else {
                jmlWanita++;
            }
        }

        System.out.println("===========================");
        System.out.println("        DATA DOSEN        ");
        System.out.println("(berdasarkan jenis kelamin)");
        System.out.println("===========================");
        System.out.println("Jumlah Dosen Pria: " + jmlPria + " orang");
        System.out.println("Jumlah Dosen Wanita: " + jmlWanita + " orang");
        System.out.println("------------------------------------------");
    }

    void rerataUsiaDosenPerJenisKelamin (Dosen05[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0, jmlPria = 0, jmlWanita = 0;
        for (Dosen05 dosen : arrayOfDosen) {
           if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jmlPria++;
           } else {
                totalUsiaWanita += dosen.usia;
                jmlWanita++;
           }
        }

        System.out.println("=====================");
        System.out.println("    RATA-RATA USIA   ");
        System.out.println("=====================");
        if (jmlPria > 0) {
            System.out.println("Rata-rata usia seluruh Dosen pria : " + totalUsiaPria/jmlPria);
        } else {
            System.out.println("Tidak ada Dosen pria");
        }

        if (jmlWanita > 0) {
            System.out.println("Rata-rata usia seluruh Dosen Wanita : " + totalUsiaWanita/jmlWanita);
        } else {
            System.out.println("Tidak ada Dosen Wanita");
        }
        System.out.println("------------------------------------------");
    }

    void infoDosenPalingTua (Dosen05[] arrayOfDosen) {
        int tertua = 0, indeksDsn = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > tertua) {
                tertua = arrayOfDosen[i].usia;
                indeksDsn = i;
            } 
        }
        
       
        System.out.println("=== DATA DOSEN TERTUA ===");
        System.out.println("Kode          : " + arrayOfDosen[indeksDsn].kode);
        System.out.println("Nama          : " + arrayOfDosen[indeksDsn].nama);
        System.out.println("Jenis Kelamin : " + (arrayOfDosen[indeksDsn].jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + arrayOfDosen[indeksDsn].usia);
        System.out.println("------------------------------------------");
    }

    void infoDosenPalingMuda (Dosen05[] arrayOfDosen) {
        int termuda = 100, indeksDsn = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < termuda) {
                termuda = arrayOfDosen[i].usia;
                indeksDsn = i;
            }
        }

        
        System.out.println("=== DATA DOSEN TERMUDA ===");
        System.out.println("Kode          : " + arrayOfDosen[indeksDsn].kode);
        System.out.println("Nama          : " + arrayOfDosen[indeksDsn].nama);
        System.out.println("Jenis Kelamin : " + (arrayOfDosen[indeksDsn].jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + arrayOfDosen[indeksDsn].usia);
        System.out.println("------------------------------------------");
    }
}
