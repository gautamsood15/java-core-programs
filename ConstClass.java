interface A
{
	int a=10;
	int b=20;

}

class ConstClass implements A
{
	
	public static  void main(String []args){
	int c=a+b;

	System.out.println("the numbers are : "+a+" "+b+" "+c);
}}