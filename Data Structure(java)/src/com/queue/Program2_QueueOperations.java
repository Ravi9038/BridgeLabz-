package com.queue;

public class Program2_QueueOperations {

	Node first = null;
	Node Last = null;
	
	class Node{
		
		int data;
		Node next;
		
		Node(int data){
			
			this.data = data;
			this.next = null;
		}
	}
	
	public void addElement(int data) {
		Node newNode = new Node(data);
		
		if(first == null) {
			
			first = newNode;
			Last = newNode;			
		}else {
			
			Last.next = newNode;
			Last = newNode;
		}
	}
	
	public void deleteElement() {
		
		if(first == null) {
			System.out.println("Queue is Empty");
		}else {
			
			if(first != Last) {
				
				first = first.next;
			}else {
				first = Last = null;
			}
		}
	}
	
	public void display() {
		
		Node current = first;
		
		if(first == null) {
			System.out.println("Queue is Empty");
		}else {
			
			while (current != null) {
				
				System.out.println(current.data);
				current = current.next;
			}
		}
	}
	public static void main(String[] args) {
		
		Program2_QueueOperations pq = new Program2_QueueOperations();
		
		pq.addElement(10);
		pq.addElement(20);
		pq.addElement(30);
		pq.addElement(40);
		pq.addElement(50);
		
		pq.display();
		
		System.out.println("Delete Element from the Queue");
		pq.deleteElement();
		pq.display();
	}
}
