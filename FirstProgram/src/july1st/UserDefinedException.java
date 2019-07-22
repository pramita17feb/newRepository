package july1st;
import java.util.Scanner;

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary:: ");
        int sal = sc.nextInt();
        
        try {
        
        if(sal <= 0)
           throw new SalaryException("salary can't be negative");
        else
            System.out.println(sal);
        }
        catch(SalaryException e) {
            System.out.println(e);
        }

	}

}
