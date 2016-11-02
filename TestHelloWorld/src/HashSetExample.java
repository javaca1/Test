import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

import inheritance.student.Student;

public class HashSetExample {
	public static void main(String args[]) {

		Comparator compSpec = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				//return o1.getName().compareTo(o2.getName());
//				if(o1.getRating()<o2.getRating())
//					return -1;
//				if(o1.getRating()==o2.getRating())
//					return 0;
//				return 1;
				
				return (o1.getRating()==o2.getRating()? 0 :
					(o1.getRating()<o2.getRating()?-1:1));
			}
		};
		TreeSet<Student> tSet = new TreeSet<>(compSpec);
		tSet.add(new Student("Kishore", "India", "JNTU", 800));
		tSet.add(new Student("Aravind", "US", "MIT", 7));
		tSet.add(new Student("Krishna", "UK", "Cambridge", 10));
		for (Student s : tSet) 
			System.out.println("TreeSet : Item: " + s.getRating());
	}

	public static void getLinkedCollection() {
		Set<String> stSet = new LinkedHashSet<>();
		stSet.add("CAR");
		stSet.add("CAR");
		stSet.add("CAR");
		stSet.add("CAR1");
		for (String s : stSet) {
			System.out.println("LS Item:::;" + s);
		}
		System.out.println("........linked list");
		LinkedList<String> ll = new LinkedList<>();
		ll.add("CAR");
		ll.add("CAR");
		ll.add("CAR");
		ll.add("CAR1");
		for (String s : ll) {
			System.out.println("LL Item:::;" + s);
		}
	}

	public static void getHaset() {

		HashSet<Student> stSet = new HashSet<>();
		Student s1 = new Student("Krishna", "USA", "MIT");
		stSet.add(s1);
		Student s2 = new Student("Krishna1", "USA1", "MIT");
		stSet.add(s2);
		Student s3 = new Student("Krishna2", "USA2", "MIT");
		stSet.add(s3);
		System.out.println(stSet.size());

		for (Student s : stSet) {
			System.out.println("Sudent:::;" + s.getName());
		}
	}

	public static void printFriutSet() {
		// HashSet declaration
		HashSet<String> hset = new HashSet<String>();

		// Adding elements to the HashSet
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");
		// Addition of duplicate elements
		hset.add("Apple");
		hset.add("Mango");
		// Addition of null values
		hset.add(null);
		hset.add(null);

		// Displaying HashSet elements
		System.out.println(hset);
	}
}
