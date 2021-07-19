package com.bridgelab.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import com.bridgelab.program.LinkedListPrg;

public class Utility {
Scanner scanner;
public Utility()
{
	scanner = new Scanner(System.in);
}
	public void readWordFromFile() 
	{
	    try {
		File file = new File("C:\\Users\\User\\git\\Data_Structure\\Data_Structure\\src\\Untitled 1");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
	    String words = buffer.readLine();
	    System.out.println(words.toString());
	    String arr[] = words.split(" ");
	    //System.out.println(arr.toString());
	    LinkedListPrg list = new LinkedListPrg();
	    for(String i: arr)
	    {
	    	list.addStrElement(i);
	    }
	    System.out.println(list.printStrList());
	    System.out.println("Enter the String to check is present in List");
	    String searchWord = scanner.next();
	    String resultFinal = list.removeOrAdd(searchWord);
	   
	    }
	    catch(Exception e)
	    {
	    	//System.out.println("File not Found");
	    	e.printStackTrace();
	    }
		
	}

}