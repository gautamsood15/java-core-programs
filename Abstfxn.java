/* abstract class A
{
	 public void show(){
		System.out.println("show() in class A"); 
	 }
}

class B extends A
{


}

public class Abstfxn
{
	public static void main(String[] args)
	{	
	B obj = new B();
	obj.show();
}
}

*/


abstract class A
{
	//abstract void show();
void show(){
			System.out.println("this function is taken from class A");
			}
}

class B extends A
{
/*	void show(){System.out.println("this function is taken from class A");
			}  */
}

public class Abstfxn
{
	public static void main(String[] args){
	A obj = new B();
	obj.show();
}
}