package com.linkedlist;

public class Program1_AddFirstElement {

	Node head = null;
	Node tail = null;
	
	class Node{
	
		int data;
		Node next;
	
		Node(int data) {
		
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
	
	public void addLast(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			
			tail.next = newNode;
			tail = newNode;
			//tail.next = head;
		}
	}
	void display() {
		
		Node current =  head;
		
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	public static void main(String[] args) {
		
		Program1_AddFirstElement l = new Program1_AddFirstElement();
		l.addFirst(80);
		l.addFirst(600);
		l.addLast(40);
		
		l.display();
	}
}
