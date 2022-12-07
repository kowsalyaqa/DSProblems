package doublylinkedlist;

public class Doubly_LinkedList {
	Node1 head;
	Node1 tail;
	int length = 0;
	
	public void add(int value) {
		Node1 tempNode = new Node1(value);
		if (head == null) {
			head = tempNode;
			tail = head;
		} else {
			tail.next = tempNode;
			tail = tempNode;
		}
		length++;
	}
}
