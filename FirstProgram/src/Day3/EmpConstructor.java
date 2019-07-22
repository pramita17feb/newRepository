package Day3;

public class EmpConstructor {
    int empId;
    String empName;
    
    EmpConstructor() {
        empId = 0;
        empName = null;
    }
    
    EmpConstructor(int empId,String empName) {
        //this always refer to the class member
        this.empId = empId;
        this.empName = empName;
    }
    
    void displayEmpDetails() {
        System.out.println("Id: " + empId);
        System.out.println("Name: " + empName);
    }
    
    public static void main(String[] args) {
        EmpConstructor emp = new EmpConstructor();
        emp.displayEmpDetails();
        emp = new EmpConstructor(1000, "ram");
        emp.displayEmpDetails();
    }
}