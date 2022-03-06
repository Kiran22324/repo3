package mypackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MyClass 
	{
	class Employee implements Serializable
	{
		
		public String name;
		public int id;
		public int salary;
		
		public Employee(int id, String name, int salary)
		{
			this.id=id;
			this.name=name;
			this.salary=salary;
		}
	}

	public static void main(String[] args) throws IOException 
	{
		Employee emp = new Employee(1,"Meg",4000);
		
		FileOutputStream fout = new FileOutputStream("F:\\EmployeeData\\Emp.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(emp);
		
		out.close();
		
		System.out.println("Object is saved in a file");

	}

}
