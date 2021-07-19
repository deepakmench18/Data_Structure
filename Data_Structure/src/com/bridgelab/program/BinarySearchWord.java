package com.bridgelab.program;

import java.util.Arrays;

public class BinarySearchWord {

	public void insertionSort(String[] arr,String word)
	{
		for(int i = 0;i <= arr.length;i++)
		{
			while(i < arr.length)
			{
				if(arr[i].contains(word) && arr[i].length() == word.length())
				{
					System.out.println("Match");
					break;
				}
				else
				{
					System.out.println("Not matched");
					
					i = i + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		BinarySearchWord obj = new BinarySearchWord();
		String[] arr = {"deepak","rao","shankar"};
		String word = "rao";
		obj.insertionSort(arr, word);
	}
}
