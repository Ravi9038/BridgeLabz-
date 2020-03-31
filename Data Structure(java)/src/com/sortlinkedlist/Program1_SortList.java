package com.sortlinkedlist;

public class Program1_SortList {

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
	
	public void display() {
		
		if(head == null) {
			System.out.println("Linked List is Empty");
		}else {
			
			Node current = head;
			
			while(current != null){
				
				System.out.println(current.data);
				current = current.next;
			}
		}
	}
	
	
	public void sorting() {
	
		Node current = head, index = null;
		
		if(head == null) {
			System.out.println("List is Empty");
			
		}else {
			
			
			while(current.next != null) {
				
				index = current.next;
				
				while(index.next != null) {
					
					if(current.data > index.data){
						
						int temp = current.data;
						current.data = index.data;
						index.data = temp;
						
					}
					index = index.next;
				}
				
				current = current.next;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Program1_SortList ps = new Program1_SortList();
		
		ps.addFirst(9);
		ps.addFirst(7);
		ps.addFirst(2);
		ps.addFirst(5);
		ps.addFirst(4);
		
		ps.addLast(65);
		ps.addLast(30);
		ps.addLast(80);
	
		ps.display();
		
		System.out.println("Sorting elements");
		ps.sorting();
		ps.display();
	}
}

/**
 * 

4
5
2
7
9
65
30
80
Sorting elements
2
4
5
7
9
30
65
80

*/
