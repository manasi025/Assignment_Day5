package assignments;
import java.util.Random;
import java.util.Scanner;

public class FlipCoin1 {
	public static void main(String[] args) {
		 int heads = 0;
	        int tails = 0;
	        int counter = 1;
	        double randNum = 0.0;
	       Scanner in = new Scanner(System.in);
	         
	       System.out.println(" How many times will the coin be flipped? ");
	        int flips = in.nextInt();
	        while(counter <= flips)
	        {
	            randNum = Math.random();
	            
	            if(randNum < .5)
	            {
	                heads++;
	            }
	            else
	            {
	                tails++;
	               }
	            counter++;      
	        }
	       
	        System.out.println("Number of Heads = " + heads);
	        System.out.println("Number of Tails = " + tails);
	        double percentHeads = (float)heads/(float)flips*100;
	        double percenttails = 100 - percentHeads;
	        System.out.println("Percentage of getting Heads = " + percentHeads+ " %");
	        System.out.println("Percentage of getting Tails = " + percenttails+ " %");
				    

	}
}