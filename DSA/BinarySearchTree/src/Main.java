public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.preOrder();
        bst.inOrder();
        bst.postOrder();

        bst.insert(50);
        bst.insert(20);
        bst.insert(10);
        bst.insert(30);
        bst.insert(40);
        bst.insert(25);
        bst.insert(90);
        bst.insert(60);
        bst.insert(100);
        bst.insert(55);
        bst.insert(80);
        System.out.println(bst.insert(100));

        bst.preOrder();

        System.out.print("PreOrder: ");
        bst.preOrder(bst.getRoot());
        System.out.println();

        bst.inOrder();
        System.out.print("InOrder: ");
        bst.inOrder(bst.getRoot());
        System.out.println();

        bst.postOrder();
        System.out.print("PostOrder: ");
        bst.postOrder(bst.getRoot());
        System.out.println();

        bst.delete(80);
        bst.preOrder();
        bst.inOrder();
        bst.postOrder();
        bst.delete(50);
        bst.preOrder();
        bst.inOrder();
        bst.postOrder();



    }
}
