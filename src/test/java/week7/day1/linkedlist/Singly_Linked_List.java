package week7.day1.linkedlist;

public class Singly_Linked_List {
	Node head;
	Node tail;
	int length = 0;

	public void add(int value) {
		Node tempNode = new Node(value);
		if (head == null) {
			head = tempNode;
			tail = head;
		} else {
			tail.next = tempNode;
			tail = tempNode;
		}
		length++;
	}

	public void print() {
		Node tempNode = head;
		while (tempNode != null) {
			System.out.println(tempNode.value);
			tempNode = tempNode.next;
		}
	}

	public int size() {
		return length;
	}

	public Node get(int index) {
		Node tempNode = head;
		int count = 1;
		while (tempNode != null) {
			if (count == index)
				return tempNode;
			else {
				tempNode = tempNode.next;
			}
			count++;
		}
		return null;
	}

	public void set(int index, int value) {
		Node tempNode = head;
		int count = 1;
		while (tempNode != null) {
			if (count == index)
				tempNode.value = value;
			else
				tempNode = tempNode.next;
			count++;
		}
	}

	public void remove(int index) {
		Node previousNode = head;
		if (index > length || previousNode == null)
			return;
		if (previousNode.next == null) {
			previousNode = previousNode.next;
			length--;
			return;
		}
		int count = 1;
		while (previousNode != null) {
			if (count == index - 1) {
				if (previousNode.next.next == null) {
					previousNode.next = null;
				} else {
					previousNode.next = previousNode.next.next;
				}
				length--;
				return;
			}
			previousNode = previousNode.next;
			count++;
		}

	}

	public void removeValueUsingNextNode(int value) {
		Node temp = head;
		if (temp == null) // List is an Empty
			return;

		if (temp.next == null && temp.value == value) {
			temp = null;
			return;
		}
		if (temp.next != null && temp.value == value) {
			head = temp.next;
			return;
		}

		while (temp != null) {
			if (temp.next.value == value) {
				if (temp.next == null) {
					temp.next = null;
				} else {
					temp.next = temp.next.next;
				}
				length--;
				return;
			}
			temp = temp.next;
		}
	}

	public void removeValue(int value) {
		Node currentNode = head;
		Node tempNode = null;

		if (currentNode != null && currentNode.value == value) {
			head = currentNode.next;
			return;
		}

		while (currentNode != null && currentNode.value != value) {
			tempNode = currentNode;
			currentNode = currentNode.next;
			if (currentNode == null) {
				tempNode.next = null;
			} else {
				tempNode.next = currentNode.next;
				length--;
			}
		}

	}

	public int indexOf(int value) {
		Node tempNode = head;
		int retunValue = -1;
		if (head == null) {
			return retunValue;
		}
		int count = 0;
		if (head.next != null && head.value == value) {
			retunValue = count;
			return retunValue;
		}
		while (tempNode != null) {
			if (tempNode.value == value) {
				return retunValue = count;
			}
			count++;
			tempNode = tempNode.next;
		}

		return retunValue;
	}

	public int lastIndexOf(int value) {
		Node tempNode = head;
		int retunValue = -1;
		int count = 0;

		if (tempNode == null) {
			return retunValue;
		}
		if (head.next == null && head.value == value) {
			return retunValue = count;
		}
		while (tempNode.next != null) {
			if (tempNode.value == value) {
				retunValue = count;
			}
			count++;
			tempNode = tempNode.next;
		}
		return retunValue;
	}

	public void removeFirstIndex() {
		Node tempNode = head;
		if (head == null)
			return;
		if (head != null && head.next == null) {
			head = head.next;
			return;
		}
		while (tempNode != null) {
			if (tempNode != null && tempNode.next != null) {
				head = tempNode.next;
				length--;
				return;
			}
			tempNode = tempNode.next;
		}
	}

	public void removeLastIndex() {
		Node tempNode = head;
		if (head == null)
			return;
		while (tempNode != null) {
			if (tempNode.next.next == null) {
				tempNode.next = null;
				tail = tempNode.next;
				length--;
				return;
			}
			tempNode = tempNode.next;
		}
	}

	public void addFirst(int value) {
		Node tempoNode=null;;
		if (head == null) {
			head.value = value;
			head.next = null;
		}
		while(head != null) {
			if(head.next!=null) {
			tempoNode = head.next;
			head.value = value;
			head.next = tempoNode;
			}
		}
	}
	
	public Node deleteDuplicates(Node head) {      
	       Node tempNode=head;
			while(tempNode!=null && tempNode.next!=null) {
				if(tempNode.next.value==tempNode.value) 
					tempNode.next=tempNode.next.next;
				else tempNode=tempNode.next;
			}
			return head;
	    }
}
