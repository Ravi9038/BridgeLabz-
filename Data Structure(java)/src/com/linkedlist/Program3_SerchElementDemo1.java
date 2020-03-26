package com.linkedlist;

public class Program3_SerchElementDemo1 {
	
	Node head = null;
	Node tail = null;
	
	class Node{
		
		String data;
		Node next;
		
		Node(String data){
		
			this.data = data;
			this.next = null;
		}
	}
	
	public void addFirst(String data) {
		
		Node strNode = new Node(data);
		
		if(head == null) {
			
			head = strNode;
			tail = strNode;
		}else {
			
			Node temp = head;
			head = strNode;
			head.next = temp;
		}
	}
	
	public void searchElement(String data) {
		
		Node current = head;
		int i = 1;	//we need to find the Position of present node thats why we can keep the i
		boolean flag = false;	
		
		if(head == null) {
			
			System.out.println("List is Empty");
		}else {
			
			while (current != null) {
				
				if(current.data == data) {
					
					flag = true;
					break;
				}
				
				i++;
				current = current.next;
			}
		}
		
		if(flag) {
			
			System.out.println("In List Element is Present "+i+" Position and data is "+data);
		}else {
			System.out.println("In List Data is Absennt = "+data);
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
		
		Program3_SerchElementDemo1 strList = new Program3_SerchElementDemo1();
		
		strList.addFirst("Rohini");
		strList.addFirst("Swati");
		strList.addFirst("Ravi");
		
		strList.display();
		
		//Searching Element in the List
		strList.searchElement("Ravi");
		
	}
}
