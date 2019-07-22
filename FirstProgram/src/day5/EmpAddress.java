package day5;

class Address {
    private String address;
    private String city;
    private String country;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
    
}

class Emp {
    private int empid;
    private String empname;
    private Address address; //has a relationship (employee has a address)
    
    
    public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void acceptDetails() {
    Address obj = new Address();
    obj.setAddress("JPN");
    obj.setCity("Bengaluru");
    obj.setCountry("India");
    
    setEmpid(1);
    setEmpname("ram");
    setAddress(obj);//passing the object of address within emp class
}
    public void displayDetails() {
        System.out.println("Id: " + getEmpid());
        System.out.println("Name: " + getEmpname());
        System.out.println("Address: " + address.getAddress());
        System.out.println("City: " + address.getCity());
        System.out.println("Country: " + address.getCountry());
    }
}

public class EmpAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp objEmp = new Emp();
        objEmp.acceptDetails();
        objEmp.displayDetails();

	}

}
