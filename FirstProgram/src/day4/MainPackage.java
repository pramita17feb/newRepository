package day4;
import firstpackage.*;
import secondpackage.*;

class p{
	protected void display() {
		System.out.println("display method of p::");
	}
}

public class MainPackage {
    public static void main(String[] args) {
    	firstpackage.Test obj = new firstpackage.Test();
        obj.displayTest();
        Test1 obj1 = new Test1();
        obj1.displayTest1();
        p obj2=new p();
        obj2.display();// if diplay method is private this line will be errored out
        // if it is protected 
        
    }
}
