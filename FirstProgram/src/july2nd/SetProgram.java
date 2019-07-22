package july2nd;
import java.util.*;

public class SetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet<String> values=new HashSet<String>();
		//TreeSet<String> values=new TreeSet<String>();
		SortedSet<String> values=new TreeSet<String>();
		values.add("vinay");
		values.add("ram");
		values.add("satish");
		values.add("subash");
		values.add("satish");
		for(String m:values) {
			System.out.println(m);
		}
		System.out.println(values.size());


	}

}
