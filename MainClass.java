import java.lang.Math.*;
import java.util.Scanner;
interface Int
{
	void division(int a,int b);
	void modules(int c);
}


class MainClass implements Int
{
	public void division(int a,int b){
	
		System.out.println("The division: "+a/b);
	}
	
	public void modules(int c){
	
		
		System.out.println("the  modulus  of the numebr is: "+Math.abs(c));
	
	}
	public static void main(String[] args){
		MainClass obj = new MainClass();
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y  = s.nextInt();
		
		obj.division(x,y);
		obj.modules(x);
	
	}
}