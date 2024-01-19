public class Main {
    public static void main(String[] args) {

        DoublyLinkedList<Integer> amr=new DoublyLinkedList<>();

        amr.addFirst(2);
        amr.add(30);
        System.out.println(amr.get(1));
        amr.remove(0);

    }
}