package com.stack;

public class Program1_StackDemo {

	int maxSize = 10;
	int arr[] = new int[maxSize];
	int top;

	boolean isEmpty() {
		
		return (top < 0);
	}
	
	public Program1_StackDemo() {
		
		top = -1;
	}
	
	boolean push(int data) {
		
		if(top == maxSize - 1) {
			
			System.out.println("Stack is Ovreflow");
			return false;
		}else {
			
			top++;
			arr[top] = data;
			return true;
		}
	}
	
	boolean pop() {
		
		if(top == -1) {
			System.out.println("Stack is UnderFlow");
			return false;
		}else {
			top--;
			System.out.println("Pop the Elements");
			return true;
		}
	}
	
	public void display() {
		
		for (int i = top; i >= 0; i--) {
			
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		
		Program1_StackDemo ss = new Program1_StackDemo();
		
		ss.push(50);
		ss.push(30);
		ss.push(20);
		ss.push(10);
		
		ss.display();
		
		System.out.println("\nAfter delete Elements");
		ss.pop();
		ss.display();
		
		
	}

}
