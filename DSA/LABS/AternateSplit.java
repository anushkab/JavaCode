package LABS;

public class AternateSplit {

	public static node head = null;
	public static node headA = null; //linked List 1
	public static node headB = null; // Linked List 2

	public void Altersplit() {
		node currnode = head;
		if (currnode == null || currnode.next == null) {
			return; // we have nothing to split, return
		}
		headA = currnode; //set the head for first Linked List
		headB = currnode.next; //set the head for second Linked List
		while (currnode != null && currnode.next != null) {

			node t = currnode.next;
			currnode.next = t.next; // set the next node for first linked list
                         // Now check if next node is available for second Linked List
			if (currnode.next != null && currnode.next.next != null) {
				t.next = currnode.next.next; // set the next node for second linked list
			} else { // we have reached to the end
				t.next = null;
				return;
			}
			currnode = currnode.next; // keep moving forward
		}

	}

	public void print(node x) {
		System.out.println("");
		node curr = x;
		while (curr != null) {
			System.out.print("->" + curr.data);
			curr = curr.next;
		}
	}

	public static void main(String[] args) throws java.lang.Exception {
		head = new node(1);
		head.next = new node(2);
		head.next.next = new node(1);
		head.next.next.next = new node(2);
		head.next.next.next.next = new node(1);
		head.next.next.next.next.next = new node(2);

		AternateSplit i = new AternateSplit();
		i.print(head);
		i.Altersplit();
		i.print(headA);
		i.print(headB);

	}
}

class node {
	int data;
	node next;

	public node(int data) {
		this.data = data;
		next = null;
	}
}
