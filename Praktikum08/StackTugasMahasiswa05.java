package Praktikum08;

public class StackTugasMahasiswa05 {
    Mahasiswa05[] stack;
    int top;
    int size;

    public StackTugasMahasiswa05 (int size) {
        this.size = size;
        stack = new Mahasiswa05[size];
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

    public void push (Mahasiswa05 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa05 pop() {
        if(!isEmpty()) {
            Mahasiswa05 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa05 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public void lihatTugasTerbawah() {
        if (!isEmpty()) {
            System.out.println("Tugas pertama dikumpulkan oleh " + stack[0].nama);
        } else {
            System.out.println("Stack kosong! Tidak ada tugas dikumpulkan");
        }
    }

    public int jumlahTugas () {
        return top + 1;
    }
    
    public String konversiDesimalKeBiner (int kode) {
        StackKonversi05 stack = new StackKonversi05();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
