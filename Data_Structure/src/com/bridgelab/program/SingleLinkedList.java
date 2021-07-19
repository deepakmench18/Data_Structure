package com.bridgelab.program;
public class SingleLinkedList {
	//Create a HEAD node of type instance variable
	private ListNode head;
	public static class ListNode {
		private int data;  // Data may be generic
		private ListNode next;
		public ListNode(int data) 
		{
			this.data = data;
			this.next = null;
		}
	  }
	    public void display() 
	    {
	    	ListNode current = head;
	    	while(current != null) {
	    		System.out.print(current.data + "--->");
	    		current = current.next;
	    	}
	    	System.out.println("null");
	    }
	    public void insertAtFirst(int value) 
	    {
	    	ListNode newNode = new ListNode(value);
	    	newNode.next = head;
	    	head = newNode;
	    }
	    public void insertAtEnd(int value)
	    {
	    	ListNode newNode = new ListNode(value);
	    	if(head == null)
	    	{
	    		head = newNode;
	    		return;
	    	}
	    	ListNode current = head;
	    	while(null != current.next)
	    	{
	    		current = current.next;
	    	}
	    	current.next = newNode;
	    	
	    }
	    public void insertAnyPosition(int position,int data)
	    {
	    	ListNode node = new ListNode(data);
	    	if(position == 1)
	    	{
	    		node.next = head;
	    		head = node;
	    	}
	    	else
	    	{
	    		ListNode previous = head;
	    		int count = 1;
	    		while(count < position - 1)
	    		{
	    			previous = previous.next;
	    			count++;
	    		}
	    		ListNode current = previous.next;
	    		node.next = current;
	    		previous.next = node;
	    	}
	    }
	    public void anyPositiondelete(int position)
	    {
	    	if(position == 1)
	    	{
	    		head = head.next;
	    	}
	    	else
	    	{
	    		ListNode previous = head;
	    		int count = 1;
	    		while(count < position - 1)
	    		{
	    			previous = previous.next;
	    			count++;
	    		}
	    		ListNode current = previous.next;
	    		previous.next = current.next;
	    	}
	    }
	    public void getSort()
	    {
	      ListNode current = head;
	      while(current.next != null)
	      {
	    	  if(current.data > current.next.data)
	    	  {
	    		  int data = current.data;
	    		  current.data = current.next.data;
	    		  current.next.data = data;
	    	  }
	    	  current = current.next;
	      }
	    	
	    }
		public static void main (String [] args) 
		{
			SingleLinkedList sll = new SingleLinkedList();
			sll.head = new ListNode(56);
			ListNode second = new ListNode(30);
			ListNode third = new ListNode(70);
			sll.head.next = second;
			second.next = third;
			//sll.insertAtFirst(50);
			//sll.insertAtFirst(11);
			//sll.insertAtEnd(25);
			//sll.insertAnyPosition(4,12);
			//sll.anyPositiondelete(2);
			sll.getSort();
			sll.display();
		}
        }