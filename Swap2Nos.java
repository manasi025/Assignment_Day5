package assignments;

import java.util.Scanner;

public class Swap2Nos {
	
	public static void main(String[] args)
	{
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the 1st no. : ");
		int first = ab.nextInt();
		Scanner cd = new Scanner(System.in);
		System.out.println("Enter the 2nd no. : ");
		int second = cd.nextInt();
		
		System.out.println("***** Before Swapping *****");
        System.out.println("First number : " + first);
        System.out.println("Second number : " + second);

        first = first - second;
        second = first + second;
        first = second - first;

        System.out.println("***** After Swapping *****");
        System.out.println("First number : " + first);
        System.out.println("Second number : " + second);
        ab.close();
		cd.close();

	}
}
