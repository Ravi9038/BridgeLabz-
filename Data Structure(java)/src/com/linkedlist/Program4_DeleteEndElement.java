package com.linkedlist;

public class Program4_DeleteEndElement {

	Node head = null;
	Node tail = null;
	
	class Node{
		
		String  data;
		Node next;
		
		Node(String data){
			
			this.data = data;
			this.next = null;
		}
	}
	
	public void addFirst(String data) {
		
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
	
	public void addLast(String data) {
		
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
		
		if(head == null) {
			System.out.println("List is Empty");
		}else {
			
			Node current = head;
		
			if(head	!= tail) {
				
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
			System.out.println("List is Empty ");
		}else {
			
			while(current != null) {
			
				System.out.println(current.data);
				current = current.next;
			}
		}
	}
	public static void main(String[] args) {
		
		Program4_DeleteEndElement ll = new Program4_DeleteEndElement();
		
		System.out.println("****************Original List*****************************");
		ll.addFirst("vidya tai");
		ll.addFirst("varsha");
		ll.addFirst("Rushali");
		ll.addFirst("Ashwani");
		ll.addFirst("swati");
		
		ll.display();
		
		
		ll.deleteLast();
		System.out.println("\n*****************After delete Last***********************");
		ll.display();
		
		System.out.println("\n****************After delete First***********************");
		ll.deleteFirst();
		ll.display();
		
		System.out.println("\n*****************After delete Last***********************");
		ll.deleteLast();
		ll.display();
	}
}
