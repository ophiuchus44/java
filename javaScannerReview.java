// Scanner class can be imported 2 ways. The non commented code, I think, 
// is the best method for using Scanner. It is imported once in the begining and can be 
// called at anytime with less code. The other method 

import java.util.Scanner;

public class javaScannerReview
{
	public static void main (String [] args)
	{
		
		//Scanner variable inScan is created and Scanner class imported		
		Scanner inScan = new Scanner(System.in);



		System.out.println("Press Enter To Start...");

		// variable stored class capabilities and calls method nextLine
		inScan.nextLine();


		// The non import method requires the same class and method calls but
		// requires more code to be written whenever the feature needs to be called
        //new java.util.Scanner(System.in).nextLine();

		System.out.println("What is your name?");
		String inName = inScan.nextLine();

		System.out.println("Hello " + inName + "... We've been expecting you...");


		String varString = " 'This is a string' ";
		int varStringLength = varString.length();
		System.out.println("\nHere's the string" + varString + "and it's length is " + varStringLength);

		// For comparison, non import method again vs scanner stored in variable
		// new java.util.Scanner(System.in).nextLine();
		inScan.nextLine();

		System.out.println(" *** END OF PROGRAM *** ");

	}

}