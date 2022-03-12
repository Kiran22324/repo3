package mypackage;

import java.util.Scanner;

public class DoWhile 
{

	public static void main(String[] args) 
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		a=sc.nextInt();
		do
		{
			System.out.println(a);
			a++;
		}
		while(a<=100);
		

	}

}
