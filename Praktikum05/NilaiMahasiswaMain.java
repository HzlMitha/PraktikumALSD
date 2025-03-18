package Praktikum05;

public class NilaiMahasiswaMain {
    public static void main(String[] args) {
        
        int nilaiUTS[] = {78, 85, 90, 76, 92, 83, 82};
        int nilaiUAS[] = {82, 88, 87, 79, 95, 84, 84};

        NilaiMahasiswa05 mhs = new NilaiMahasiswa05(nilaiUTS, nilaiUAS);

        int tertinggi = mhs.utsTinggi(0, nilaiUTS.length - 1);
        System.out.println("=== DIVIDE CONQUER ===");
        System.out.println("Nilai UTS tertinggi  : " + tertinggi);

        int terendah = mhs.utsRendah(0, nilaiUTS.length - 1);
        System.out.println("Nilai UTS terendah   : " + terendah);

        double rrUAS = mhs.hitungUAS();
        System.out.println("=== BRUTE FORCE ===");
        System.out.printf("Rata-rata nilai UAS  : %.2f%n", rrUAS);
    }
}
