package day5;

public class Customer {
	String custname;
	String city;
	public Customer(String custname,String city) {
		this.custname=custname;
		this.city=city;
	}
	
	
	@Override
	public String toString() {
		return "Customer Name=" + custname + ", City Name=" + city + "]";
	}


	public static void main(String args[]) {
		Customer obj=new Customer("ram","bengaluru");
	System.out.println(obj);//without override method(from source-> Generate toString()) it will print memory address
	}

}
