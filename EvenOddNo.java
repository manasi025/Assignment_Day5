package assg;

public class EvenOddNo 
{
	public static void main(String args[])
	{
		int n;
		
		System.out.print("Even nos. are : ");
		for (n = 1; n <= 50; n++)
		{	
			if (n%2 == 0)
			{
				System.out.print(n + "  ");
			}
	         }
		System.out.print("\nOdd nos. are : ");
		
		for (n = 1; n <= 50; n++)
		{
			if (n%2 != 0)
			
			{
				System.out.print(n + "  ");
			}
		
		}
	}
}


/*
OUTPUT :

Even nos. are : 2  4  6  8  10  12  14  16  18  20  22  24  26  28  30  32  34  36  38  40  42  44  46  48  50  
Odd nos. are : 1  3  5  7  9  11  13  15  17  19  21  23  25  27  29  31  33  35  37  39  41  43  45  47  49  

*/
