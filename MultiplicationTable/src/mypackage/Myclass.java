package mypackage;

import java.util.Scanner;

public class Myclass {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
			try
			{
				int n;
				System.out.println("Enter any number:");
				n=Integer.parseInt(obj.nextLine());
				for (int i=1;i<=20;i++)
				{
					System.out.println(n+"x"+i+"="+n*i);
				}
				obj.nextLine();
			}
			catch (NumberFormatException Ex)
			{
				System.out.println("Only numbers are allowed");
			}
		}

}


