package calculator;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args)
	{int num1,num2;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter first number?");
	num1=sc.nextInt();
	System.out.println("Enter second number?");
	num2=sc.nextInt();
	System.out.println("Arithmatic operations of two numbers are:");
	System.out.println("Addition of the numbers:"+(num1+num2));
	System.out.println("Substraction of the numbers:"+(num1-num2));
	System.out.println("Multiplication of the numbers:"+(num1*num2));
	System.out.println("Division of the numbers:"+(num1/num2));
	}

}
