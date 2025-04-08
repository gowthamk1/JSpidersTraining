package SinglyLinkedList;

class Node {
	public int value;
	public Node next;
}

class SingleLinkedList {
	public Node head;
	public Node tail;
	public int size;

	public Node creationSLL(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.value = nodeValue;
		node.next = null;
		head = node;
		tail = node;
		size=1;
		return head;
	}

	public void insertionSLL(int location, int nodeValue) {
		Node node = new Node();
		node.value = nodeValue;
		if (head == null) {
			creationSLL(nodeValue);
		} else if(location==0){
			node.next = head;
			head = node;
		} else if(location>=size) {
			node.next=null;
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
}

public class MainClass {
	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();
		sll.creationSLL(10);
		sll.insertionSLL(0,20);
		sll.insertionSLL(1,30);
		sll.insertionSLL(2,40);
		sll.insertionSLL(3,50);
		sll.printAsending();
		System.out.println("\n******************");
		sll.printReverse();
	}
}
