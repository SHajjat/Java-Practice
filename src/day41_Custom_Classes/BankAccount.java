package day41_Custom_Classes;

public class BankAccount {
	double balance;
	String accountHolder;
	int accountNumber;
	
	
	public void deposit (double amount) {
		
		System.out.println("Depositing $"+amount+ " to account number "+accountNumber);
		balance+=amount;
	}
	
	public void withdraw (int amount) {
		System.out.println("withdrawing $"+amount+" from "+accountNumber);
		 balance-=amount;
		 balance = balance >=0 ? balance :balance-35;
	}
	
	public void showBalance () {
		System.out.println("=============================");
		System.out.println("accountHolder: "+accountHolder);
		System.out.println("accountNumber: "+accountNumber);
		System.out.println("account balance: "+balance);
	}
	
	public void charge(double price) {
		String msg = balance >=price ? "transaction made":"Sorry no money no honey";
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount();
		
		account1.accountHolder = "Samir Hajjat";
		account1.balance = 6052.3;
		account1.accountNumber = 32324543;
		account1.showBalance();
		account1.deposit(100.2);
		account1.withdraw(10);
		account1.showBalance();
		account1.charge(100);
		
		
	}

}
