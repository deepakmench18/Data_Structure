package com.bridgelab.program;

import java.util.Scanner;

public class Anagram {
	public boolean anagram(String str1,String str2)
	{
		if(str1.length() != str2.length())
		{
			return false;
		}
		for(int i = 0;i < str1.length();i++)
		{
			Character char1 = str1.charAt(i);
			if(! str2.contains(char1.toString()))
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
	    Anagram obj = new Anagram();
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter First Word");
	    String str1 = sc.next();
	    System.out.println("Enter Second Word");
	    String str2 = sc.next();
	    boolean check = obj.anagram(str1, str2);
	    System.out.println(check);
	    
	}
}
