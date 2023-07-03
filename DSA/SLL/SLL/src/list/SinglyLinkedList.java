package list;

public class SinglyLinkedList {
	private Node head;

	public SinglyLinkedList() {
		this.head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public boolean insertAtBeg(String v) {

		Node nn = new Node(v);// here new node will be created with data and null value
		if (nn == null)
			return false;

//		if(head==null) {
//			head=nn;
//			return true;
//		}
//			nn.setNext(head);
//			head=nn;
//			return true;

		// Optimized Code

		if (head != null)
			nn.setNext(head);
		head = nn;
		return true;

	}

	public boolean insertAtLast(String v) {
		Node nn = new Node(v);// here new node will be created with data and null value
		if (nn == null)
			return false;
		if (head == null) {
			head = nn;
			return true;
		}
		Node temp = head;
		while (temp.getNext() != null)
			temp = temp.getNext();
		temp.setNext(nn);
		return true;

	}

	public boolean insertAtPos(String v, int p) {
		// for empty list
		if (head == null)
			return false;
		// for negative position
		if (p <= 0) {
			System.out.println("please enter positive value as position");
			return false;
		}
		// if position is first
		if (p == 1)
			insertAtBeg(v);
		return true;
	}

	public void display() {
		Node temp = head;
		System.out.println("\nList Elements  -");
		while (temp != null) {
			System.out.print("\t" + temp.getData());
			temp = temp.getNext();
		}

	}

}
