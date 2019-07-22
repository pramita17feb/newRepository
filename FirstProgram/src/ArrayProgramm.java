		import java.util.*;
		public class ArrayProgramm {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int size = sc.nextInt();
		        sc.nextLine();
		        
		        String names[] = new String[size];
		        
		        for(int i=0;i<=5;i++) {
		            names[i]  = sc.nextLine();
		        }
		        
		        System.out.println("-------------");
		        
		        for(int i=4;i>=0;i--) {
		            System.out.println(names[i]);
		        }
		        
		        System.out.println("========================");
		        int num[][] = new int[3][3];
		        
		        Scanner sc1 = new Scanner(System.in);
		        for(int i=0;i<=2;i++) {
		            for(int j=0;j<=2;j++) {
		                num[i][j] = sc1.nextInt();
		            }
		        }
		        
		        System.out.println("---------------");
		        
		        for(int i=0;i<=2;i++) {
		            for(int j=0;j<=2;j++) {
		                System.out.print(num[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
		

	}


