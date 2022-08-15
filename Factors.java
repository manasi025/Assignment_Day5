package assignments;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args){
		
	Scanner pf = new Scanner (System.in);
    System.out.println("Enter a no. whose Prime Factors are to be displayed : ");
    int N = pf.nextInt();
    for (int i = 2; i <= N; i++) 
    {
        while(N%i == 0) 
        {
            System.out.println(i+ " ");
            N /= i;
        }
    }
}
	
}
