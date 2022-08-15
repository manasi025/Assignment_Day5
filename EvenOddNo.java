package assg;

public class EvenOddNo {
	public static void main(String args[])
	{
		int n;
		for (n = 1; n <= 50; n++)
		{
			if (n%2 == 0)
			{
				System.out.println("Even nos. are : ");
				System.out.println(n);
			}
			else
			{
				System.out.println("Odd nos. are : ");
				System.out.println(n);
			}
		}
	}
}
