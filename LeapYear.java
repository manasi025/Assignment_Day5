package assignments;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner LP = new Scanner(System.in);
		System.out.println("Enter the Year in 4 digits : ");
		int n=LP.nextInt();
		
		if ( n % 4 == 0 && n > 999)
		{
			System.out.println(n+" is a Leap Year");
		}
		else if(n % 4 != 0 && n > 999) 
		{
			System.out.println(n+ " is not a Leap Year");
		}
		else
		{
			System.out.println("ERROR!!...Please enter the year in 4 digits ");
		}	
	}
}
