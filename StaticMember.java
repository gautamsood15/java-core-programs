class outer
{
	int x;
	static class inner{
			public static String country = "INDIA";
	}
	
}


public class StaticClass
{
	public static void main(String[] args){
		
		System.out.println(outer.inner.country);	

		
	}}