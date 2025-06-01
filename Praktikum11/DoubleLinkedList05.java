package Praktikum11;

public class DoubleLinkedList05 {
    Node05 head;
    Node05 tail;

    public DoubleLinkedList05() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa05 data) {
        Node05 newNode = new Node05(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa05 data) {
        Node05 newNode = new Node05(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter (String keyNim, Mahasiswa05 data) {
        Node05 current = head;

        //Cari node dengan nim = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node05 newNode = new Node05(data);

        // Jika current adalah tail, cukup tambahkan di akhir
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            // sisipkan di tengah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public int size() {
        int size = 0;
        Node05 current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public void add(int index, Mahasiswa05 data) {
        if (index < 0 || index > size()) {
            System.out.println("Index tidak valid.");
            return;
        }
        Node05 newNode = new Node05(data);

        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == size()) {
            addLast(data);
            return;
        }

        Node05 current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
    }

    public Mahasiswa05 getFirst() {
        if (isEmpty()) {
            System.out.println("List masih kosong.");
            return null;
        }
        return head.data;
    }

     public Mahasiswa05 getLast() {
        if (isEmpty()) {
            System.out.println("List masih kosong.");
            return null;
        }
        return tail.data;
    }

    public Mahasiswa05 getIndex(int index) {
        if (index < 0 || index >= size()) {
            System.out.println("Index tidak valid");
            return null;
        }

        Node05 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Warning: Linked list masih kosong.");
            return;
        }

        Node05 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }

        System.out.println("Data sudah berhasil dihapus, Data yang terhapus adalah ");
        head.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }

        System.out.println("Data sudah berhasil dihapus, Data yang terhapus adalah ");
        tail.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size()) {
            System.out.println("Index tidak valid.");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        if (index == size() - 1) {
            removeLast();
            return;
        }

        Node05 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.prev.next = current.next;
        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }

    public void removeAfter(String key) {
        Node05 current = head;
    
        while (current != null && !current.data.nim.equals(key)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Node setelah NIM " + key + " tidak ditemukan.");
            return;
        }

        current.next = current.next.next;
        if (current.next != null) {
            current.next.prev = current;
        }
    }

    public Node05 search(String nim) {
        Node05 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}
