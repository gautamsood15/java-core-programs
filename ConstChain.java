class A
{
	public A(){ System.out.println("A 1"); }
}

class B extends A
{
	public B(){ 
		this(1);
		System.out.println("B 1"); }

	public B(int k){
		super();
		System.out.println("B 2"); }
}

public class ConstChain{

	public static void main(String[] args)
	{
		B obj = new B();
		
	}
}