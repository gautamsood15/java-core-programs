interface i1
{
	public void f1();
}

interface i2
{
	public void f2(); 
}

interface i3
{
	public void f3();  
}

abstract class A 
{
	abstract public void f4();
}
class B extends A implements i1,i2,i3
	{
	public void f4(){
		System.out.println("function of interface 4"); 
		}
	public void f1(){ 
		System.out.println("function of interface 1");
		}
	public void f2(){ 
		System.out.println("function of interface 2"); 
		}
	public void f3(){ 
		System.out.println("function of interface 3");
		} 


}


public class Interface
{

	public static void main(String[] args){
		B obj = new B();
		obj.f1();
		obj.f2();
		obj.f3();
		obj.f4();
	}
}