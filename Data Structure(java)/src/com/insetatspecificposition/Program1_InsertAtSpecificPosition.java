package com.insetatspecificposition;

public class Program1_InsertAtSpecificPosition {

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
	
	public void addElement(int data) {
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
	
	public void atAtSpecificPosition(int posi,int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		
		}else {
			
			Node temp, current;
			
			temp = head;
			current = null;
			
			for(int i=1;i<posi;i++) {
				current = temp;
				temp = temp.next;
			}
			
			current.next = newNode;
			newNode.next = temp;
		}
		
	}
	public void display() {
		
		if(head == null) {
			System.out.println("List is Empty");
		}else {
			
			Node current = head;
			
			while(current != null) {
				System.out.println(current.data);
				current = current.next;
			}
		}
	}
	public static void main(String[] args) {
		
		Program1_InsertAtSpecificPosition pi = new Program1_InsertAtSpecificPosition();
		
		pi.addElement(10);
		pi.addElement(20);
		pi.addElement(30);
		
		pi.display();
		
		pi.atAtSpecificPosition(4,40);
		
		System.out.println("Display");
		pi.display();
		
	}
}
