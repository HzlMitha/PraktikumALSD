package Praktikum10;

public class SLLMain05 {
    public static void main(String[] args) {
        SingleLinkedList05 sll = new SingleLinkedList05();
        Mahasiswa05 mhs1 = new Mahasiswa05("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa05 mhs2 = new Mahasiswa05("23213301", "Bimon", "2B", 3.8);
        Mahasiswa05 mhs3 = new Mahasiswa05("22212202", "Cintia", "3C", 3.5);
        Mahasiswa05 mhs4 = new Mahasiswa05("21212203", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
        System.out.println();

        System.out.println("Data index 1 : ");
        sll.getData(1);

        System.out.println("Data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
