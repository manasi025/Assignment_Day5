package assignments;

import java.util.Scanner;

public class QuotientRemainder 
{
	public static void main (String[] args) {  
	    System.out.println("Enter the value of Dividend & Divisor : ");  
	    Scanner sc = new Scanner(System.in);  
	    int Dividend = sc.nextInt();  
	    int Divisor = sc.nextInt();  
	    int Quotient = 0, Remainder = 0;  
	  
	      
	    Quotient = Dividend / Divisor;  
	  
	    Remainder = Dividend % Divisor;  
	  
	    System.out.println("Quotient when " + Dividend + "/" + Divisor + " is: "   
	  
	+ Quotient);  
	    System.out.println("Remainder when " + Dividend + "/"   
	  
	+ Divisor + " is: " + Remainder);  
	    }  
}

/*
OUTPUT :

Enter the value of Dividend & Divisor : 
15
10
Quotient when 15/10 is: 1
Remainder when 15/10 is: 5

*/
