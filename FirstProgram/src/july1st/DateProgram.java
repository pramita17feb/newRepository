package july1st;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateProgram {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		/*
		 * Either Throws or try catch block
		 * Throws will not handle exception, it is just to avoid compile time exception
		 *  but to handle you need to use try catch
		 * Throws is for in built exception
		 * Throw is to throw particular exception user defined
		 */
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");//it has to be capital MM otherwise it will consider mints
		
		Date dt=new Date();
		System.out.println(dt);
		
		String dob="14-07-2019";// if you give "14-Jan-2019" it will throw exception
		Date date=format.parse(dob);// to convert string to date format
		System.out.println(date);

	}

}
