public class Exception3
{
	public static void main(String[] args){
		
		int bal = 6000;
		int with = 7000;


		try{
		if (bal<with)
		{
			throw new ArithmeticException("Insufficient balance");
		}

		bal-=with;
		System.out.println("reamining balance is :"+bal);
		}
		catch(ArithmeticException e){
			System.out.println("Exception :"+e.getMessage());
			
		}
		System.out.println("program contineus ......");
		}
}