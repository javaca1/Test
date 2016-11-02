
public class Account {

	
	String person;
	double balance;
	
	public Account(){
	}
	
	public Account(String person, double balance) {
		this.person = person;
		this.balance = balance;
	}

	public void deposit(double amount){
		balance = amount;
	}
	
	public double withdraw(double amount){
		balance = balance-amount;
		return balance;
	}
	
	public double printBalance(){
		return this.balance;
	}

	@Override
	public String toString() {
		return "Account [person=" + person + ", balance=" + balance + "]";
	}
	
	
}
