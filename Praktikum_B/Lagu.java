package Praktikum_B;

public class Lagu {
    String judul, penyanyi;
    double durasi;
    int rating;

    Lagu(String judul, String penyanyi, double durasi) {
        this.judul = judul;
        this.penyanyi = penyanyi;
        this.durasi = durasi;
        rating = -1;
    }

    void ratingDinilai(int rating) {
        this.rating = rating;
    }

    
}
