class A
{
int z;
public void f1(){
	System.out.println("super class function in use");

}
}
class B extends A
{
	int z; 
	public void f1(){
		System.out.println("sub class function in use");
		super.f1();	
	}

	public void f2(){
		int z;
		z=2;
		this.z=3;
		super.z=1;
		System.out.println("This is super variable: "+super.z);
		System.out.println("This is a instance variable: "+this.z);
		System.out.println("This is a local variable: "+z);
	}
}
public class super1
{
	public static void main(String[] args){
		
		B obj = new B();
		obj.f1();
		obj.f2();
		
	}
}