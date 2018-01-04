import java.util.Scanner;

public class Array1
{
	public static void main(String[] args){
		
	int arr[];
	arr = new int[5];
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<5;i++){
		System.out.println("Enter your input here :");
		
		arr[i]= sc.nextInt();
	}
	System.out.println("Thnks for the input .Here's your array");
	for(int i=0;i<5;i++){
		System.out.print("arr["+i+"] = "+arr[i]+" ");
	}
		
	}
}