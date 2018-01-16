class super1
{
	private int i;

	super1(){
	System.out.println("the value of i is :"+i);
	
	}

}

class derived1 extends super1
{

	derived1(){
	
		super();
	
	}


}

public class example1
{
	public static void main(String[] args){
	
	derived1 obj = new derived1(); 
	}
}