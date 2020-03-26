package com.linkedlist;

public class Program1_LinkedListAddFirst {

	Node head = null; 
	Node tail = null;
	class Node{
		
		int data;
		Node next;
		
		Node(int data){
		
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
	
	
	
	
	public void display() {
		
		Node current = head;
		
		if (head == null) {
			System.out.println("List is Empty");
		}else {
			
			while(current != null) {
				
				System.out.println(current.data);
				current = current.next;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Program1_LinkedListAddFirst ll = new Program1_LinkedListAddFirst();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(5);

		ll.display();
	}
}
