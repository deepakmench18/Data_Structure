package com.bridgelab.program;

public class Hash {
     private HashNode [] buckets;
     private int numofBuckets;
     private int size; // number of key value pair in hash table
     public Hash()
     {
    	 this(10);
     }
     public Hash(int capacity)
     {
    	 this.numofBuckets = capacity;
    	 this.buckets = new HashNode[numofBuckets];
    	 this.size = 0;
     }	 
     
     
     public class HashNode
     {
    	 private Integer key;
    	 private String value;
    	 private HashNode next;
    	 public HashNode(Integer key,String value)
    	 {
    		 this.key = key;
    		 this.value = value;
    	 }
     }
     public int getBucketIndex(Integer key)
     {
    	 return key % numofBuckets;
     }
     public void put(Integer key,String value)
     {
    	 if(key == null || value == null)
    	 {
    		 throw new IllegalArgumentException("key or value are null");
    	 }
    	 int bucketIndex = getBucketIndex(key);
    	 HashNode head = buckets[bucketIndex];
    	 //Check existing value in node table
    	 while(head != null)
    	 {
    		if(head.key.equals(key))
    		{
    			head.value = value;
    			return;
    		}
    		head = head.next;
    	 }
    	 size++;
    	 head = buckets [bucketIndex];
    	 HashNode node = new HashNode(key,value);
    	 node.next = head;
    	 buckets [bucketIndex] = node;
     }
     public static void main(String [] args)
     {
    	 Hash hash = new Hash();
    	 hash.put(5,"deepak");
    	 hash.put(6,"deepa");
    	 hash.put(7,"deep");
    	 System.out.println(hash.getValueofkey(5));
    	 System.out.println("check size of hash " + hash.size());
    	 
     }
     public String getValueofkey(Integer key)
     {
    	 int bucketIndex = getBucketIndex(key);
    	 HashNode head = buckets[bucketIndex];
    	 //Check existing value in node table
    	 while(head != null)
    	 {
    		if(head.key.equals(key))
    		{
    			return head.value;
    		}
    		head = head.next;
    	 }
    	 return null;
     }
     {
    	 
     }
     private int size()
     {
    	 return size;
     }
    
}
     
