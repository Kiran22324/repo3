package mypackage;

import java.util.Scanner;

public class Myclass 
{

	public static void main(String[] args) 
	{
		//Declairing variable
		int [] data= new int [] {42,23,22,24,66,24,98,89,98,55,24};
		boolean isFound=false;
		int input;
		
		//Read data from user
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter number to search:");
		input=Integer.parseInt(obj.nextLine());
		for (int i=0;i<data.length;i++)
		{
			if(data[i]==input)
				{
				System.out.println("Found at index:"+i+"position");
				isFound=true;
				}
		}
		
		if(isFound==false)
		{
			System.out.println("Element not Found");
		}
	}

}
