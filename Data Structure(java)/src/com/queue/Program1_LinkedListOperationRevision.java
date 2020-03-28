package com.queue;

public class Program1_LinkedListOperationRevision {

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
	public void deleteFirst() {
		
		if(head == null) {
			
			System.out.println("List is Empty");
		}else {
			
			if(head != tail) {
				head = head.next;
			}else {
				head = tail = null;
			}
		}
	}
	
	public void deleteLast() {
		Node current = head;
		if(head == null) {
			System.out.println("List is Empty");
		}else {
			
			if(head != tail) {
				
				while(current.next != tail) {
					current = current.next;
				}
				
				tail = current;
				tail.next = null;
			}else {
				head = tail = null;
			}
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
		
		Program1_LinkedListOperationRevision pr = new Program1_LinkedListOperationRevision();
		pr.addFirst(10);
		pr.addFirst(20);
		pr.addFirst(30);
		pr.addFirst(40);
		pr.addFirst(50);
		
		pr.display();
		
		System.out.println("Element delete");
		pr.deleteFirst();
		pr.display();
		System.out.println("Element Last delete");
		pr.deleteLast();
		pr.display();
		
		System.out.println("Element Add Last");
		pr.addLast(88);
		pr.addLast(30);
		pr.display();
		
	}
}
