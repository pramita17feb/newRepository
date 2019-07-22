package july1st;

public class SalaryException extends Exception{/*Salary exception is the
 user defined exception extends from in built Exception class*/
	 public SalaryException() {//constructor with zero parameter
	        super();
	    }
	    
	    public SalaryException(String msg) {//constructor with 1 parameter 
	        super(msg);//passing the parameter to the super class i.e. Exception class
	    }

}
