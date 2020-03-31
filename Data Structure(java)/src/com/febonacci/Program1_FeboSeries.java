package com.febonacci;

public class Program1_FeboSeries {

	Node head = null;
	Node tail = null;
	
	class Node {
		
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
			tail = newNode
					;
		}else {
			
			tail.next = newNode;
			tail = newNode;
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
	
		Program1_FeboSeries pr = new Program1_FeboSeries();
		
		int num1 = 0,num2 = 1,sum = 0;
		
		for (int i = 0; i < 10; i++) {
			pr.addElement(num1);
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
		
		System.out.println("List is");
		pr.display();
			
	}	
}

/**
 * 

List is
0
1
1
2
3
5
8
13
21
34


*/
