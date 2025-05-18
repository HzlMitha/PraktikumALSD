package Praktikum_B;

import Praktikum_A.Buku;

public class StackTambahPlaylist {
    int size;
    int top;
    Lagu[] stack;

    public StackTambahPlaylist(int size) {
        this.size = size;
        stack = new Lagu[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size-1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Lagu lg) {
        if (!isFull()) {
            top++;
            stack[top] = lg;
        } else {
            System.out.println("Stack penuh! tidak bisa menambahkan Playlist lagu lagi.");
        }
    
    }

    public Lagu pop() {
        if (!isEmpty()) {
            Lagu l = stack[top];
            top--;
            return l;
        } else {
            System.out.println("Stack kosong! Tidak ada lagu di dalam playlist untuk di rating.");
            return null;
        }
    }

    public Lagu peek() {
        if(!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! tidak ada Lagu yang ditambahkan");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].judul + "\t" + stack[i].penyanyi + "\t" + stack[i].durasi);
        }
        System.out.println("");
    }

    
}
