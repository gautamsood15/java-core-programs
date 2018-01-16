import java.util.Scanner;

class Reservation implements Runnable
{
  public void run()
	{   int a,b;
        Scanner sca=new Scanner(System.in);
        System.out.println("enter no. of tickets =");
		a=sca.nextInt();
		b=availability.ava(a);
		if(b==1){
		tic.seat=tic.seat-a;
		System.out.println("seat available ="+tic.seat);
	     }
		 else System.out.println("seat no available");

}
}
class availability
{
     public static int ava(int x)
	{ if(x<=tic.seat)
		 return 1;
	   else 
		   return 0;
	}
 }

class  tic
{   public static int seat=10;

	public static void main(String[] args) 
	{
        Reservation a=new Reservation();
	
	Thread t1=new Thread(a);
	Thread t2=new Thread(a);
	     t1.start();
		 t2.start();
	}


}