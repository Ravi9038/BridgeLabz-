package com.rotate;

public class Program1_RotateListAtPosition {

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
	
	public void rotateList(int k) {
		
		if(k == 0)
			return;
		
		Node current = head;
		
		int count = 1;
		
		while(count < k && current != null) {
			
			current = current.next;
			count++;
		}
		
		if(current == null) {
			return;
		}

		Node temp = current;
		
		while(current.next != null) {
			current = current.next;
		}
		
		current.next = head;
		
		head = temp.next;
		
		temp.next = null;
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
		
		Program1_RotateListAtPosition pr = new Program1_RotateListAtPosition();
		
		pr.addLast(10);
		pr.addLast(20);
		pr.addLast(30);
		pr.addLast(40);
		pr.addLast(50);
		
		System.out.println("Original List");
		pr.display();
		
		System.out.println("Rotate List");
		pr.rotateList(4);
		pr.display();
		
		
		
		
	}
}
