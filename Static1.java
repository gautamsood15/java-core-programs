public class Static1
{
	int a =10;
	static int b = 20;

	static void m1(Static1 s){
		
		System.out.println(s.a);
		System.out.println(Static1.b);
	}
	public static void main(String[] args) 
	{

		Static1 s1 = new Static1();
		System.out.println(s1.a);
		System.out.println(Static1.b);
		m1(s1);
	}
}
