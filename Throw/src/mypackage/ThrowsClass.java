package mypackage;

import java.io.IOException;

public class ThrowsClass 
{
	public static int division(int a,int b) throws IOException
	{
		return a/b;
	}
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(division(6,3));
		}
		catch(Exception Ex)
		{
			System.out.println(Ex.getMessage());
		}
		

	}

}
