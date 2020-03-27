package com.linkedlist;

public class Program5_DeleteEnd {

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
	
	public void AddFirst(int data) {
		
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
	
	
	public void deleteEnd() {
		
		if(head == null) {
			System.out.println("List is Empty");
		}else {
			
			if(head != tail) {
				
				Node current = head;
								
				while (current.next != tail) {
					
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
			while (current != null) {
				
				System.out.println(current.data);
				current = current.next;
			}
		}
	}
	public static void main(String[] args) {

		Program5_DeleteEnd ll = new Program5_DeleteEnd();
		
		ll.AddFirst(10);
		ll.AddFirst(2);
		ll.AddFirst(30);
		ll.AddFirst(40);
		ll.AddFirst(50);
		ll.AddFirst(60);
		ll.AddFirst(70);
		
		System.out.println("List Printed");
		ll.display();
		
		ll.deleteEnd();		
		System.out.println("End is Delete");
		ll.display();
		
		ll.deleteEnd();		
		System.out.println("End is Delete");
		ll.display();
	}
}

/**

List Printed
70
60
50
40
30
2
10
End is Delete
70
60
50
40
30
2
End is Delete
70
60
50
40
30

*/
