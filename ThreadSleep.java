class A extends Thread 
{
	public void run(){
		for (int i=0;i<=10 ;i++ )
		{
			try{Thread.sleep(500);} catch(InterruptedException e){ System.out.println(e);}
		}
	System.out.println("hi obj");
	}
}

class ThreadSleep
{
	public static void main(String[] args){
	
		A obj1 = new A();
		A obj2 = new A();

		obj1.start();
		obj2.start();
	}
}