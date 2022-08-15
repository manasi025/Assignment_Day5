package assignments;

public class PowerOf2 {
	public static int main (String[] args)
	{
		int res = 0;
		int n = 0;
		for (int i = n; i >= 1; i--)
		{
			if ((i & i-1)==0)
			{
				res =i;
				break;
			}
		}
		return res;
		
	}
}
