package junit;

import static org.junit.Assert.*;
import org.junit.Test;

import q1.SinglyLinkedListReverse;
import q1.Node;

public class testForQuestion1 {

	@Test
	public void testReverse() {
		String inputString = "85,15,4,20"; // after Reverse is 20,4,15,85
		String result = "20,4,15,85";
		String pupString = "";
		SinglyLinkedListReverse list = new SinglyLinkedListReverse();

		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		list.printList(list.head);
		Node head = list.reverse(list.head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		// list.printList(head);
		StringBuffer sBuffer = new StringBuffer();
		while (head != null) {
			System.out.print(head.value + " ");
			sBuffer.append(head.value + ",");
			head = head.next;
		}
		pupString = sBuffer.toString();
		pupString = pupString.substring(0, pupString.length() - 1);
		assertTrue(result.equals(pupString));

	}

}
