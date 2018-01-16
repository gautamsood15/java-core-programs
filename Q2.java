import java.util.Scanner;
class Test implements Runnable
{
	static int s=10;

	public void run()
	{
		System.out.println("Total tickets available: "+s);
		check();
	}

	void check()
	{	
		int n;
		Scanner CIN=new Scanner(System.in);
		System.out.println("Tickets you want to buy: ");
		n=CIN.nextInt();
		if((n<=s)&&(s>0))
		{	
			System.out.println("Tickets booked for "+Thread.currentThread());
			s=s-n;
			System.out.println("Tickets available: "+s);
		}
		else
			System.out.println("Tickets not available");
	}
}
class Q2
{
	public static void main(String[] args)
	{
		Thread  t1=new Thread(new Test(),"TicketBook1");
		t1.start();
	
		Thread  t2=new Thread(new Test(),"TicketBook2");
		t2.start();
	}
}