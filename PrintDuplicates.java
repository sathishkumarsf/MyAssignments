package week1.day2;

import java.util.Arrays;

public class PrintDuplicates 
{
	public static void main(String[] args) {

	 int[] num={2, 5, 7, 7, 5, 9, 2, 3};
	 
	 Arrays.sort(num);
	 for (int i = 0; i < num.length; i++) 
	 {
		if(num[i]==num[i+1])
			
		{
			System.out.println("Print the duplicate values:"+num[i]);
				}
	}
}
}