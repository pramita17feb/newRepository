package Day3;
import java.util.*;
//modifier which will allow to access outside the class and outside the package
public class Employee {
int empId;
String empname;
String address;

void acceptEmpDetails() {
    Scanner scanner = new Scanner(System.in);
    empId = scanner.nextInt();
    scanner.nextLine();
    empname = scanner.nextLine();
    address = scanner.nextLine();
}

//function / method
//void means return value (which does not return the value)
//no parameter defined
void displayEmpDetails() {
    System.out.println("Employee Id: " + empId);
    System.out.println("Name: " + empname);
    System.out.println("Address: " + address);
}
  
public static void main(String[] args) {
    //Employee emp; //reference
    //emp becomes object after initializing the reference
    Employee emp = new Employee(); //default constructor
  //by the JVM
    emp.acceptEmpDetails();
    emp.displayEmpDetails();
}
}
