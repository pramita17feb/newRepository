package july2nd;
import java.util.*;

public class ListProgram {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Ram");
		names.add("ram");
		names.add("Mahesh");
		names.add("satish");
		names.add("satish");
		//for each enhanced loop
		for(String nm:names) {
			System.out.println(nm);
		}
		
		names.remove(1);
		names.remove("Mahesh");
		
		System.out.println("-------------------");
		for(String nm:names) {
			System.out.println(nm);
		}
		
		System.out.println(names.contains("satish"));
		System.out.println(names.indexOf("satish"));
		
		System.out.println(names.size());
		
		names.add(3, "Vinay");
		
		System.out.println("--------------------");
        for(String nm : names) {
            System.out.println(nm);
        }
        
        
        names.set(1, "tushar"); //replace
        System.out.println("--------------------");
        for(String nm:names) {
			System.out.println(nm);
		}
		
	}

}
