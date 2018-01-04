class Greeting
{
	public void sayHello(){  System.out.println("Hello!");  }
}


class India
{
	Greeting obj = new Greeting(){
	
		public void sayHello(){  System.out.println("Namaste"); }
	
	};
}


public class Anonymous
{
	public static void main(String[] args){

		India india = new India();
		india.obj.sayHello();
		Greeting g1 = new Greeting();
	
	}
}