import java.util.Stack;

public class LinkedList {
    private Node head;
    /*private int size = 0;
    private Node last;*/

    public LinkedList() {
        head = null;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);
        if(newNode == null) {
            return false;
        }

        if(head == null) {
            this.head = newNode;
            return true;
        }

        Node last = head;
        while(last.getNext() != null) {
            last = last.getNext();
        }

        last.setNext(newNode);
        return true;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public void display(Node head) {
        if(head == null) {
            return;
        }

        System.out.print(head.getData() + " ");
        display(head.getNext());
    }

    public Node getHead() {
        return head;
    }

    public void displayRev() {
        Node temp = head;
        Stack<Node> s = new Stack<>();

        while(temp != null) {
            s.push(temp);
            temp = temp.getNext();
        }

        while(!s.isEmpty()) {
            System.out.print(s.pop().getData() + " ");
        }
        System.out.println();
    }

    public void displayRev(Node head) {
        if(head == null) {
            return;
        }
        displayRev(head.getNext());
        System.out.print(head.getData()  +" ");
    }

    public boolean insert(int data, int position) {
        if(position <= 0 || (head == null && position > 1)) {
            return false;
        }

        Node newNode = new Node(data);
        if(newNode == null) {
            return false;
        }

        if( position == 1) {
            newNode.setNext(head);
            head = newNode;
            return true;
        }

        //locate prev node
        Node prev = head;
        for(int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if(prev == null) {
                return false;
            }
        }

        newNode.setNext(prev.getNext());
        prev.setNext(newNode);

        return true;

    }

    public boolean deleteByVal(int data) {
        if(head == null) {
            return false;
        }

        if(head.getData() == data) {
            head = head.getNext();
            return true;
        }

        Node prev = head, del = head;
        while(del.getData() != data) {
            prev = del;
            del = del.getNext();
            if(del == null) {
                return false;
            }
        }

        prev.setNext(del.getNext());
        return true;
    }

    public boolean deleteByPosition(int position) {
        if(head == null || position <= 0) {
            return false;
        }

        if(position == 1) {
            head = head.getNext();
            return true;
        }

        Node prev = head;
        for(int i = 1; i < position -1; i++) {
            prev = prev.getNext();
            if(prev.getNext() == null) {
                return false;
            }
        }

        Node del = prev.getNext();
        /*if(del == null) {
            return false;
        }*/
        prev.setNext(del.getNext());

        return true;
    }

    public void reverse() {
        if(head == null || head.getNext() == null) {
            return;
        }

        Node n1 = head, n2 = head.getNext();
        Node n3 = null;

        while(n2 != null) {
            n3 = n2.getNext();
            n2.setNext(n1);
            n1 = n2;
            n2 = n3;
        }

        head.setNext(null);
        head = n1;
    }

    public void reverse(Node n1, Node n2) {
        if(n2 == null) {
            head.setNext(null);
            head = n1;
            return;
        }
        reverse(n2, n2.getNext());
        n2.setNext(n1);
    }
}












