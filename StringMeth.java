/* import java.lang.String;
public class StringMeth
{
	public static void main(String[] args){
	
		String s1 = new String("Computer");
		System.out.println(s1);
		String s2 = s1.toLowerCase();
		System.out.println(s2);
		s2 = s1.toUpperCase();
		System.out.println(s2);
	}
}

*/

public class StringMeth
{
	public static void main(String[] args){
		String s1 = new String("coMputer");
		String s2 = new String("computer");	
		int i = s1.compareTo(s2);
		
		if(i==0){
			System.out.println("String are same");
		}
		else if(i>0){
			System.out.println("String s1 has the mismatched character greater");
		}
		else{
			System.out.println("String s1 has the mismatched character smaller");
		}
	}
	
	}
