package Praktikum05;

public class NilaiMahasiswa05 {
    int nilaiUTS [];
    int nilaiUAS [];

    public NilaiMahasiswa05(int uts[], int uas[]) {
        nilaiUTS = uts;
        nilaiUAS = uas;
    }

    int tertinggi (int a, int b) {
        return(a > b) ? a : b;
    }

    int utsTinggi (int a, int b) {
        if (a == b) {
            return nilaiUTS[a];
        }
        int total = (a + b) / 2;
        int tga = utsTinggi(a, total);
        int tgb = utsTinggi(total + 1, b);
        return tertinggi(tga, tgb);
    }

    int terendah (int a, int b) {
        return(a < b) ? a : b;
    }

    int utsRendah (int a, int b) {
        if (a == b) {
            return nilaiUTS[b];
        }
        int total = (a + b) / 2;
        int tga = utsRendah(a,total);
        int tgb = utsRendah(total+1,b);
        return terendah(tga, tgb);
    }

    double hitungUAS() {
        int total = 0;
        for (int nilai : nilaiUAS) {
            total += nilai;
        }
        return (double) total / nilaiUAS.length;
    }
}
