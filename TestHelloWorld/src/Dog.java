
public class Dog extends Animal {

	String legs = "4";
	String eyes = "2";

	public Dog(String name, String type, String legs, String eyes) {
		super(name, type);
		this.legs = legs;
		this.eyes = eyes;
	}

	public String getLegs() {
		return legs;
	}

	public void setLegs(String legs) {
		this.legs = legs;
	}

	public String getEyes() {
		return eyes;
	}

	public void setEyes(String eyes) {
		this.eyes = eyes;
	}

	@Override
	public String toString() {
		return "Dog [legs=" + legs + ", eyes=" + eyes + ", Animal()=" + super.toString() + "]";
	}

	public static void main(String[] args) {
		Animal a = new Animal("dog1", "dog");
		System.out.println(a.toString());
		Dog d = new Dog("DOG_ANIMAL", "DOG", "2", "4");
		System.out.println(d.toString());

	}

}
