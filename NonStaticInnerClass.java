class Outer
{
	static int x=2;
	int y=3;
	void of1(){  System.out.println("of1()"+x+y);   }
	class Inner
	{
		void if1(){  System.out.println("if1()"+x+y);  }
		
	}
}


public class NonStaticInnerClass
{
	public static void main(String[] args){
		Outer out = new Outer();
		Outer.Inner o1 = out.new Inner();
		o1.if1();
		out.of1();
		//System.out.println(o1.x);
	}



}