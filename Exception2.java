public class Exception2
{
	public static void main(String[] args){
		try{
			System.out.println("Hello in try");
			System.out.println(3/0);
			System.out.println("second time Hello in try");
		}
		
		catch(NullPointerException e){
			System.out.println("Exception :"+e.getMessage() );
		}

		catch(ArithmeticException e){
			System.out.println("Exception :"+e.getMessage());
		}
		
		finally{
			System.out.println("hey! this is finally block");
		}
	System.out.println("The code is still running.");
	}
}