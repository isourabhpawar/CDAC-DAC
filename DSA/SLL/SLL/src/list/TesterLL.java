//Implement Linked List for int values

package list;

public class TesterLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList l1=new SinglyLinkedList();
		l1.insertAtLast("Ajay"); //call to insert function will create 1st node in memory
		l1.insertAtLast("Rahul");
		l1.insertAtLast("Aakash");
		l1.insertAtLast("Riya");
		l1.insertAtLast("Ramesh");
		l1.insertAtBeg("Priya");
		l1.insertAtPos("Ranjeet", 1);
		l1.insertAtPos("Ram", -1);  //first msg will be displayed 
		l1.display(); // Then List will display
		
		
	}

}
