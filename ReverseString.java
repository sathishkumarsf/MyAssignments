package week3.day1;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		
		String companyName="TestLeaf";
		
		char[] chr=companyName.toCharArray();
		
		for (int i = 0; i < chr.length; i++)
		{
			System.out.print(chr[i]);
		}
		
		System.out.println("\n************************");
		
		char[] comp1=companyName.toCharArray();
		
		for (int i =comp1.length-1; i >=0; i--) 
		{
			System.out.print(comp1[i]);
		}
	}
}
