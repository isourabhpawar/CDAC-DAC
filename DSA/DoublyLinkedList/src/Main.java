public class Main {
    public static void main(String[] args) {

        DLinkedList dll = new DLinkedList();
        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.insert(40);
        dll.display();

        dll.insert(50, 1);
        dll.display();
        dll.insert(60, 4);
        dll.display();
        dll.insert(70, 7);
        dll.display();
        dll.insert(80, 9);
        dll.display();

        dll.deleteByPosition(1);
        dll.display();
        dll.deleteByPosition(4);
        dll.display();
        dll.deleteByPosition(5);
        dll.display();
        dll.deleteByPosition(5);
        dll.display();

        /*dll.deleteByVal(50);
        dll.display();
        dll.deleteByVal(60);
        dll.display();
        dll.deleteByVal(70);
        dll.display();
        dll.deleteByVal(50);
        dll.display();*/

    }
}
