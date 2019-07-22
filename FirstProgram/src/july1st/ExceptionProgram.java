package july1st;

public class ExceptionProgram {
	public static void main(String[] args) {
		try {
			int num1=10;
			int num2=10;
		int num3=num1/num2;
		System.out.println("result:"+num3);
		
		String names[]= {"ram","vinod","vinay","sunil","manzoor"};
		try {
		for(int i=0;i<=names.length;i++) {
            System.out.println(names[i]);
        } 
		
		}
		 catch(ArrayIndexOutOfBoundsException e) {
             System.out.println(e);
         }
		}
		
		catch(NullPointerException e) {
            System.out.println(e);
        }
		catch(ArithmeticException e){ //or can be used catch(Exception e)
			//Exception is the superclass of all exception
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Final Block");
		}
		System.out.println("Continue execution of the program");
	}

}
