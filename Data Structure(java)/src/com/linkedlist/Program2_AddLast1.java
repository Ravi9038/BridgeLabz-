package com.linkedlist;

public class Program2_AddLast1 {

	Node head = null;
	Node tail = null;
	
	class Node{
		
		int data;
		Node next;
		
		Node(int data) {
					
			this.data = data;
		}
	}
	
	public void addLast(int data) {
		
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
			System.out.println("List is empty");
			
		}else {
			
			while (current != null) {
				
				System.out.println(current.data);
				current = current.next;
			}
		}
	}
	public static void main(String[] args) {

		Program2_AddLast1 ll = new Program2_AddLast1();
		
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(10);
		ll.addLast(5);
		ll.addLast(4);
		
		ll.display();
	}
}
