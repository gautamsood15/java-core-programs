class A extends Thread
{
	public void run(){
		for(int i=0;i<=10;i++){
		System.out.println("Thread A :"+i);
	}}

}

class B extends Thread
{
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("Thread B :"+i);
		}
	}
}


public class Thread2
{
	public  static void main(String[] args){
		A obja = new A();
		B objb = new B();


		obja.start();
		objb.start();
		
	}
}