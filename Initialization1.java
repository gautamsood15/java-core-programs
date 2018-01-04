public class  Initialization1
{
	static int k;
	static{
		System.out.println("Static block value of k: "+k);
		k=10;
	}

	Initialization1(){
	
		System.out.println("this is constructor");
	}
	public static void main(String[] args) 
	{
		Initialization1 i1 = new Initialization1();
		
		
		
	}
}

class Other
{
	public static void main(String[] args){
	
		System.out.println("Outer value of k :"+Initialization1.k);
	}

}