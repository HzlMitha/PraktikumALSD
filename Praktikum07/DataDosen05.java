package Praktikum07;

public class DataDosen05 {
    Dosen05[] listDsn;
    int idx = 0;

    public DataDosen05(int jml) {
        listDsn = new Dosen05[jml];
    }

    void tambah(Dosen05 d) {
        if(idx < listDsn.length) {
            listDsn[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        if(idx == 0) {
            System.out.println("Data masih kosong");
            return;
        }

        for (int i = 0; i < idx; i++) {
            listDsn[i].tampil();
        }
    }

    void sortingASC() {
        if (idx <= 1) {
            System.out.println("Data belum cukup untuk diurutkan");
            return;
        }

        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listDsn[j].usia > listDsn[j + 1].usia) {
                    Dosen05 tmp = listDsn[j];
                    listDsn[j] = listDsn[j + 1];
                    listDsn[j + 1] = tmp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (listDsn[j].usia > listDsn[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen05 tmp = listDsn[maxIdx];
            listDsn[maxIdx] = listDsn[i];
            listDsn[i] = tmp;
        }
    }

    void sequentialSearching(String cari) {
        int count = 0;
        int posisi = -1;

        for(int j=0; j<listDsn.length; j++) {
            if (listDsn[j].nama.equalsIgnoreCase(cari)) {
                if (posisi == -1) {
                    posisi = j;
                }
                count++;
            }
        }

        if (posisi != -1) {
            tampilDataSearchNama(cari, posisi);
            if (count > 1) {
                System.out.println("Peringatan: Ditemukan " + count + " data dengan nama " + cari);
            }
        } else {
            System.out.println("Data Dosen dengan nama " + cari + "tidak ditemukan");
        }
    }

    
    void tampilDataSearchNama(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode\t\t : " + listDsn[pos].kode);
            System.out.println("Nama\t\t : " + x);
            System.out.println("Jenis kelamin\t : " + listDsn[pos].jenisKelamin);
            System.out.println("usia\t\t : " + listDsn[pos].usia);
        } else {
            System.out.println("Data Dosen dengan nama " + x + " tidak ditemukan");
        }
    }

    void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data Dosen dengan usia : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data Dosen dengan usia " + x + " tidak ditemukan");
        }
    }


    void tampilDataSearch(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode\t\t : " + listDsn[pos].kode);
            System.out.println("Nama\t\t : " + listDsn[pos].nama);
            System.out.println("Jenis kelamin\t : " + listDsn[pos].jenisKelamin);
            System.out.println("usia\t\t : " + x);
        } else {
            System.out.println("Data Dosen dengan usia " + x + " tidak ditemukan");
        }
    }

    int findBinarySearch(int cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            
            if (listDsn[mid].usia == cari) {
                return mid;  // Ditemukan
            } else if (listDsn[mid].usia > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;  // Tidak ditemukan
    }
    
    void findAndWarnBinarySearch(int cari, int left, int right) {
        int posisi = findBinarySearch(cari, left, right);
    
        if (posisi == -1) {
            System.out.println("Data Dosen dengan usia " + cari + " tidak ditemukan.");
            return;
        }
    
        int count = 1;
        
        // Cek ke kiri
        int i = posisi - 1;
        while (i >= left && listDsn[i].usia == cari) {
            count++;
            i--;
        }
    
        // Cek ke kanan
        int j = posisi + 1;
        while (j <= right && listDsn[j].usia == cari) {
            count++;
            j++;
        }
    
        // Tampilkan data utama
        tampilPosisi(cari, posisi);
        tampilDataSearch(cari, posisi);
    
        // Beri peringatan jika lebih dari 1 hasil ditemukan
        if (count > 1) {
            System.out.println("Peringatan: Ditemukan " + count + " dosen dengan usia " + cari + ".");
        }
    }
    
}
