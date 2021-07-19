package com.bridgelab.program;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {21,56,45,7,2,4};
        for(int i = 1;i < arr.length;i++)
        {
        	int temp = arr[i];
        	int j = i - 1;
        	while(j >= 0 && arr[j] > temp)
        	{
        		arr[j+1] = arr[j];
        		j = j - 1;
        	}
        	arr[j+1] = temp;
        
        }
        System.out.println(Arrays.toString(arr));
	}

}
