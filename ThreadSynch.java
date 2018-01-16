import java.util.Scanner;


class Account
{
	private int bal;
	
	
	public Account(int bal){
	this.bal = bal;
	}

	
	public Boolean isSuffBal(int w){
		if (bal>=w)
			return(true);
		else
			return(false);
	}

	
	public void withdrawl(int amt){

	bal=bal-amt;
	System.out.println("Withdrawl ammount :"+amt+"\n"+"Balance ammount :"+bal);
}

}


class Customer implements Runnable
{
	String name;
	private Account account;
	public Customer(Account account,String n){
		this.account = account;  
		name = n;
		}
	

	public void run(){
		synchronized(account){
		
		
		Scanner kb = new Scanner(System.in);
		System.out.println(name+",Enter amount to withdraw");
		int amt = kb.nextInt();
			
		if (account.isSuffBal(amt))
		{
			System.out.println(name+" :");
			account.withdrawl(amt);
		}
	 
		else System.out.println("Insuffiecient Balance");
	}
	}
	
}
public class ThreadSynch
{

	public static void main(String[] args){
		
		Account a1 = new Account(1000);
		Runnable c1 = new Customer(a1,"gautam"),c2 = new Customer(a1,"sood");
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
	}

}