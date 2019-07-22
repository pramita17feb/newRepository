package july2nd;
import java.util.*;

public class MapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> values=new HashMap<Integer,String>();
		values.put(1,"ram");
		values.put(2,"ravi");
		values.put(3,"satish");
		for(Map.Entry m:values.entrySet()) {
			System.out.println(m.getKey()+","+m.getValue());
		}

	}

}
