public class expseventwo
{
	public  static void main(String[] args){
		
		try{
			
			System.out.println("gautam : - "+1/0);
			throw new ArithmeticException("division by 0 not allowed");
			
		
		
		}
		
		catch(ArithmeticException e){
		
			System.out.println(e.getMessage());
		}
		
	}
}