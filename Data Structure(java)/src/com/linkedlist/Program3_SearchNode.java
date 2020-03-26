package com.linkedlist;

public class Program3_SearchNode {

	Node head = null;
	Node tail = null;
	
	class Node{
		
		int data;
		Node next;
		
		Node(int data) {
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
	
	public void searchElement(int data) {
		
		Node current = head;		
		int i = 1;		
		boolean flag = false;
		
		if(head == null) {
			
			System.out.println("List is Empty");
		
		}else {
			
			while(current != null) {
				
				if(current.data == data) {
					
					flag = true;
					break;
				}
				i++;
				current = current.next;
			}
		}
		
		if(flag) {
			System.out.println("Node is present in the " + i +" Position and Data is = "+ data);
		}else {
			System.out.println("Node is not present in the list Data is = "+ data);
		}
	}
	
	void display() {
	
		Node current = head;
		
		while(current != null) {
		
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
	
		Program3_SearchNode ll = new Program3_SearchNode();
		
		ll.addFirst(10);
		ll.display();
		
		ll.addFirst(30);
		ll.display();
		
		ll.addLast(40);
		ll.display();
		
		ll.addLast(60);
		ll.display();
		
		ll.searchElement(5);
		ll.display();
	}
}
/**
 
Node is present in the 2 Position and Data is = 10
30
10
40

*/