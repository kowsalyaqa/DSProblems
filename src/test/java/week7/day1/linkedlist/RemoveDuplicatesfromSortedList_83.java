package week7.day1.linkedlist;

public class RemoveDuplicatesfromSortedList_83 {
	/*
		Given the head of a sorted linked list, delete all duplicates such that each element appears only once. 
		Return the linked list sorted as well.
		
		Example 1:
		Input: head = [1,1,2]
		Output: [1,2]
		
		Example 2:
		Input: head = [1,1,2,3,3]
		Output: [1,2,3]
		
		Constraints:
		The number of nodes in the list is in the range [0, 300].
		-100 <= Node.val <= 100
		The list is guaranteed to be sorted in ascending order.
	 * 
	 * Understand Question - 5 mins
	 * Test Data- 2 mins
	 * Logic build - 10 mins
	 * Pseudo Code: 15 mins
	 * ------------
	 * 1.Assign head as temp Node
	 * 2.Iterate using while loop and check if tempNode and tempNode.next is null
	 * 3.If temp value is equal to temp.next value, make temp.next.next as temp.next 
	 * 4.else temp.next as temp
	 * 5.return head
	 * 
	 * Code- 15 mins
	 * Run & Debug- 5 mins
	 * 
	 * Time Complexity - 
	 * Space Complexity - 
	 * 
	 * 
	 */
	
	public void tdp1() {
		Singly_Linked_List head=new Singly_Linked_List();
		head.add(1);
		head.add(1);
		head.add(2);
		Singly_Linked_List exedeleteDuplicates(head);
	}
	
	public ListNode deleteDuplicates(ListNode head) {
			ListNode tempNode=head;
			while(tempNode!=null && tempNode.next!=null) {
				if(tempNode.next.val==tempNode.val) 
					tempNode.next=tempNode.next.next;
				else tempNode=tempNode.next;
			}
			return head;
	}
}
