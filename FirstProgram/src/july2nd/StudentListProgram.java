package july2nd;
import java.util.*;

class Student{
	private String studentname;
	private String studentAddress;
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	public void acceptdetails() {
		Scanner sc=new Scanner(System.in);
		setStudentname(sc.nextLine());
		setStudentAddress(sc.nextLine());
		
	}
	
	public void displaydetails() {
		System.out.println("Name: "+getStudentname()+" , Address: "+getStudentAddress());
	}
	
}

public class StudentListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Student> obj = new ArrayList<Student>();
	        Student s = new Student();
	        s.acceptdetails();
	        obj.add(s);
	        s = new Student();
	        s.acceptdetails();
	        obj.add(s);
	        
	        for(Student st : obj) {
	            st.displaydetails();
	        }
	        
	}

}
