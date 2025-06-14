package Praktikum12;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Book05 book1 = new Book05("1234", "Dasar Pemograman");
        Book05 book2 = new Book05("7145", "Hafalah Shalat Delisa");
        Book05 book3 = new Book05("3562", "Muhammad Al-Fatih");

        Stack<Book05> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book05 temp = books.peek();

        if (temp != null) {
            System.out.println(temp.toString());
        }

        Book05 temp2 = books.pop();

        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        for (Book05 book : books) {
            System.out.println(book.toString());
        }

        System.out.println(books);

        Book05 bookTarget = book2;
        int posisi = books.search(bookTarget);
        System.out.println("Posisi Buku : " + posisi);
    }    
}
