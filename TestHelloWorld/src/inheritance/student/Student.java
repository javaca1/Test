package inheritance.student;

import inheritance.person.Person;

public class Student extends Person{

	
	public String school;
	public int rating;
	
	public Student(){
	}
	public Student(String name, String address, String school) {
		super(name, address);
		this.school = school;
	}
	
	public Student(String name, String address, String school, int rating) {
		super(name, address);
		this.school = school;
		this.rating = rating;
	}
	

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Student [school=" + school + ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rating;
		result = prime * result + ((school == null) ? 0 : school.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rating != other.rating)
			return false;
		if (school == null) {
			if (other.school != null)
				return false;
		} else if (!school.equals(other.school))
			return false;
		return true;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (school == null) {
//			if (other.school != null)
//				return false;
//		} else if (!school.equals(other.school))
//			return false;
//		return true;
//	}
	
	
	
	
	
}
