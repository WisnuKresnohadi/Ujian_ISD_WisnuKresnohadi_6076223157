//PROGRAM INI TIDAK SEMPURNA NAMUN BUKAN BERARTI CACAT HANYA TERDAPAT KETERBATASAN DALAM MENGINPUT DAN MENDELETE DATA YANG HANYA BISA DILAKUKAN DI DEPAN DAN DI BELAKANG
//JADI TIDAK MELAKUKAN INPUT ATAU DELETE DI TENGAH
//PRINT YANG DI JALANKAN JUGA TIDAK MENGGUNAKAN HAL SPESIFIK JADI PROGRAM INI AKAN PRINT SEMUA DATA JADI TIDAK BISA PRINT SPESIFIK DATA

public class Linklist<Pegawai> {

    private Node<Pegawai> head;
    private Node<Pegawai> tail;

    public Linklist() {
        head = tail = null;
    }

    public void insertFront(Pegawai dataInput) {

        if (isEmpty()) {
            isEmpty(dataInput);
        } else {
            Node dataNode = new Node<Pegawai>(dataInput);

            dataNode.next = head;
            head = dataNode;
        }
    }

    public void insertBack(Pegawai dataInput) {
        if (isEmpty()) {
            isEmpty(dataInput);
        } else {
            Node dataNode = new Node<Pegawai>(dataInput);
            tail.next = dataNode;
            tail = dataNode;
        }
    }

    public void deleteFront() {
        if (isEmpty()) {
            System.out.println(cons());
        } else {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
        }
    }

    public void deleteBack() {
        if (isEmpty()) {
            System.out.println(cons());
        }
        if (tail == head) {
            head = tail = null;
        } else {
            Node iterator = head;
            while (iterator.next != tail) {
                iterator = iterator.next;
            }
            tail = iterator;
            iterator.next = null;
        }
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println(cons());
        } else {
            Node iterator = head;
            while (iterator != null) {
                System.out.println(iterator.data + "\n");
                iterator = iterator.next;
            }
        }
    }

    private boolean isEmpty() {
        return head == null;
    }

    private void isEmpty(Pegawai dataInput) {
        head = tail = new Node<Pegawai>(dataInput);
    }

    private String cons() {
        return "TIDAK ADA DATA";
    }
}
