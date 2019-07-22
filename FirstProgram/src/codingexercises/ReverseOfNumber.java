package codingexercises;

/*Write a Java function to accept a number and return the reverse of the same. If the number ends with one or more zeros, then in the reversed number those zeros will not be present (since those zeros become leading zeros).

If the input number is negative, the sign should be retained.

##Examples
 Input:
  -123
 Output:
  -321

 Input:
  1123400
 Output:
  43211
*/
public class ReverseOfNumber {
	
	//Function
	public long reverse(long input) {
		// STUDENT CODE BEGINS HERE
		long rev=0;
		boolean flag=false;
		if(input==0)
			rev=0;
		else
		if(input<0) {
			input=-input;
			flag=true;
		}
		while(input%10==0) 
			input=input/10;
		while(input>0) {
		rev=(rev*10)+(input%10);
		input=input/10;
		}
		if (flag)
			rev=-rev;
	return rev;
		
		// STUDENT CODE ENDS HERE
	}

	private void printInReverse(long input) {
		System.out.println(reverse(input));
	}

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Exactly 1 input required.");
			return;
		}
		
		if(args[0].toUpperCase().endsWith("L")){
			args[0] = args[0].substring(0, args[0].length()-1);
			
		}

		try {
			long input = Long.parseLong(args[0]);
			ReverseOfNumber obj = new ReverseOfNumber();
			obj.printInReverse(input);
		} catch (NumberFormatException e) {
			System.out.println("Only integers allowed.");
		}
	}
}
