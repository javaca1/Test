package collectionspkg;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		String srArray[] = new String[3];
		srArray[0] = "A1";
		srArray[1] = "A2";
		srArray[2] = "A3";
		System.out.println(srArray.length);
		
		//List ArrayList LinkedList
		List<String> al =new ArrayList<>();
		al.add("E1");
		al.add("E2");al.add("E3");al.add("E4");al.add("E5");
		al.add("E6");al.add("E7");al.add("E8");al.add("E9");al.add("E10");
		
		al.add("E11");
		System.out.println(al);
		System.out.println(al.get(3));
		al.remove("E1");
		
		
		
	}

}
