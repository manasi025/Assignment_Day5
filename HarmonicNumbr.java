package assignments;

import java.util.Scanner;

public class HarmonicNumbr {
	
	public static void main(String[] args) 
	{
		Scanner HM = new Scanner(System.in);
		System.out.println("Enter Nth Harmonic Value : ");
		int num = HM.nextInt();
		int result = 0;
		System.out.println("The Harmonic Series is : ");
	
		for (int i = 1; i <= num;  i++) 
		{
			double Harmonic_no = result + (double)1 /i;
			System.out.println(Harmonic_no+ ", ");
			HM.close();
		}

	}
}

/*
OUTPUT : 

The Harmonic Series is : 
1.0 
0.5 
0.3333333333333333 
0.25 
0.2 

*/
