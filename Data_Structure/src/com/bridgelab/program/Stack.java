package com.bridgelab.program;

public class Stack {
	private ListNode top;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public Stack() {
		top =null;
		length=0;
	}
	
	public int getLength() {
		return length;
		
	}
	
	public boolean isEmpty() {
		 return length == 0;
	}
	
	public void push(int data) {
		ListNode tem = new ListNode(data);
	     tem.next = top;
	     top = tem;
	     length++;
	}

	public static void main(String[] args) {
	Stack stack = new Stack();
	stack.push(1);
	stack.push(23);
	stack.push(24);
	stack.push(20);
	stack.display(stack);
	System.out.println("Stack"+stack.peek());
	//System.out.println("Stack"+stack.pop());
	//System.out.println("Stack"+stack.pop());
	//System.out.println("Stack"+stack.pop());
	//System.out.println("Stack"+stack.pop());
	//System.out.println("Stack"+stack.isEmpty());
	System.out.println(" "+stack);
	//System.out.println(stack.);
	}
	private int peek() {
		return top.data;
	}
	public int pop() 
	{
		int result = top.data;
		top = top.next;
		length--;
		return result;	
	}
	public void display(Stack stack ) {
		//System.out.println(stack.peek());
		while (!isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();		
		}
	}
}