package com.insetatspecificposition;

public class Program1_DeletePsotionAtNode {

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
			
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void deleteAtPosi(int posi) {
		Node temp = head;
		
		if(head == null) {
			System.out.println("List is Empty");
		}
		
		
		if(posi == 1) {
			head = temp.next;
		}
		
		for(int i=1;temp != null && i<posi-2;i++) {
			temp = temp.next;
		}
		
		Node next = temp.next.next;
		temp.next = next;
		
	}
	public void display() {
		
		if(head == null) {
			System.out.println("List is Empty");
			
		}else {
			
			Node curr = head;
			
			while(curr != null) {
				
				System.out.println(curr.data);
				curr = curr.next;
			}
		}
	}
	
	public static void main(String[] args) {
	
		Program1_DeletePsotionAtNode pr = new Program1_DeletePsotionAtNode();
		
		pr.addElement(10);
		pr.addElement(30);
		pr.addElement(40);
		pr.addElement(50);
		pr.addElement(60);
		
		pr.display();
		
		pr.deleteAtPosi(2);
		System.out.println("Nodes are");
		pr.display();
	}
}
