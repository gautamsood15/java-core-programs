import java.lang.String;

public class String1
{
	public static void main(String[] args){
	
		String s1 = "Bond";
		String s2 = "Bond";
		String s3 = new String("Bond");
		String s4 = "Gautam";
		s4 += "Sood";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s4);
	}
}