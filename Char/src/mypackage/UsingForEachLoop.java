package mypackage;

import java.util.Scanner;

public class UsingForEachLoop 
{

	public static void main(String[] args) 
	{
		int[] data=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter any number:");
			data[i]=sc.nextInt();
		}
		for (int d:data)
		{
			System.out.println(d);
		}

	}

}
