package com.bridgelab.program;

import java.util.NoSuchElementException;

public class Queue {
	private ListNode front;
	private ListNode rear;
	private int length;
	public Queue()
	{
		this.front = null;
		this.rear = null;
		this.length = 0;
	}
	private class ListNode
	{
		private int data;
		private ListNode next;
		public ListNode(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	public int length()
	{
		return length;
	}
	public boolean isEmpty()
	{
		return length == 0;
	}
	public void enqueue(int data)
	{
		ListNode temp = new ListNode(data);
		if(isEmpty())
		{
			front = temp;
		}
		else
		{
			rear.next = temp;
		}
		rear = temp;
		length++;
	}
	public int dequeue()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		int result = front.data;
		front = front.next;
		if(front == null)
		{
			rear = null;
		}
		length--;
		return result;
	}

	public void print()
	{
		if(isEmpty())
		{
			return;
		}
		ListNode current = front;
		while(current != null)
		{
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		Queue qu = new Queue();
		qu.enqueue(56);
		qu.enqueue(30);
		qu.enqueue(70);
		qu.dequeue();
		qu.print();
	}
}
