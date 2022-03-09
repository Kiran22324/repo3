package algebrapackage;

class Algebra
{
	public static int add (int a,int b)
	{
		return a*b;
	}
	
	public static int add(int a,int b,int c) 
	{
		return a+b+c;
	}
	public static int add(int a,int b,int c,int d)
	{
		return a+b+c+d;
	}
}




public class Myclass 
{

	public static void main(String[] args) 
	{
		System.out.println(Algebra.add(5, 6));
		System.out.println(Algebra.add(5, 6,7));
		System.out.println(Algebra.add(8, 4,6,8));
	}

}
