package codingexercises;

/*
Complete the printPattern method to enter a number and display the pattern as shown below .

Input : 7

Output : 

	*
	**
	***
	****
	*****
	******
	*******
	******
	*****
	****
	***
	**
	*

*/
import java.util.Scanner;

public class Patter {

	public static void printPattern(int n)
	{
		for (int j=1;j<=n;j++) {
			System.out.println("");
		for (int k=1;k<=j;k++)	{
			System.out.print("*");
		}
		}	
		for (int j=n-1;j>=1;j--) {
			System.out.println("");
		for (int k=1;k<=j;k++)	{
			System.out.print("*");
		}
		}

	}

    public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Input:");
		int n=sc.nextInt();
	
		printPattern(n);
    	
    } // end of main

	
} // end of class
