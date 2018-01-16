public class WrapperEcho
{
	public static void main(String[] args) 
	{
		int s=32;
		for(int i=0;i<args.length;i++){
		s=s+Integer.parseInt(args[0]);
		}
		System.out.println(s);
	}
}
