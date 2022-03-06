package amazonpackage;

import java.util.Scanner;

public class product {
	public void readData()
	{
	
	public int id;
	public String name;
	public int price;

	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Id");
	id=Integer.parseInt(obj.nextInt());
	System.out.println("Enter Name");
	name=obj.nextLine();
	System.out.println("Enter Price");
	price=Integer.parseInt(obj.nextInt());
	obj.close();
	public void printData() 
	{
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Price:"+price);
	
	
	}
}
	
