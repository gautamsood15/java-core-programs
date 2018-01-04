public class Access
{
	int a=11;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		inner.print(a);
	}

	public class inner
	{
		void print(int x){
		
		System.out.println(x);
		}
	}
}
