package CircularSLL;

class Node {
	public int value;
	public Node next;
}

public class CSLL {
	public Node head;
	public Node tail;
	public int size;

	public Node creationCSLL(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.value = nodeValue;
		node.next = node;
		head = node;
		tail = node;
		size=1;
		return head;
	}

	public void insertionCSLL(int location, int nodeValue) {
		Node node = new Node();
		node.value = nodeValue;
		if (head == null) {
			creationCSLL(nodeValue);
		}else if(location==0){
			node.next = head;
			head = node;
			tail.next=head;
		} else if(location>=size) {
			node.next=head;
			tail.next=node;
			tail=node;
		}
		else {
			Node temp=head;
			int index=0;
			while(index<location-1)
			{
				temp=temp.next;
				index++;
			}
			node.next=temp.next;
			temp.next=node;
		}
		size++;
	}

	public Node reverseList() {
		Node temp, mid, current;
		temp = mid = null;
		current = head;
		while (current != null) {
			temp = mid;
			mid = current;
			current = current.next;
			mid.next = temp;
		}
		return mid;
	}

	public void printAsending() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
	}

	public void printReverse() {
		Node temp = reverseList();
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		CSLL csll = new CSLL();
		csll.creationCSLL(10);
		csll.insertionCSLL(0,20);
		csll.insertionCSLL(1,30);
		csll.insertionCSLL(2,40);
		csll.insertionCSLL(3,50);
		csll.printAsending();
		System.out.println("\n******************");
		csll.printReverse();
	}
}
