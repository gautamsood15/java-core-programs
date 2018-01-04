class A
{
	public void f1(int a){
	System.out.println("value of a is : "+a);
	}
}

class B extends A
{
	public void f1(int a,int b){
	System.out.println("value of a and b is : "+a+" and "+b);
	}
}


public class Overload
{
	public static void main(String[] args){
		A obja = new A();
		B objb = new B();
		obja.f1(1);
		objb.f1(2,4);
	
	}
}