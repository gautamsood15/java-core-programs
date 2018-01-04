public class Cal
{
	public static void main(String[] args){
		int z =0;
		int x  = Integer.parseInt(args[0]);
		int y =  Integer.parseInt(args[1]);
		//char c = Character.parseChar(args[2]);
		
	/*	if(args[2] == "+"){  z = x+y; }
		else if(args[2] == "-"){ z=x-y; }
		else if(args[2] == "*"){  z=x*y; }
		else if(args[2] == "/"){  z=x/y;  }
		else {   System.out.println("the operator is invalid");}
*/
		String oper = args[2];

		switch(oper)
		{
		
		case "+": z = x+y;break;
		case "-": z = x-y;break;
		case "*": z = x*y;break;
		case "/": z = x/y;break;
		default : System.out.println("enter a valid operator");break;
		
		}


		System.out.println("the answer is :"+z);
	
	}
}