public class Main {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        l1.display();
        l1.reverse();
        l1.displayRev();
        l1.displayRev(l1.getHead());
        System.out.println();

        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);
        l1.insert(50);
        l1.display();

        l1.insert(60, 1);
        l1.display();
        l1.insert(70, 4);
        l1.display();
        l1.insert(80, 8);
        l1.display();
        System.out.println( l1.insert(100, 10) );
        l1.display();
        l1.insert(60);
        l1.insert(60, 4);
        l1.display();
        //l1.reverse();
        if(l1.getHead() != null && l1.getHead().getNext() != null) {
            l1.reverse(l1.getHead(), l1.getHead().getNext());
        }
        l1.display();

        /*l1.deleteByPosition(1);
        l1.display();
        l1.deleteByPosition(4);
        l1.display();
        l1.deleteByPosition(8);
        l1.display();
        l1.deleteByPosition(8);
        l1.display();*/

       /* while( l1.deleteByVal(60))
            ;
        l1.display();*/

        /*l1.deleteByVal(60);
        l1.display();
        l1.deleteByVal(70);
        l1.display();
        l1.deleteByVal(80);
        l1.display();
        l1.deleteByVal(60);
        l1.display();*/
    }
}
