
public class AccountTest {

	public static void main(String[] args) {

		Account xAccount = new Account("Kishore", 500); 
		Account yAccount = new Account("Aravind", 600); 
		Account zAccount = new Account("Krishna", 700); 
		
		System.out.println("account Values:"+xAccount);
		System.out.println("account Values:"+yAccount);
		System.out.println("account Values:"+zAccount);
		
		
		xAccount.withdraw(100);
		yAccount.withdraw(100);
		zAccount.withdraw(100);
		
		System.out.println("account Values:"+xAccount);
		System.out.println("account Values:"+yAccount);
		System.out.println("account Values:"+zAccount);
		
		
	}

}
