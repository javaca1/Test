
public class OverrideTest {
	public static void main(String[] args) {

//		Parent p =  new Parent();
		//System.out.println(p.getName());
		
		Child c = new Child();
		//System.out.println(c.getName());
		
		System.out.println(c.toString());
		
	}

}

class Parent {
	String name = "parent";

	public String getName() {
		return name;
	}
	
	@Override
	public String toString(){
		return name;
	}
}

class Child extends Parent {
	String cName = "Child";
	
	@Override
	public String getName(){
		return cName;
	}
	
	@Override
	public String toString(){
		System.out.println("i am in child class");
		System.out.println(super.toString());
		return "";
	}
	
}
