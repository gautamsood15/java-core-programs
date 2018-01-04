public class Constructor 
{

	int a; 
Constructor(){
a=0;
}
Constructor(int x){
	a=x;

}
	public static void main(String[] args) 
	{
		
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor(12);
		System.out.println(c1.a);
		System.out.println(c2.a);
	}
}
