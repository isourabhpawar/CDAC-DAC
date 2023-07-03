//List of int

package list;
public class Node {
	//data members
	private String data;
	private Node next;
	//constructor
	public Node(String data) {
		super();
		this.data = data;
		this.next = null;
	}
	
	//getter setters
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
