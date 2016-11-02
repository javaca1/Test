import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import inheritance.student.Student;

public class MapExamples {
	public static void main(String[] args) {
		
		Comparator compSpec = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				//return o1.getName().compareTo(o2.getName());
				if(o1.getRating()<o2.getRating())
					return -1;
				if(o1.getRating()==o2.getRating())
					return 0;
				return 1;
				
			}
		};
		TreeMap<Student, Student> mapObj = new TreeMap<>(compSpec);
		System.out.println("Treemap:--------");
		Student s1 = new Student("Krishna", "US", "CSU");
		Student s2 = new Student("Aravind", "US", "CSU");
		Student s3 = new Student("Kishore", "US", "CSU");
		mapObj.put(s1, s1);
		mapObj.put(s2, s2);
		mapObj.put(s3, s3);

//		System.out.println("Search:"+ mapObj.get("Kishore"));
		for (Map.Entry entrObj : mapObj.entrySet()) {
			System.out.println("Key:" + entrObj.getKey() + "   " + "Value:" + entrObj.getValue());

		}
		
//		getHashMap();
//		getLinkedHashMap();
	}
	
	
	
	public static void getTreeMap(){
		TreeMap<String, Student> mapObj = new TreeMap<>();
		System.out.println("Treemap:--------");
		Student s1 = new Student("Krishna", "US", "CSU");
		Student s2 = new Student("Aravind", "US", "CSU");
		Student s3 = new Student("Kishore", "US", "CSU");
		mapObj.put(s1.getName(), s1);
		mapObj.put(s2.getName(), s2);
		mapObj.put(s3.getName(), s3);

		System.out.println("Search:"+ mapObj.get("Kishore"));
		for (Map.Entry entrObj : mapObj.entrySet()) {
			System.out.println("Key:" + entrObj.getKey() + "   " + "Value:" + entrObj.getValue());

		}
		
	}

	public static void getHashMap() {
		System.out.println(" Hashmap:--------");
		HashMap<String, Object> mapObj = new HashMap<>();
		Student s1 = new Student("Krishna", "US", "CSU");
		Student s2 = new Student("Aravind", "US", "CSU");
		Student s3 = new Student("Kishore", "US", "CSU");

		mapObj.put(s1.getName(), s1);
		mapObj.put(s2.getName(), s2);
		mapObj.put(s3.getName(), s3);
		Student st = (Student) mapObj.get("Kishore");

		System.out.println(st.getAddress());
		for (Map.Entry entrObj : mapObj.entrySet()) {
			System.out.println("Key:" + entrObj.getKey() + "   " + "Value:" + entrObj.getValue());
		}
	}

	public static void getLinkedHashMap() {
		LinkedHashMap<String, Object> mapObj = new LinkedHashMap<>();
		System.out.println("Linked Hashmap:--------");
		Student s1 = new Student("Krishna", "US", "CSU");
		Student s2 = new Student("Aravind", "US", "CSU");
		Student s3 = new Student("Kishore", "US", "CSU");
		mapObj.put(s1.getName(), s1);
		mapObj.put(s2.getName(), s2);
		mapObj.put(s3.getName(), s3);
		Student st = (Student) mapObj.get("Kishore");

		System.out.println(st.getAddress());
		for (Map.Entry entrObj : mapObj.entrySet()) {
			System.out.println("Key:" + entrObj.getKey() + "   " + "Value:" + entrObj.getValue());

		}
	}
}
