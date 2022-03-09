package mypackage;

public class Myclass
{

public static int division(int a,int b) 
{
	int c=0;
	try
	{
		if (b==0)
			throw new ArithmeticException("second number cannot be zero");
		else
			c=a/b;
		
	}
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}
	return c;
}
public static void main(String[] args) 
	{
		System.out.println(division(8, 2));

	}

}
