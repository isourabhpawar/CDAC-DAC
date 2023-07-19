import java.util.Stack;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
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
                //insert to left
                //check if temp is already having a left child
                if(temp.getLeft() == null) {
                    temp.setLeft(newNode);
                    return true;
                }
                temp = temp.getLeft();
            }
            else {
                //insert to right
                //check if temp has a right child?
                if(temp.getRight() == null) {
                    temp.setRight(newNode);
                    return true;
                }
                temp = temp.getRight();
            }
        }
    }

    public void preOrder() {
        Node temp = root;
        Stack<Node> stack = new Stack<>();

        System.out.print("PreOrder: ");
        while(temp != null || !stack.empty()) {
            while(temp != null) {
                System.out.print(temp.getData() + " ");
                stack.push(temp);
                temp = temp.getLeft();
            }

            temp = stack.pop().getRight();
        }

        System.out.println();
    }

    public void inOrder() {
        Node temp = root;
        Stack<Node> stack = new Stack<>();

        System.out.print("InOrder: ");
        while(temp != null || !stack.empty()) {
            while(temp != null) {
                stack.push(temp);
                temp = temp.getLeft();
            }
            temp = stack.pop();
            System.out.print(temp.getData() + " ");
            temp = temp.getRight();
        }
        System.out.println();
    }

    public int getMax() {
        if(root == null) {
            return -1;
        }

        Node temp = root;
        while(temp.getRight() != null) {
            temp = temp.getRight();
        }

        return temp.getData();
    }

    public boolean find(int data)  {
        Node temp = root;

        while(temp != null) {
            if(temp.getData() == data) {
                return true;
            }
            if(data < temp.getData()) {
                temp = temp.getLeft();
            }
            else {
                temp = temp.getRight();
            }
        }

        return false;
    }

    public void postOrder() {
        class Pair {
            Node node;
            char flag;

            public Pair(Node node, char flag) {
                this.node = node;
                this.flag = flag;
            }
        }

        Node temp =root;
        Stack<Pair> stack = new Stack<>();
        System.out.print("PostOrder: ");
        while(temp != null || !stack.empty()) {
            while(temp != null) {
                stack.push(new Pair(temp, 'L'));
                temp = temp.getLeft();
            }

            Pair pair = stack.pop();
            if(pair.flag == 'L') {
                temp = pair.node.getRight();
                pair.flag = 'R';
                stack.push(pair);
            }
            else {
                System.out.print(pair.node.getData() + " ");
            }
        }
        System.out.println();
    }

    public void preOrder(Node root) {
        if(root == null) {
            return;
        }

        System.out.print(root.getData() + " ");
        preOrder(root.getLeft());
        preOrder(root.getRight());

    }

    public void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.getLeft());
        System.out.print(root.getData() + " ");
        inOrder(root.getRight());

    }

    public void postOrder(Node root) {
        if(root != null) {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getData() + " ");
        }
    }

    public Node getRoot() {
        return root;
    }

    public boolean delete(int data) {
        if(root == null) {
            return false;
        }
        Node parent = root, del = root;

        //locate parent along with del node
        while(del.getData() != data) {
            if(data < del.getData()) {
                parent = del;
                del = del.getLeft();
            }
            else {
                parent = del;
                del = del.getRight();
            }

            //data is not existing
            if(del == null) {
                return false;
            }
        }

        while(true) {
            if (del.getLeft() == null && del.getRight() == null) {
                //if del is terminal and root node
                if (del == root) {
                    root = null;
                    return true;
                }

                if (parent.getLeft() == del) {
                    parent.setLeft(null);
                } else {
                    parent.setRight(null);
                }
                return true;
            }
            //del is a non-terminal node
            //find max from left of del or find min from right of del
            if (del.getLeft() != null) {
                //find max from left, also make sure that parent is following max
                parent = del;
                Node max = del.getLeft();
                while (max.getRight() != null) {
                    parent = max;
                    max = max.getRight();
                }

                //swap del and max
                int temp = del.getData();
                del.setData(max.getData());
                max.setData(temp);

                del = max;

            }
            else {
                //find min from right
                parent = del;
                Node min = del.getRight();
                while(min.getLeft() != null) {
                    parent = min;
                    min = min.getLeft();
                }

                //swap min and del
                int temp = del.getData();
                del.setData(min.getData());
                min.setData(temp);

                del = min;
            }
        }
    }
}
