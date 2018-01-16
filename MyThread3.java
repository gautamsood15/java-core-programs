class MyThread3 extends Thread
{
	static int count;
	
	synchronized public void run(){
	
			for (int i=0;i<5;i++)
			{
				MyThread3.count+=1;
				System.out.println("Run Method :-"+MyThread3.count);
			}
	
					
	
	}

	public static void main(String[] args){
	
		MyThread3 t = new MyThread3();
		t.start();
		for (int i=0;i<5;i++)
		{
			MyThread3.count+=1;
			System.out.println("Main Method :-"+MyThread3.count);
			
		}
	
	}
}