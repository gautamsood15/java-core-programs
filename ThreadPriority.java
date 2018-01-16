class A extends Thread
{
	public void run(){
	
		System.out.println("Name of thread :"+Thread.currentThread().getName());
		System.out.println("Priorityof thread :"+Thread.currentThread().getPriority());
	}
}


public class ThreadPriority
{
	public static void main(String[] args){
		A obj1 = new A();
		A obj2 = new A();
		obj1.setPriority(Thread.MIN_PRIORITY);
		obj2.setPriority(Thread.MAX_PRIORITY);
		obj1.start();
		obj2.start();
	
	}

}