package com.bridgelab.program;
public class BinaryTree  {
	private static TreeNode root;
	class TreeNode 
	{
		int data;
		TreeNode left;
		TreeNode right;
		public TreeNode(int data)
		{
			this.data = data;
			this.right = null;
			this.left = null;
		}
	}
	public TreeNode insert(TreeNode root,int val)
	{
		if(root == null)
		{
			return createNewNode(val);
		}
		if(val < root.data)
		{
			root.left = insert(root.left,val);
		}
		else if(val > root.data)
		{
			root.right = insert(root.right,val);
		}
		return root;
	}
	public TreeNode createNewNode(int k)
	{
		TreeNode sec = new TreeNode(k);
		sec.data = k;
		sec.left = null;
		sec.right = null;
		return sec;
	}
	public int getsize(TreeNode root)
	{
		if(root == null)
		{
			return 0;
		}
		return 1 + getsize(root.left) + getsize(root.right);
	}
	public void print(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		print(root.left);
		System.out.println(root.data);
		print(root.right);
	}
	public boolean nodeValid(TreeNode root, int val) 
	{      
		if (root == null) {
			return false;
		}
		Boolean isValid = false;                           
		
		while (root != null) {
			if(val < root.data) 
			{
				root = root.left;
			}
			else if(val > root.data) {
				root = root.right;
			}
			else 
			{
				isValid = true;
				System.out.println("Node is Valid");
				break;
			}
		}
		return isValid;
	}
	public static void main(String[] args) {
	    	BinaryTree bt = new BinaryTree();
	    	TreeNode root = null;
	    	root = bt.insert(root,56);
	    	root = bt.insert(root,30);
	    	root = bt.insert(root,70);
	    	bt.print(root);
	    	bt.nodeValid(root,10);
			//System.out.println("Size of the tree is"+ bt.getsize(root));
	}
}