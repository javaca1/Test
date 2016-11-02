package inheritance.single;

import inheritance.person.Person;
import inheritance.student.Student;

public class SingleInheritance {

public static void main(String[] args) {
	Person personObject1 = new Person("Aravind","India");
	Person personObject2 = new Person("Aravind","India");
	System.out.println(personObject1.equals(personObject2));
	System.out.println(personObject1.eyes);;
	
//	Person.eyes
	
	
	Student studentObject = new Student("Kirshna","India", "MIT");
	
	System.out.println(studentObject.getName()+"---"+studentObject.getAddress()+"----"+studentObject.getSchool());
}
}
