interface test
{
	void square();
}


class arithmetic implements test
{
	public void square(){
		System.out.println("This is a square function");
	
	
	}
}



class TotTestInt extends arithmetic
{
	public static void main(String[] args){
	arithmetic a1 = new arithmetic();
	a1.square();
}}