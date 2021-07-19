package com.bridgelab.program;

import java.util.Scanner;

public class PrimeNumber {
	
	public  boolean  palindromic(int i)
	{
		int num = 0 ,rev = 0,temp1 = 0;
	    temp1 = i;
		while(i > 0)
		{
		
		num = i % 10;
		rev = rev * 10 + num;
		i = i / 10;
		}
		if(temp1 == rev)
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	public void getprimenumber(int first,int last)
	{
		for(int i = first;i <= last;i++)
		{
			int c = 1;
			for(int j = 2;j <= i/2;j++)
			{
				if(i % j == 0)
				{
					c = 0;
				}
			}
			boolean check = palindromic(i);
			if(c == 1 && check == true && i != 0 && i != 1)
			{
				System.out.println("prime and Palandrome number:"+ i);
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		PrimeNumber obj = new PrimeNumber();
		int first = 0;
		int last = 100;
		obj.getprimenumber(first, last);
	}
}
