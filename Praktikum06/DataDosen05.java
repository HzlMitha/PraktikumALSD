package Praktikum06;

public class DataDosen05 {
    Dosen05[] listDsn;
    int idx = 0;

    public DataDosen05(int jumlah) {
        listDsn = new Dosen05[jumlah];
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
            for (int j = 1; j < idx - i; j++) {
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
}
