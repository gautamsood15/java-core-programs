class Outer
{
	 static class Inner
	{
		void if1(){
			System.out.println("if1()");
		}
	}
}




public class StaticInnerClass
{
	public static void main(String[] args){
		
			
		Outer.Inner i1 = new Outer.Inner();
			i1.if1();
		
	}

}