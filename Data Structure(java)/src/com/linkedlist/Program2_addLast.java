package com.linkedlist;

public class Program2_addLast {

	Node head = null;
	Node tail = null;
	
	class Node{
		
		int data;
		Node next;
		
		public Node(int data) {
		
			// TODO Auto-generated constructor stub			
			this.data = data;
		}
		
	}
	
	public void addFirst(int data) {

		Node newNode = new Node(data);
		
		if(head == null) {
			
			head = newNode;
			tail = newNode;
		}else {
			
			Node temp = head;
			head = newNode;
			head.next = temp;
					
		}		
		
	}
	
	public void AddLast(int data) {
		
		Node newNode = new Node(data);
	
		if(head == null) {
			
			head = newNode;
			tail = newNode;
		}else {
			
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void display() {
		
		Node current = head;
		
		if(head == null) {
			
			System.out.println("List is Empty");
		}else {
			
			while(current != null) {
				
				System.out.println(current.data);
				current = current.next;
			}
			
		}
		
	}
	public static void main(String[] args) {
		
		Program2_addLast ll = new Program2_addLast();
		
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(40);
		ll.addFirst(80);
		
		ll.AddLast(5);
		ll.AddLast(64);
		
		ll.display();
		
	}
}
