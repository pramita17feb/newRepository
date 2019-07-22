/*Write a function that takes an array as input and returns an array of 2 numbers. The returned array contains the sum of even numbers and sum of odd numbers from the input.

If any of the input is null it should be treated as an empty array

##Example:
 Input:
  [30, 18, 2, 83, 20, 71]
 Output:
  [70, 154]
 

 Input:
  [14, 11, 10, 67, 41]
 Output:
  [24, 119]
 

 Input:
  [36, 24, -82, 29, 44, -3, -100, -5, 49]
 Output:
  [-78, 70]*/
import java.util.Arrays;

public class SumOfEvensAndOdds {
	
	//Function 
	public int[] getSumOfEvensAndOdds(int[] input) {
		// Student code begins here
		int x[] = new int[5];
		for(int i=0;i<input.length;i++) {
			if(input[i]%2==0)
				x[0]=x[0]+input[i];
			else
				x[1]=x[1]+input[i];
		}
			
		return x;
		
		// Student code ends here
	}

	public void printSumOfEvensAndOdds(int[] input) {
		System.out.println(Arrays.toString(getSumOfEvensAndOdds(input)));
	}

	public static void main(String[] args) {

		try {
			int[] input = new int[args.length];
			for (int i = 0; i < input.length; i++) {
				input[i] = Integer.parseInt(args[i]);
			}

			SumOfEvensAndOdds obj = new SumOfEvensAndOdds();
			obj.printSumOfEvensAndOdds(input);
		} catch (NumberFormatException e) {
			System.out.println("Only numbers are allowed.");
		}

	}
}
