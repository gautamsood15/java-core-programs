public class Intitialization
{
	private int x;
	{
		System.out.println("Initialization:"+x);
		x = 5;
	
	}

	Intitialization(){
		System.out.println("Constructor:"+x);
	
	}
	public static void main(String[] args) 
	{
		Intitialization i1 = new Intitialization();
		Intitialization i2 = new Intitialization();
	}
}
