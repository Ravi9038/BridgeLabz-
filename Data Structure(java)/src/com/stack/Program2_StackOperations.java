package com.stack;

public class Program2_StackOperations {

	Node head = null;
	Node tail = null;
	
	class Node{
		
		int data;
		Node next;
	
		public Node(int data) {
			// TODO Auto-generated constructor stub
	
			this.data = data;
			this.next = null;
		
		}
	}
	
	public void push(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			
			head = newNode;
		}else {
			
			Node temp = head;
			head = newNode;
			head.next = temp;
		}
	}
	
	public void display() {
		
		Node current = head;
		
		if(head == null) {
			
			System.out.println("Stack is Empty");
		}else {
			
			while(current != null) {
				System.out.println(current.data);
				current = current.next;
			}
		}
	}
	public void pop() {
		
		if(head == null) {
			System.out.println("Stack is underflow");
		}else {
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		
		Program2_StackOperations s = new Program2_StackOperations();
		s.push(10);
		s.push(20);
		s.push(30);

		s.display();
		System.out.println("Pop element");
		s.pop();
		s.pop();
	
		s.display();
	}
}
