package Praktikum08;

public class StackSuratMahasiswa05 {
    Surat05[] stack;
    int size;
    int top;

    public StackSuratMahasiswa05 (int size) {
        this.size = size;
        stack = new Surat05[size];
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

    public void terimaSurat (Surat05 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa memasukkan data surat.");
        }
    }

    public void prosesSurat() {
        if(!isEmpty()) {
            Surat05 surat = stack[top--];
            System.out.println("Surat berikut diproses: ");
            surat.tampilkan();
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
        }
    }

    public Surat05 liatSuratTerakhir() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang dimasukkan.");
            return null;
        }
    }

    public void cariSurat(String cari) {
        boolean ditemukan = false;
    
        for (int i = top; i >= 0; i--) {
           if ( stack[i].namaMahasiswa.equalsIgnoreCase(cari)) {
                stack[i].tampilkan();
                ditemukan = true;
                break;
           }
        }
        
        if (ditemukan) {
            System.out.println("Surat dengan nama '" + cari + "' ditemukan.");
        } else {
            System.out.println("Surat '" + cari + "' tidak ditemukan.");
        }

    }
}
