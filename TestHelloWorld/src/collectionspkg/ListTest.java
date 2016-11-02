package collectionspkg;

import java.util.LinkedList;
import java.util.List;

import inheritance.student.Student;

public class ListTest {

	public static void main(String[] args) {

		List<Student> list1 = getStudentVector();
		long time = System.currentTimeMillis();
		System.out.println("time1:"+time);
		for(int i=1000000-200; i<list1.size();i ++){
//		for(int i=0; i<100;i ++){
			list1.remove(i);
		}
		System.out.println("time2:"+(System.currentTimeMillis()-time));

	}

	private static List<Student> getStudentVector() {
		List<Student> list = new LinkedList<>();
		for(int i =0 ;i<1000000; i++){
			Student s1 = new Student("Aravind"+i, "USA"+i, "MIT"+i);
			list.add(s1);
		}
		
		return list;

	}
}
