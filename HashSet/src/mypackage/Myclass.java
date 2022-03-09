package mypackage;

import java.util.HashSet;

public class Myclass {

	public static void main(String[] args) 
	{
		HashSet<Integer> data=new HashSet<Integer>();
		data.add(56);
		data.add(46);
		data.add(85);
		data.add(100);
		data.add(24);
		data.add(45);
		
		System.out.println(data.size());
	}

}
