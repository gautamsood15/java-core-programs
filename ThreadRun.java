class A extends Thread
{
	public void run(){
	
		System.out.println("running..........");
		for (int i=0;i<=10 ;i++ )
		{
			System.out.println(i);
		}
	
	}
}

public class ThreadRun
{
	public static void main(String[] args){
	A obj1=new A();
	A obj2=new A();

	obj1.run();
	obj2.run();
	
	}
}