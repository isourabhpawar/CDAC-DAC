public class ThreadedBinarySearchTree {
    private Node root;

    public ThreadedBinarySearchTree() {
        root = null;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);
        // if(newNode == null) {
        //     return false;
        // }

        if(root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;
        while(true) {
            if(data == temp.getData()) {
                return false;
            }

            if(data < temp.getData()) {
                if(temp.getlFlag() == 'T') {
                    newNode.setRight(temp); //step 1
                    newNode.setLeft(temp.getLeft()); //step 2
                    temp.setLeft(newNode); //step 3
                    temp.setlFlag('L'); //step 3
                    return true;
                }
                temp = temp.getLeft();
            }
            else {
                if(temp.getrFlag() == 'T') {
                    newNode.setLeft(temp); // 1
                    newNode.setRight(temp.getRight()); // 2
                    temp.setRight(newNode); // 3
                    temp.setrFlag('L'); // 3
                    return true;
                }
                temp = temp.getRight();
            }
        }
    }

    public void preOrder() {
        Node temp = root;
        char flag = 'L';

        System.out.print("PreOrder: ");
        while(temp != null) {
            while(temp.getlFlag() == 'L' && flag == 'L') {
                System.out.print(temp.getData() + " ");
                temp = temp.getLeft();
            }

            if(flag == 'L') {
                System.out.print(temp.getData() + " ");
            }
            flag = temp.getrFlag();
            temp = temp.getRight();
        }
        System.out.println();

    }

    public void inOrder() {
        Node temp = root;
        char flag = 'L';

        System.out.print("InOrder: ");
        while(temp != null) {
            while(temp.getlFlag() == 'L' && flag == 'L') {
                temp = temp.getLeft();
            }
            System.out.print(temp.getData() + " ");
            flag = temp.getrFlag();
            temp = temp.getRight();
        }
        System.out.println();
    }

    public void postOrder() {
        Node temp =root;
        char flag = 'L';

        System.out.print("PostOrder: ");
        while(temp != null) {
            //check if temp has left child which is unvisited if yes then shift to left of temp
            while(temp.getlFlag() == 'L' && flag == 'L') {
                temp = temp.getLeft();
            }
            //check if temp has a right child
            flag = temp.getrFlag();

            //if flag is L means temp has a right child so shift to right and continue the iteration
            if(flag == 'L') {
                temp = temp.getRight();
            }
            else {
                while(true) {
                    //temp's left is done* and temp has no right child so visit temp
                    System.out.print(temp.getData() + " ");
                    if (isRightChild(temp)) {
                        //temp is right child, so locate it's parent and visit parent
                        while (temp.getlFlag() == 'L') {
                            temp = temp.getLeft();
                        }
                        temp = temp.getLeft();
                    } else {
                        //locate parent of left child and go to beginning
                        while(temp.getrFlag() == 'L') {
                            temp = temp.getRight();
                        }
                        temp = temp.getRight();
                        break;
                    }
                }
            }

        }
        System.out.println();
    }

    private boolean isRightChild(Node node) {
        if(node == root) {
            return false;
        }

        Node temp = root;
        while(true) {
            if(node.getData() < temp.getData()) {
                temp = temp.getLeft();
                if(node == temp) {
                    return false;
                }
            }
            else {
                temp = temp.getRight();
                if(temp == node) {
                    return true;
                }
            }
        }
    }

    public boolean delete(int data) {
        if(root == null) {
            return false;
        }

        //locate del and it's parent
        Node parent = root, del = root;
        while(del.getData() != data) {
            if(data < del.getData()) {

                if(del.getlFlag() == 'T') {
                    return false;
                }

                //to left
                parent = del;
                del = del.getLeft();
            }
            else {

                if(del.getrFlag() == 'T') {
                    return false;
                }

                //to right
                parent = del;
                del = del.getRight();
            }
        }

        while(true) {
            //check if del is terminal
            if (del.getlFlag() == 'T' && del.getrFlag() == 'T'){

                //if del is root
                if(del == root) {
                    root = null;
                    return true;
                }

                //delete del and return true
                if(del == parent.getLeft()) {
                    //del is left child
                    //del's inorder predecessor will become inorder predecessor of parent
                    parent.setLeft(del.getLeft());
                    parent.setlFlag('T');
                    return true;
                }
                else {
                    //del is right child
                    //parent's inorder successor will become inorder successor of parent
                    parent.setRight(del.getRight());
                    parent.setrFlag('T');
                    return true;
                }
            }

            //shift del down the tree
            if (del.getlFlag() == 'L'){
                //find max from left, swap del with max
                parent = del;
                Node max = del.getLeft();
                while(max.getrFlag() == 'L') {
                    parent = max;
                    max = max.getRight();
                }

                //swap max and del
                int tempData = del.getData();
                del.setData(max.getData());
                max.setData(tempData);

                del = max;
            }
            else{
                //find min from right and swap del with min
                parent = del;
                Node min = del.getRight();

                while (min.getlFlag() == 'L') {
                    parent = min;
                    min = min.getLeft();
                }

                //swap min and del
                int tempData = del.getData();
                del.setData(min.getData());
                min.setData(tempData);

                del = min;
            }
        }
    }
}









