import java.util.*;
public class Test
{

	void largest(int a,int b,int c){
		
	 if(a>b && a>c){
		
		System.out.println("largest number is : "+a);
		
		}
		else  if(b>a && b>c){
		
		System.out.println("largest number is : "+b);
		
		}
		
		else{
		
		System.out.println("largest number is : "+c);
		}
}

	void smallest(int a,int b,int c){
	
	 if(a<b && a<c){
		
		System.out.println("smallest number is : "+a);
		
		}
		else  if(b<a && b<c){
		
		System.out.println("smallest number is : "+b);
		
		}
		
		else{
		
		System.out.println("smallest number is : "+c);
		}
	
	
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		System.out.println("Enter 3 distinct integer numbers");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = s1.nextInt();
		int c = s1.nextInt();
		//int a = Integer.parseInt(args[0]);
		//int b = Integer.parseInt(args[1]);
		//int c = Integer.parseInt(args[2]);

		if((b == a) || (b == c) || (a == c)){
			System.out.println("Enter valid input i.e distinct");
		
		}
		Test t1 = new Test();
		
		t1.largest(a,b,c);
		t1.smallest(a,b,c);

	}
}
