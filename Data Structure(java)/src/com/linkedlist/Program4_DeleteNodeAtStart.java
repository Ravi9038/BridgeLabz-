package com.linkedlist;

public class Program4_DeleteNodeAtStart {
	
	Node head = null;
	Node tail = null;
	
	class Node{
	
		int data;
		Node next;
		
		Node(int data){
			
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
		
		Program4_DeleteNodeAtStart pr = new Program4_DeleteNodeAtStart();
		
		pr.addFirst(10);
		pr.addLast(30);
		pr.addFirst(40);
		pr.addLast(20);
		pr.deleteFirst();
		
		pr.display();
	}

}
