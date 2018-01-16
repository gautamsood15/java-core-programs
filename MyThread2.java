class MyThread2 extends Thread
{
	public void run(){
	
		for (int i =0;i<=10 ;i++)
			{

			System.out.println("run method :-"+i);
			i++;
		}
	}

	public static void main(String[] args){
	
		MyThread2 t = new MyThread2();
		t.start();
		for (int i =1;i<10 ;i++)
		{
			System.out.println("main method :-"+i);
			i++;

		}
		
	
	}
}