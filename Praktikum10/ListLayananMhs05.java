package Praktikum10;

public class ListLayananMhs05 {
    TugasNodeMhs05 head;
    TugasNodeMhs05 tail;
    int size = 0;

    boolean isEmpty() {
        return (head == null);
    }

    public void Enqueue (TugasMahasiswa05 input) {
        TugasNodeMhs05 ndInput = new TugasNodeMhs05(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        size++;
        System.out.println("Mahasiswa " + input.nama + " telah ditambahkan ke antrian.");
    }

     public void Dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian Layanan masih kosong, tidak dapat memanggil!");
            return;
        }
        TugasMahasiswa05 mhsDilayani = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
        System.out.println("Mahasiswa yang dipanggil untuk layanan unit kemahasiswaan: ");
        System.out.println("NIM \t NAMA \t PRODI \t KELAS");
        mhsDilayani.tampilkanData();
    }

    public void antrianDikosongkan() {
        if (isEmpty()) {
            System.out.println("Antrian Layanan masih kosong, tidak dapat dikosongkan!");
        } else  {
            head = tail = null;
            size = 0;
            System.out.println("Antrian Layanan telah dikosongkan.");
        }
    }

    public void lihatTerdepan() {
        if(isEmpty()) {
            System.out.println("Antrian Layanan kosong.");
        } else {
            System.out.println("Antrian terdepan: ");
             System.out.println("NIM \t NAMA \t PRODI \t KELAS");
            head.data.tampilkanData();
        }
    }

    public void lihatAkhir() {
        if(isEmpty()) {
            System.out.println("Antrian Layanan kosong.");
        } else {
            System.out.println("Antrian terakhir: ");
             System.out.println("NIM \t NAMA \t PRODI \t KELAS");
            tail.data.tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public void print() {
        if (!isEmpty()) {
            TugasNodeMhs05 tmp = head;
            System.out.println("Antrian Layanan Unit Kemahasiswaan:\t");
            while (tmp != null) {
                tmp.data.tampilkanData();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian Layanan Kosong");
        }
    }
}
