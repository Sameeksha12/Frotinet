package q1;

public class SinglyLinkedListReverse {
	public static Node head;

	public Node reverse(Node head) {
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

	public void printList(Node head) {
		while (head != null) {
			System.out.print(head.value + " ");
			head = head.next;
		}
	}

	// Time Complexity: O(n)
	// Space Complexity: O(1)

	public static void main(String[] args) {
		SinglyLinkedListReverse list = new SinglyLinkedListReverse();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
	}
}
