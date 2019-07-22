import java.util.*;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer:");
		num=sc.nextInt();
		System.out.println("Entered value is:"+num);

		System.out.println("-----------------");
		int num1 = 1;
        while(num1 <= 10)
        {
            System.out.println(num1);
            num1++;
        }
        
        System.out.println("-----------------");
        
        do
        {
            System.out.println(num1);
        }while(num1 != 11);
        
        System.out.println("----------------------");
        
        for(num1 = 10;num1>=0;num1--);
        {
            System.out.println(num1);
        }
		
	}

}
