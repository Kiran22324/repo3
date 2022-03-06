package mypackage;

import java.util.Scanner;

public class product
{
	Scanner sc=new Scanner();
	
	public boolean aIsBigger1(int a, int b) {
		  if (a > b && (a - b) >= 2) {
		    return true;
		  }

		  return false;
		}
		//Alternately it can be done with an if/else structure like this:

		/*public boolean aIsBigger(int a, int b) {
		  if (a > b && (a - b) >= 2) {
		    return true;
		  } else {
		    return false;*/
		  }
		}

}
