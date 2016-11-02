
public class School {

	String name;
	String address;
	int noOfStudents;
	int noOfTeachers;
	int rating;
	
	public School(){
	}


	
	public School(int noOfStudents, int noOfTeachers, int rating) {
		super();
		///logic to assign value
		//10 lines of code
		
	}



	public School(String name, String address, int noOfStudents, int noOfTeachers, int rating) {
		this(noOfStudents,noOfTeachers,rating);
		this.name = name;
		this.address = address;
		//10 lines of code
		
	}

	
}
