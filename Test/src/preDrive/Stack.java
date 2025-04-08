package preDrive;


import java.util.EmptyStackException;
import java.util.Scanner;

public class Stack {
    private Node top;
    private int size;

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        size++;
    }

    public int pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        int value = top.value;
        top = top.next;
        size--;
        return value;
    }

    public int peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.value;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
    	System.out.println("Enter the element to push: ");
    	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Stack stack = new Stack();
        System.out.println(stack.isEmpty()); 
        stack.push(a);
        System.out.println(stack.peek()); 
        System.out.println(stack.size()); 

        int poppedValue = stack.pop();
        System.out.println("Popped value is "+poppedValue); 
        System.out.println(stack.size()); 
    }
}

