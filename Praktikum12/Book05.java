package Praktikum12;

public class Book05 {
    public String isbn;
    public String title;

    public Book05() {

    }

    public Book05(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String getKode() {
        return isbn;
    }

    public String getJudul() {
        return title;
    }

    public String toString() {
        return "ISBN: " + this.isbn + " Title: " + this.title;
    }
}
