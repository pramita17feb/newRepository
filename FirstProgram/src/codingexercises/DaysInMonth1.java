package codingexercises;

import java.util.Scanner;

public class DaysInMonth1 {
	
	private static boolean isleap(long year) {
		boolean flag;
		if(year%400==0)
			flag=true;
		else if(year%100==0)
			flag=false;
		else if(year%4==0)
			flag=true;
			else
				flag=false;
		return flag;
	}

	private static int maxDays(int month,long year){
		int result=0;
		if (month<=1&&month>=12)
			result=-1;
		else if(year<=1)
			result=-2;
		else
			/*switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:result=31;
			break;
			case 4:
			case 6:
			case 9:result=30;
			break;
			case 2:if(leapYear(year))
			result=29;
			else result=28; 
				break;
			}*/ 
			//implemented with switch case
			if(month==1||month==3||month==5||month==7||month==8||month==10)
				result=31;
			else if(month==4||month==6||month==9)
				result=30;
			else if(month==2) 
				if(isleap(year))
					result=29;
					else result=28; 
			return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter Month from 1 to 12:");
		int month=sc.nextInt();
		System.out.println("Please enter Year:");
		long year=sc.nextLong();
		int d=maxDays(month,year);
		System.out.println("Total Number of days: "+d+" in month of "+month+" in Year "+year);

	}

}
