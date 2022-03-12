package mypackage;

import java.util.Scanner;

public class ToReadFiveNumbersFromUserUsingForLoop 
{

	public static void main(String[] args) 
	{
		int [] data=new int[5];
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<5;i++)
		{
			System.out.println("Enter any number:");
			data[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		System.out.println(data[i]);

	}

}
