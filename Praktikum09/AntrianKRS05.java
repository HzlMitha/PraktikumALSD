package Praktikum09;

public class AntrianKRS05 {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int totalDiproses;
    int totalMasuk;
    int maxDiproses;

    public AntrianKRS05(int max) {
        this.max = max;
        data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
        totalDiproses = 0;
        totalMasuk = 0;
        maxDiproses = 30;
    }

     public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        totalMasuk++;
        System.out.println("Mahasiswa dengan nama " + mhs.nama + " berhasil masuk ke antrian.");
    }

    public Mahasiswa[] memanggilMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        } 

        if (size < 2) {
            System.out.println("Antrian hanya terdiri dari satu orang");
            return null;
        }

        if (totalDiproses >= maxDiproses) {
            System.out.println("DPA telah memproses maksimal 30 mahasiswa.");
            return null;
        }

        Mahasiswa[] mhsPasangan = new Mahasiswa[2];
        mhsPasangan[0] = data[front];
        mhsPasangan[1] = data[(front + 1) % max];

        front = (front + 2) % max;
        size -= 2;
        totalDiproses += 2;

        System.out.println("Mahasiswa yang diproses untuk KRS: ");
        mhsPasangan[0].tampilkanData();
        mhsPasangan[1].tampilkanData();
        return mhsPasangan;
    }

    public void mengosongkanAntrian() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void tampilkanSemua() {
        if(isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
     public void lihatDuaTerdepan() {
        if(isEmpty()) {
            System.out.println("Antrian kosong.");
        } else if (size > 1) {
           System.out.println("2 Mahasiswa terdepan dalam antrian: ");
           System.out.println("NIM - NAMA - PRODI - KELAS");
           data[front].tampilkanData();
           data[(front + 1) % max].tampilkanData();
        } else {
            System.out.println("Antrian hanya 1 orang");
            data[front].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if(isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public void jumlahDiproses() {
        System.out.println("Jumlah mahasiswa yang sudah melakukan proses KRS: " + totalDiproses);
    }

    public void jumlahBelumDiproses() {
        System.out.println("Jumlah mahasiswa yang belum melakukan proses KRS: " + (totalMasuk - totalDiproses));
    }
}
