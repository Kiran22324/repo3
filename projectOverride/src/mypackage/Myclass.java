package mypackage;

class EnglishMessage
{
	public void sayHi()
	{
		System.out.println("Hii");
	}
	public void sayHello()
	{
		System.out.println("Hello");
	}
	public void sayGoodMorning()
	{
		System.out.println("Good Morning");
	}
}

class HindiMessage extends EnglishMessage
{
	@Override
	public void sayGoodMorning()
	{
		System.out.println("Shubhodhaya");
	}
}

public class Myclass {

	public static void main(String[] args) 
{
	//Here we creating an object to call the function in the child class
		HindiMessage hm=new HindiMessage();
		hm.sayGoodMorning();

	}

}
