package assignments;

import java.util.Scanner;

public class LargestNo {
	public static void main(String[] args) 
    {
        int x=2, y=1, z=7;
        
        
        if(x > y && x > z)
        {
            System.out.println("Largest number is : "+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is : "+y);
        }
        else
        {
            System.out.println("Largest number is : "+z);
        }
 
    }
}
