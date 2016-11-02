
public class OverloadTest {
	public static void main(String[] args) {
		Compute cp = new Compute();
		System.out.println(cp.sum(2, 3));

		System.out.println(cp.sum(2, 3, 4));

		System.out.println("HelloWorld".startsWith("World", 5));
		System.out.println("HelloWorld".startsWith("Hello"));

		System.out.println("HelloWorld".indexOf('l'));
		System.out.println("HelloWorld".indexOf('l', 4));

		String s1 = new String("HelloWorld");
		String s2 = new String();
		String s3 = new String(new char['c']);
	}
}

 class Compute {
	 
	public Compute() {
	}

	public Compute(int a, int b) {
		//
	}

	public Compute(long a, long b) {
		// todo
	}

	/// overloaded means no.of params or types of params
	public int sum(int a, int b) {
		return a + b;
	}

	public long sum(int a, long b) {
		return (long) a + b;
	}

	public double sum(double a, double b) {
		return a + b;
	}

	public int sum(int i, int j, int k) {
		return i + j + k;
	}

}
