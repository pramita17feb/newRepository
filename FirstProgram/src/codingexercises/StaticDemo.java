package codingexercises;
/*- Create a class Static 
- Create a static method fahrenheitToCelcius which should convert temperature from fahrenheit to celsius and
 return temperature celsius.
- Hint: (5.0 / 9.0) * (fahvalue - 32) converting from fahrenheit to celsius
- Create a static method max which should be able to find the greater number between two given numbers.
- Create a class StaticTest with a main method to test both methods.
- Enter a input for the option in which option 1 should call the fahrenheitToCelcius method and if option 2 
should call the max method.
*/
import java.util.Scanner;
class Static {
	public static double fahrenheitToCelcius(double fahvalue) {
		double celsius=(5.0 / 9.0) * (fahvalue - 32);
		return celsius;
	}
	
	public static void max(int a, int b) {
		if (a>b)
			System.out.println("A is greater than B where A="+a+"and B="+b);
		else System.out.println("B greater than A where A="+a+"and B="+b);
	}

}


public class StaticDemo {
	 	public static void main(String args[]) {
	 		//Scanner sc=new Scanner(System.in);
	 		System.out.println("Enter a valid option: 1 or 2");
	 		System.out.println("Option 1 to fahrenheitToCelcius");
	 		System.out.println("Option 2 to max");
	 		if (args.length<1)
	 			System.out.println("Atleast one option has to be chosen..ending the program.");
	 		
	 		switch(Integer.valueOf(args[0])) {
	 		case 1:System.out.println("Enter temperature in Fahrenheit:");
	 		//double fahvalue=sc.nextDouble();
	 		double fahvalue=Double.parseDouble(args[1]);
	 		System.out.println("and the temperature in Celcius is "+Static.fahrenheitToCelcius(fahvalue));
	 		break;
	 		
	 		case 2:System.out.println("Enter two Integer numbers to compare:");
	 		//int num1=sc.nextInt();
	 		//int num2=sc.nextInt();
	 		int num1=Integer.valueOf(args[1]);
	 		int num2=Integer.valueOf(args[2]);
	 		Static.max(num1,num2);
	 		break;
	 		
	 		default:System.out.println("None of the options(1 or 2) is chosen.");
	 		break;
	 	
	 		}

	 	}
}
