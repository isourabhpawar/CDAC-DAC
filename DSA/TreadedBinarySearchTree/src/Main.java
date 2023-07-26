public class Main {
    public static void main(String[] args) {
        ThreadedBinarySearchTree t = new ThreadedBinarySearchTree();

        t.insert(50);
        t.insert(20);
        t.insert(30);
        t.insert(40);
        t.insert(25);
        t.insert(10);
        t.insert(80);
        t.insert(60);
        t.insert(55);
        t.insert(70);

        t.preOrder();
        t.inOrder();
        t.postOrder();

        t.delete(50);
        System.out.println();

        t.preOrder();
        t.inOrder();
        t.postOrder();


    }
}
