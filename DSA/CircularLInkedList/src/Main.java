public class Main {
    public static void main(String[] args) {
        CircularLInkedList cll = new CircularLInkedList();

        cll.display();
        cll.insert(10);
        cll.display();
        cll.insert(20);
        cll.display();
        cll.insert(30);
        cll.display();
        cll.insert(40);
        cll.display();

        cll.insert(50, 1);
        cll.display();
        cll.insert(60, 4);
        cll.display();
        cll.insert(70, 7);
        cll.display();
        cll.insert(80, 10);
        cll.display();


        cll.deleteByPosition(1);
        cll.display();
        cll.deleteByPosition(3);
        cll.display();
        cll.deleteByPosition(5);
        cll.display();
        cll.deleteByPosition(5);
        cll.display();

        /*cll.deleteByVal(50);
        cll.display();
        cll.deleteByVal(60);
        cll.display();
        cll.deleteByVal(70);
        cll.display();
        cll.deleteByVal(50);
        cll.display();*/
    }
}
