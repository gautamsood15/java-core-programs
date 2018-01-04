class Outer
{
	static int x=10;
	private class Inner
	{
		void if1(){
			System.out.println("if1()"+x);
			
			
		}

	}
}

public class PrivateInnerClass
{
	public static void main(String[] args){
	
		Outer out = new Outer();
		Outer.Inner o1 = out.new Inner();  //cannot access Inner classes members as it is accessing members out of Private inner class

		o1.if1();
	
	}
}